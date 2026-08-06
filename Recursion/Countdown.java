import java.util.*;

public class Countdown{
    public static void number(int i){
        if(i==0){
            return;
        }

        System.out.println(i);
        number(i-1);
    }
    
    public static void main(String[] args){
        number(5);
    }
    
}
