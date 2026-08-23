import java.util.*;

public class Practice{
    public static int hash1(String s, int size){
        return 1;
    }

    public static int hash2(String s, int size){
        return s.length() % size;
    }

    public static int hash3(String s, int size){
        return (s.charAt(0) -'a') % size;
    }

    public static int hash4(String s, int size){

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
            73, 79, 83, 89, 97, 101};

        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            sum += primes[index];

        }
        
        return sum % size;
    }

    public static void main(String args[]){
        String s = "ssd";
        int size = 10;
        System.out.println("Hash 1: " + hash1(s, size));
        System.out.println("Hash 2: " + hash2(s, size));
        System.out.println("Hash 3: " + hash3(s, size));
        System.out.println("Hash 4: " + hash4(s, size));
    }
}