package onlineAssnWeek2;

import java.util.Iterator;
import java.util.Vector;

public class CfTest2 {
    public static void main(String[] args){
        Vector vec = new Vector();
        vec.add("Zurich");
        vec.add("Munich");
        vec.add("Newyork");

        Iterator pointer = vec.iterator();

        while(pointer.hasNext()){
            System.out.println(pointer.next());
        }
    }
}
