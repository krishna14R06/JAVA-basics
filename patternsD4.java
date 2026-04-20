import java.util.*;

public class patternsD4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size (n) for the patterns: ");
        int n = sc.nextInt();
        
        System.out.println("\n--- Pattern 1: Hollow Rectangle ---");
        int columns = n + 1; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == n || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 2: Inverted Half-Pyramid ---");
        for(int a = 1; n >= a; a++){
            for(int b = 1; (n - a + 1) >= b; b++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 3: 180-Degree Leaning Pyramid ---");
        for(int a = 1; n >= a; a++){
            for(int b = 1; b <= (n - a); b++){
                System.out.print(" ");
            }
            for(int c = 1; c <= a; c++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 4: Number Half-Pyramid ---");
        for(int a = 1; n >= a; a++){
            for(int b = 1; a >= b; b++){
                System.out.print(b);
            }
            System.out.println();
        }
        
        sc.close();
    }
}