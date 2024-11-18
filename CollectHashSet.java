package OO_Demo;

//import java.util.Collections;
import java.util.HashSet;
//import java.util.Collection;

public class CollectHashSet {
    public static void main(String[] args) {
        HashSet<String>hashset= new HashSet<>();
        HashSet<String>hashset2= new HashSet<>();

        hashset2.add("J");
        hashset2.add("F");

        // HashSet<Integer>hetero = new HashSet<Integer>();

        // hetero.add(5);
        // hetero.add(3);
        // hetero.add(4);
        // hetero.add(7);
        // hetero.add(2);
        // hetero.add(9);
        // System.out.println(hetero);
        // Collections.sort(hetero);

        hashset.add("A");
        hashset.add("B");
        System.out.println(hashset.add("C"));
//return true if element successfuly added to the hashset
        System.out.println(hashset.add("D"));
        System.out.println("D over write exixsting D : "+hashset.add("D")); 
// return false if element can't add or if it already exits in hashset and 
//it would not over write the existing element

        System.out.println("Hashset elements are : "+hashset);
        hashset.remove("A");
        System.out.println("A is present or not : "+hashset.contains("A"));
        for(String item : hashset){
            System.out.println(item);
        }
        hashset.addAll(hashset2);
        hashset.add("A");
        //hashset.retainAll(hashset2);
        System.out.println("Hashset elements are : "+hashset);
        //Collections.sort(hashset);
    }
}
