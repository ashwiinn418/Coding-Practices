import java.util.*;

public class Bfs{
    public static int ShortestPath(Map<String, List<String>>graph, String start, String target){
        
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        int distance = 0;

        while(!queue.isEmpty()) {

            int size = queue.size();

            for(int i = 0; i < size; i++){

                String current = queue.poll();

                //Target Found
                if(current.equals(target)){
                    return distance;
                }

                for (String neighbor : graph.get(current)) {

                    if(!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }

            distance++;
        } 

        return -1; //target not reachable
    }

    public static void main(String args[]){

        Map<String, List<String>> graph = new HashMap<>();

        graph.put("CAB", Arrays.asList("CAT", "CAR"));
        graph.put("CAT", Arrays.asList("MAT", "BAT"));
        graph.put("CAR", Arrays.asList("BAR", "CAT"));
        graph.put("MAT", Arrays.asList("BAT"));
        graph.put("BAR", Arrays.asList("BAT"));
        graph.put("BAT", new ArrayList<>());

        int answer = ShortestPath(graph, "CAB", "BAT");

        System.out.println(answer);
    }
}