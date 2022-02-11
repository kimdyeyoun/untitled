package practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class Boj10818 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < n; i++){
            list.add(scan.nextInt());
        }
        Collections.sort(list);

        System.out.print(list.get(0) + " " + list.get(n-1));
    }
}
