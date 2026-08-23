import java.util.List;
import java.util.ArrayList;

public class Quicksort {
    public static List<Integer> sort (List<Integer> list){
        
        if (list.size() < 2){
            return list;
        }

        List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>(); 


        int pivot = list.get(0);

        for (int i=1; i< list.size(); i++){
            int x = list.get(i);
            if(x <= pivot){
                less.add(x);
            }
            else{
                more.add(x);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(sort(less));
        result.add(pivot);
        result.addAll(sort(more));

        return result;
        
    }

    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>(List.of (4,5,32,4234,553,63));
        System.out.println(sort(arr)); 
    }
}