import java.io.File;
import java.util.*;

public class Tree {
    public static void printNames (String startDir) {

        Queue<File> searchQueue = new LinkedList<>();

        searchQueue.add(new File(startDir));

        while (!searchQueue.isEmpty()){

            //Remove dir from front of the queue
            File dir = searchQueue.poll();

            // Get files and folder inside the directory
            File[] files = dir.listFiles();

            if (files == null){
                continue;
            }
            
            //Sorts the answers
            Arrays.sort(files, Comparator.comparing(File::getName));

            for (File file : files) {

                if(file.isFile()) {
                    //If a file print the name
                    System.out.println(file.getName());
                }
                else{
                    //If its a directory add it to the queue
                    searchQueue.add(file);
                }
            }
        }
    }

    public static void main (String args[]) {
        printNames("pics");
    }
}