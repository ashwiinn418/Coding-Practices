import java.util.*;

public class DijkstraAlgo{
    //Finding the lowest cost node
    public static String findLowestCostNode(
            HashMap<String, Integer> costs, 
            HashSet<String> processed){
        
        String lowestNode = null;
        int lowestCost = Integer.MAX_VALUE;

        for (String node : costs.keySet()) {

            if (!processed.contains(node) && costs.get(node) < lowestCost) {
                lowestCost = costs.get(node);
                lowestNode = node;
            }
        }

        return lowestNode;

    }

    public static void main (String args []) {

        //Graph
        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();

        graph.put("start", new HashMap<>());
        graph.put("a", new HashMap<>());
        graph.put("b", new HashMap<>());
        graph.put("fin", new HashMap<>());
        
        graph.get("start").put("a", 6);
        graph.get("start").put("b", 2);

        graph.get("a").put("fin", 1);

        graph.get("b").put("a", 3);
        graph.get("b").put("fin", 5);

        //Costs
        HashMap<String, Integer> costs = new HashMap<>();

        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("fin", Integer.MAX_VALUE);
        
        //Parents
        HashMap<String, String> parents = new HashMap<>();

        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);

        //Processed Nodes
        HashSet<String> processed = new HashSet<>();

        //Dijkstra
        String node = findLowestCostNode(costs, processed);

        while(node != null) {

            int cost = costs.get(node);

            HashMap<String , Integer> neighbours = graph.get(node);

            for(String n : neighbours.keySet()){
                int newCost = cost + neighbours.get(n);

                if(costs.get(n) > newCost){
                    
                    costs.put(n, newCost);
                    parents.put(n, node);
                }

            }
            
            processed.add(node);

            node = findLowestCostNode(costs, processed);           
            
        }

        System.out.println("Shortest costs:");
        System.out.println(costs);

        System.out.println("Parents:");
        System.out.println(parents);              
        
    }
}