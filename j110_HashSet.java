import java.util.HashSet;
import java.util.Iterator;
public class j110_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1); // O(1)
        hs.add(1); // repetition is not allowed
        hs.add(2); // this is not an ordered pair
        hs.add(3);

        System.out.println("length of the set is " + hs.size());
        System.out.println(hs);

        if(hs.contains(1)){
            System.out.println("the following set contains 1");
        }

        // iterator
        Iterator<Integer> it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        } // no guarantee that all the elements will be printed in the sorted order
    }
}
