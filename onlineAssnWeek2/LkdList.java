package onlineAssnWeek2;
import java.util.LinkedList;
import java.util.*;
public class LkdList {
    public static void main(String[] args){
        LinkedList myll = new LinkedList();

        
        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");
        myll.addFirst("Gamora");
        myll.addLast("Antman");

        Iterator it = myll.iterator();

        while(it.hasNext()){
            //it.remove();
            System.out.println(it.next());
        }

        System.out.println("_______________________");
        System.out.println("Whos t the top: " + myll.peek());
        System.out.println("hey first one get out " +  myll.poll());
        System.out.println("_______________________");

        it = myll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }

}
