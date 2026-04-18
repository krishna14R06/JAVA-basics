import java.util.*;

public class loopD3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Q1: Print Numbers 1 to 10 ---");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        System.out.println("--- Q2: Print Numbers 0 to N ---");
        System.out.print("Enter value of N: ");
        int n1 = sc.nextInt();
        int m1 = 0;
        while (m1 <= n1) {
            System.out.print(m1 + " ");
            m1++;
        }
        System.out.println("\n");

        System.out.println("--- Q3: Sum of first N natural numbers ---");
        System.out.print("Enter value of N for sum: ");
        int n2 = sc.nextInt();
        int m2 = 1; 
        int sum = 0;
        while (m2 <= n2) {
            sum = sum + m2;
            m2++;
        }
        System.out.println("Your sum is: " + sum + "\n");

        System.out.println("--- Q4: Reverse a given number (While Loop) ---");
        System.out.print("Enter a number to reverse: ");
        int num1 = sc.nextInt();
        int rev1 = 0;
        while (num1 > 0) {
            int lastv = num1 % 10;
            rev1 = (rev1 * 10) + lastv;
            num1 = num1 / 10;
        }
        System.out.println("Reversed number: " + rev1 + "\n");

        System.out.println("--- Q5: Reverse a given number (For Loop) ---");
        System.out.print("Enter another number to reverse: ");
        int num2 = sc.nextInt();
        int rev2 = 0;
        for (; num2 > 0; num2 = num2 / 10) {
            int lastv = num2 % 10;
            rev2 = (rev2 * 10) + lastv;
        }
        System.out.println("Reversed number: " + rev2 + "\n");

        System.out.println("--- Q6: The 'Break' Topic ---");
        System.out.println("Enter numbers. Loop breaks if you enter a multiple of 10.");
        do {
            System.out.print("Enter a number: ");
            int l = sc.nextInt();
            if (l % 10 == 0) {
                System.out.println("Multiple of 10 detected. Breaking loop.");
                break;
            }
            System.out.println("Your num is: " + l);
        } while (true);

        sc.close();
    }
}