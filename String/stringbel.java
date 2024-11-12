package String;

public class stringbel {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("Morning");
        System.out.println(s);
        s.insert(0, "Good");
        System.out.println(s.charAt(0));
    }
}
