
import java.util.*;
import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < 6){
            int number = random.nextInt(45)+1;
            if (!list.contains(number)){
                list.add(number);
            }
        }

        System.out.println("로또 번호: " + list);
        }



    }





