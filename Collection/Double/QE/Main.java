package QE;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Queue<Integer> Q = new LinkedList<>();
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);
        System.out.println(Q.remove());
        System.out.println(Q.remove());
        Deque<Integer> de = new ArrayDeque<>();
        de.add(23);
        de.addFirst(29);
        de.addLast(56);
         System.out.println(de.remove());
        System.out.println( de.removeLast());



    }


}
