import java.util.*;
public class FMD5{

    // Q To find product 
    public static void sum(int a, int b){
        int sum = a*b;
        System.out.println("Your product of given num is:" + sum);
    }

    // Q To find the factorial of num 
    public static int factorial(int f){
        int fac = 1;
        for(int i = 1; i<=f; i++){
            fac = fac*i;
        } return fac;
    }

    // Q To find binomial coefficent 
    public static int bincoeff(int n, int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n-r);
        int bincoeff = fac_n/(fac_r*fac_nmr);
        return bincoeff;
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two num to find its product !");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
        System.out.println("Enter num to find its factorial:");
        int c = sc.nextInt();
        int fac = factorial(c);
        System.out.println("Your factorial is:" + fac);
        
        
        System.out.println("Enter N & R");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int bincoeff = bincoeff(n,r);
        System.out.println("Your bincoeffficent is:" + bincoeff);

        sc.close();
    }
}
