import java.util.*;

public class Greedy{

    public static void main(String args[]){

        // States needed to cover
        Set<String> statesNeeded = new HashSet<>(Arrays.asList( "mt", "wa", "or", "id", "nv", "ut", "ca", "az"));

        //Station and states covered

        Map<String, Set<String>> stations = new HashMap<>();

        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));

        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "mt", "id")));

        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));

        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));

        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        //Stations Selected
        Set<String> finalStations = new HashSet<>(); 

        while(!statesNeeded.isEmpty()) {
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();

            for(String station : stations.keySet()) {
                
                Set<String> covered = new HashSet<>(stations.get(station));

                //keep only the states that are still needed
                covered.retainAll(statesNeeded);

                if(covered.size()> statesCovered.size()) {
                    bestStation = station;
                    statesCovered = covered;
                }
            }

            //if no station can cover any remaining state
            if(bestStation == null){
                break;
            }

            //add the best station
            finalStations.add(bestStation);

            //remove the states covered by this station
            statesNeeded.removeAll(statesCovered);
        }

        System.out.println("Stations selected:");
        System.out.println(finalStations);
    }
}
