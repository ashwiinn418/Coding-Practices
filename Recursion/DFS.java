import java.io.File;
import java.util.*;

public class DFS {
    public static void printNames(String dir){

        File folder = new File(dir);

        File[] files = folder.listFiles();

        if(files == null){
            return;
        }

        //Same sorting logic tree.java
        Arrays.sort(files, Comparator.comparing(File :: getName));

        for(File file : files){

            if(file.isFile()){
                System.out.println(file.getName());
            }
            else{
                printNames(file.getPath());
            }
        }
    }

    public static void main(String args[]){
        printNames("pics");
    }
}