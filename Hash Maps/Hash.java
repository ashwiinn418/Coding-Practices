import java.util.*;

public class Hash{
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ashwin", 90);
        map.put("Rohit", 88);
        map.put("ssd", 232);

        System.out.println(map.get("Ashwin"));

        System.out.println(map.containsKey("Rahul"));

        map.put("Ashwin", 95);

        map.remove("ssd");

        System.out.println(map);
    }
}