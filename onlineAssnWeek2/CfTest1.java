package onlineAssnWeek2;
import java.util.ArrayList;
import java.util.Comparator;

public class CfTest1 {
    public static void main(String[] args){
        ArrayList<String> states = new ArrayList<String>();

        states.add("California");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkankas");

        System.out.println(states);

        String s = states.get(1);
        System.out.println("I got: " + s);

        System.out.println(states.size());

        for(int i=0; i<states.size(); i++){
            System.out.println(states.get(i));
        }

        states.set(2, "Texas");
        System.out.println("After updation: " + states);

        String t = states.remove(3);
        System.out.println("State removed is: " + t);
        System.out.println("ArrayList after deletion: " + states);

        states.sort(Comparator.naturalOrder());
        System.out.println("ArrayList after sorting: " + states);

        System.out.println("Is newyork there: "+states.contains("newyork"));

        System.out.println("Texas is at: " + states.indexOf("Texas"));

        System.out.println("Is list empty? " + states.isEmpty());

        states.removeAll(states);
        
        System.out.println("Is list empty? " + states.isEmpty());
    }
}
