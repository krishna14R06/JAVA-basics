// import java.util.*;

public class patternsD4 {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the box (Rows):");
        // int n = sc.nextInt();
        
        // int columns = n + 1; 

        // for (int i = 1; i <= n; i++) {
            
        //     for (int j = 1; j <= columns; j++) {
                
        //         if (i == 1 || i == n || j == 1 || j == columns) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" "); 
        //         }
        //     }
        //     System.out.println();
        // }
        int n = 4;
        // for(int a = 1; n>=a; a++){
        //     for(int b =1;(n-a+1)>=b; b++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        for(int a = 1; n>=a; a++){
            for(int b = 1; b<=(n-a); b++){
                System.out.print(" ");
            }
            for(int c = 1; c<=a; c++){
                System.out.print("*");
            }System.out.println();
        }

        // sc.close();
    }
}