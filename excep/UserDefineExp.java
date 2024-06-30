package excep;

import java.util.Scanner;

/**
 * UserDefineExp
 */
public class UserDefineExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int a = sc.nextInt();
        
        try {
            if (a < 18) {
                MyException ao = new MyException("Test Failed");
                throw ao; 
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e); // It's better to use e.getMessage() to print the exception message
        } finally {
            sc.close(); // Ensure the scanner is closed to prevent resource leak
        }
    }
    
    // Define MyException as a static nested class
    public static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
}
