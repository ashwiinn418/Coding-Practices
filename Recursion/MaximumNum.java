public class MaximumNum{
    
    public static int max(int[] arr, int i){
        if (i == arr.length - 1){
            return arr[i];
        }

        int maxRest = max(arr, i+1);

        return arr[i] > maxRest ? arr[i] : maxRest; 
    }
    
    public static void main (String args[]){
        int[] arr = {1,3,44,56,77,34,45};
        System.out.println(max(arr,0));
    }
}