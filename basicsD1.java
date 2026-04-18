import java.util.*;
public class basicsD1{
    public static void main(String args[]){
        // Q1 greater no. b/w them 
        int a = 5;
        int b = 5;
        if(a>b){
            System.out.println("A is Greater");}
        else{
            System.out.println("B is Greater");}
        
        // Q2 ODD or EVEN 
        int N = 6;
        if(N%2 == 0){
            System.out.println("NUM is Even");
        }
        else{
            System.out.println("NUM is Odd");
        }

        // Q3 else if 
        int age = 11;

        if(age > 18){
            System.out.println("Adult");
        }
        else if (age < 18 && age >= 12){
            System.out.println("Teenage");
        }
        else {
            System.out.println("Child");
        }

        // Q4 tax calculator
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income<500000){
            tax = 0;
            System.out.println("No Tax");
        }
        else if (income>=500000 && income<1000000){
            tax = (int)(income*0.2);
            System.out.println("20% Tax");
        }
        else {
            tax = (int)(income*.3);
            System.out.println("30% tax");
        }
        System.out.println("Your Tax is:" + tax);
        sc.close();
        }
    }