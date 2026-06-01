import java.util.Arrays;

public class sorting {

    // Print Array
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Bubble Sort
    public static void bubbleSortDescending(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
        
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSortDescending(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int maxPos = i; 
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSortDescending(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            
            while(prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    // Counting Sort
    public static void countingSortDescending(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        
        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        
        int j = 0;

        for(int i = count.length - 1; i >= 0; i--) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]) {
        // The Vault
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        
        System.out.println("--- Original Array ---");
        printArr(arr);
        System.out.println();

        
        System.out.println("1. Bubble Sort:");
        int bubbleArr[] = Arrays.copyOf(arr, arr.length);
        bubbleSortDescending(bubbleArr);
        printArr(bubbleArr);
        
        System.out.println("\n2. Selection Sort:");
        int selectionArr[] = Arrays.copyOf(arr, arr.length);
        selectionSortDescending(selectionArr);
        printArr(selectionArr);
        
        System.out.println("\n3. Insertion Sort:");
        int insertionArr[] = Arrays.copyOf(arr, arr.length);
        insertionSortDescending(insertionArr);
        printArr(insertionArr);
        
        System.out.println("\n4. Counting Sort:");
        int countingArr[] = Arrays.copyOf(arr, arr.length);
        countingSortDescending(countingArr);
        printArr(countingArr);
    }
}