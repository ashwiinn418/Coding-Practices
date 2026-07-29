import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SelectionSort {

    public static int findSmallest(List<Integer> arr){
        int smallest = arr.get(0);
        int smallestIndex = 0;

        for (int i=0; i < arr.size(); i++){
            if(arr.get(i) < smallest){
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static List<Integer> selectionsort(int[] arr){
        List<Integer> copiedArr = new ArrayList<>();
        
        for (int num : arr){
            copiedArr.add(num);
        } 

        List<Integer> newArr = new ArrayList<>();

        while (!copiedArr.isEmpty()) {
            int smallest = findSmallest(copiedArr);
            newArr.add(copiedArr.remove(smallest));
        }

        return newArr;
    }

    // test cases
    public static void main(String[] args) {
        int [] arr = {5,15,4,7,99,6};
        System.out.println(selectionsort(arr));
    }
    
}