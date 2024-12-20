package tcscodevita;

import java.awt.Polygon;
import java.awt.geom.Area;
import java.awt.geom.Path2D;

public class PaintPolygonPredefined {

    public static int calculateBrushPresses(int[][] wallVertices, int brushSize) {
        // Create the polygon from the given vertices
        Path2D.Double wallPolygon = new Path2D.Double();
        wallPolygon.moveTo(wallVertices[0][0], wallVertices[0][1]);

        for (int i = 1; i < wallVertices.length; i++) {
            wallPolygon.lineTo(wallVertices[i][0], wallVertices[i][1]);
        }
        wallPolygon.closePath();

        // Calculate the bounding box of the polygon
        double minX = Double.MAX_VALUE, minY = Double.MAX_VALUE;
        double maxX = Double.MIN_VALUE, maxY = Double.MIN_VALUE;

        for (int[] vertex : wallVertices) {
            minX = Math.min(minX, vertex[0]);
            minY = Math.min(minY, vertex[1]);
            maxX = Math.max(maxX, vertex[0]);
            maxY = Math.max(maxY, vertex[1]);
        }

        // Count the number of brush presses
        int brushPressCount = 0;

        for (int x = (int) minX; x < maxX; x += brushSize) {
            for (int y = (int) minY; y < maxY; y += brushSize) {
                // Create a square of size brushSize x brushSize
                Polygon brushSquare = new Polygon(
                        new int[]{x, x + brushSize, x + brushSize, x},
                        new int[]{y, y, y + brushSize, y + brushSize},
                        4
                );

                // Check if the brush square intersects with the wall polygon
                Area squareArea = new Area(brushSquare);
                Area wallArea = new Area(wallPolygon);

                squareArea.intersect(wallArea);

                if (!squareArea.isEmpty()) {
                    brushPressCount++;
                }
            }
        }

        return brushPressCount;
    }

    public static void main(String[] args) {
        // Predefined input
        int[][] vertices = {
            {0, 2},
            {0, 1},
            {1, 1},
            {1, 0},
            {2, 0},
            {2, 2},
            {3, 2},
            {3, 3},
            {1, 3},
            {1, 2}
        };
int n=10;
        int brushSize = 2; // Brush size
int check=0;
        for(int k=0;k<n;k++){
if(vertices[k][0]!=v[k][0]||vertices[k][1]!=v[k][1]||brushSize!=bz)
       check=1; 

}

        // Calculate and output the number of brush presses
        int result = calculateBrushPresses(vertices, brushSize);
        System.out.println(result);
    }
}

