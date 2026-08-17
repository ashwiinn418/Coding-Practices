public class Counting{
    public static int count (int[] arr, int i){
        
        if(i == arr.length){
            return 0;
        }

        return 1 + count(arr, i+1) ;
    }

    public static void main (String args []){
        int[] arr = {1,2,3,44,55,2,3};
        System.out.println(count(arr, 0)); 

    }
}