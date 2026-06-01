import java.util.*;

public class ArrayPrac {

    // --- TOOL 1: Linear Search ---
    public static int linearSearch(int num[], int search) {
        for(int i = 0; i < num.length; i++) {
            if(search == num[i]) {
                return i;
            }
        }
        return -1;
    }

    // --- TOOL 2: Find Largest Value ---
    public static int largestInArr(int num[]) {
        int largest = Integer.MIN_VALUE; 
        for(int i = 0; i < num.length; i++) {
            if(largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    // --- TOOL 3: Binary Search ---
    public static int binarySearch(int sortedarr[], int search2) {
        int start = 0;
        int end = sortedarr.length - 1; 
        
        while (start <= end) {          
            int mid = (start + end) / 2;
            
            if(search2 == sortedarr[mid]) {
                return mid;
            } else if(search2 < sortedarr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            } 
        }
        return -1;
    }

    // --- TOOL 4: Reverse Array ---
    public static void reverse(int reverseArr[]){
        int start = 0;
        int end = reverseArr.length - 1;
        while(start < end){
            int temp = reverseArr[start];
            reverseArr[start] = reverseArr[end];
            reverseArr[end] = temp;
            start++;
            end--;
        }
    }

    // --- TOOL 5: Pairs of Array ---
    public static void pairArr(int num[]){
        for(int i = 0; i < num.length; i++){
            for(int j = i + 1; j < num.length; j++){
                System.out.print("(" + num[i] + "," + num[j] + ") ");
            }
            System.out.println("");
        }
    }

    // --- TOOL 6: Print Subarrays ---
    public static void subArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                System.out.print("["); 
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " "); 
                }
                System.out.print("] "); 
            }
            System.out.println(); 
        }
    } 

    // --- TOOL 7: Max Subarray Sum (Brute Force O(N^3)) ---
    public static void maxSubarraySum(int num[]) {
        int maxSum = Integer.MIN_VALUE; 
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int currSum = 0; 
                for (int k = i; k <= j; k++) {
                    currSum += num[k]; 
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The Maximum Subarray Sum (Brute Force) is: " + maxSum);
    } 

    // --- TOOL 8: Max Subarray Sum (Prefix Sum O(N^2)) ---
    public static void prefixSum(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        
        prefix[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The Maximum Subarray Sum (Prefix) is: " + maxSum);
    }

    // --- TOOL 9: Max Subarray Sum (Kadane's Algorithm O(N)) ---
    public static void kadanes(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for (int i = 0; i < num.length; i++) {
            currSum = currSum + num[i];
            
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("The Maximum Subarray Sum (Kadane's) is: " + maxSum);
    }

    // --- CONTROL CENTER ---
    public static void main(String args[]) {
        
        // 1. Data Vaults
        int num[] = {1, 2, 3, 4, 5, 6};
        int sortedarr[] = {3, 6, 9, 12, 15, 18};
        int reverseArr[] = {4, 2, 7, 3, 0, 5};
        
        // Target numbers for searching
        int search = 4;
        int search2 = 3;

        // 2. Executing Search & Max Tools
        System.out.println("--- 1. Basic Operations ---");
        int linearindex = linearSearch(num, search);
        System.out.println("For your linear search, value index is: " + linearindex);

        int largestvalue = largestInArr(num);
        System.out.println("Largest value in your Array is: " + largestvalue);
        
        int binindex = binarySearch(sortedarr, search2);
        if(binindex != -1) {
            System.out.println("Your num is at index " + binindex + " via Binary Search");
        } else {
            System.out.println("Your num not found in Binary Search");
        }

        // 3. Executing Manipulation Tools
        System.out.println("\n--- 2. Array Manipulation ---");
        System.out.print("Reversed Array: ");
        reverse(reverseArr);
        for(int i = 0; i < reverseArr.length; i++){
            System.out.print(reverseArr[i] + " ");
        }
        System.out.println("\n");
        
        // 4. Executing Combinatorial Tools
        System.out.println("--- 3. Pairs and Subarrays ---");
        System.out.println("All Pairs in num[]:");
        pairArr(num);
        
        System.out.println("\nAll Subarrays in num[]:");
        subArr(num);

        // 5. Executing Maximum Subarray Sum Tools
        System.out.println("\n--- 4. Maximum Subarray Sum (FAANG Question) ---");
        
        // Using an array with negative numbers to properly test Kadane's power
        int complexNumbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Testing Array: [-2, -3, 4, -1, -2, 1, 5, -3]");
        
        maxSubarraySum(complexNumbers); // Tool 7
        prefixSum(complexNumbers);      // Tool 8
        kadanes(complexNumbers);        // Tool 9
    }
}