import java.util.*;


public static int LinSearch(int num[], int search){ //Q1 linear Search of an array
    for(int i = 0; i < num.length; i++){
        if(search == num[i]){
            return i;
        }
    }return -1;
}

public static int LargestinArr(int num[], int largest){ //Q2 finding largest value in the array
    for(int i = 0; i < num.length; i++){
        if(largest < num[i]){
            largest = num[i];
        }
    }return largest;
}

public static int Binarysearch(int sortedarr[], int target){
    int start = 0;
    int end = sortedarr.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(target == sortedarr[mid]){
            return mid;
        }else if(target < sortedarr[mid]){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
    }
    return -1;
}
public static void main(String args[]){
    int num[] = {2, 5, 1, 8, 9, 4};
    int sortedarr[] = {3, 6, 9, 12, 15, 18};
    int search2 = 3;
    int search = 4;
    int largest = Integer.MIN_VALUE;

    int index = LinSearch(num, search);
    int largestvalue = LargestinArr(num, largest);
    System.out.println("Largest value in your Array is:" + largestvalue);
    if(index != -1 ){
        System.out.println("Your num is at index " + index);
    }else{
        System.out.println("Your num not found");
    }

    int index2 = Binarysearch(sortedarr, search2);
    if(index2 != -1){
        System.out.println("Binary search found at index " + index2);
    }else{
        System.out.println("Binary search not found");
    }
}