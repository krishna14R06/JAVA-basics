import java.util.*;
public class basicsD2{
    public static void main(String args[]){

        // Q1 Greater amoung 3 num
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 3 nums:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

    if(A==B && B==C){
        System.out.println("All 3 num are Equal!");
    }    
    else if(A>B && A>C){
        System.out.println("A is Greater");
    }
    else if(B>A && B>C){
        System.out.println("B is Greater");
    }
    else if(C>A && C>B){
        System.out.println("C is Greater");
    }
    else{
        System.out.println("Any 2 num are Equal");
    }
    
    // Q2 Positive and Negative finder
    System.out.println("Enter any num");
    int Num = sc.nextInt();
    if(Num>=0){
        System.out.println("Your num is POSITIVE");
    } else {
        System.out.println("Your num is NEGATIVE");
    }
    
    // Q3 Weeks day !
    System.out.println("Enter any (1-7) to get the day");
    int Weeknum = sc.nextInt();
    switch(Weeknum){
        case 1:
            System.out.print("monday");
            break;
        case 2:
            System.out.print("tuesday");
            break;
        case 3:
            System.out.print("wednesday");
            break;
        case 4:
            System.out.print("thursday");
            break;
        case 5:
            System.out.print("friday");
            break;
        case 6:
            System.out.print("saturday");
            break;
        case 7:
            System.out.print("sunday");
            break;
    }



    sc.close();}
}