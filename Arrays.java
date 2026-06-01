public class Arrays {

    // --- TOOL 1: Linear Search ---
    public static int linearSearch(int num[], int search) {
        for(int i = 0; i < num.length; i++) {
            if(search == num[i]) {
                return i;
            }
        }
        return -1;
    }

    // --- TOOL 2: Find Largest Value --
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
        while(start<end){
            int temp = reverseArr[start];
            reverseArr[start] = reverseArr[end];
            reverseArr[end] = temp;
            start++;
            end--;
        }
    }
    // --- TOOL 5: pairs of Array ---
    public static void pairArr(int num[]){
        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j<num.length; j++){
                System.out.print("(" + num[i] + "," + num[j] + ") ");
            }
            System.out.println("");
        }
    }

    // --- TOOL 6: Subarray ---
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
    }}

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
        System.out.println("The Maximum Subarray Sum is: " + maxSum);}
    
    public static void main(String args[]) {
        // Data Vaults
        int num[] = {1, 2, 3, 4, 5, 6};
        int sortedarr[] = {3, 6, 9, 12, 15, 18};
        int reverseArr[] = {4,2,7,3,0,5};
        
        // Search Targets
        int search = 4;
        int search2 = 3;

        // Executing Tool
        int linearindex = linearSearch(num, search);
        System.out.println("For your linear search value index is:" + linearindex);

        int largestvalue = largestInArr(num);
        System.out.println("Largest value in your Array is: " + largestvalue);
        
        int binindex = binarySearch(sortedarr, search2);
        if(binindex != -1) {
            System.out.println("Your num is at index " + binindex);
        } else {
            System.out.println("Your num not found");
        }

        reverse(reverseArr);
        for(int i=0; i<reverseArr.length; i++){
        System.out.print(reverseArr[i] + " ");
        }System.out.println();
        
        pairArr(num);
        subArr(num);

        int numbers[] = {2, 4, 6, 8};
        System.out.println("--- Testing Maximum Subarray Sum ---");
        maxSubarraySum(numbers);
    }
}