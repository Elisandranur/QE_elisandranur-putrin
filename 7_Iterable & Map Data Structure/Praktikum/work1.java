// ELISANDRA NUR PN QE C
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class work1 {
    // Function to remove duplicates from an ArrayList
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {

        // Create a new LinkedHashSet
        Set<T> set = new LinkedHashSet<>();

        // Add the elements to set
        set.addAll(list);

        // Clear the list
        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);

        // return the list
        return list;
    }

    // Driver code
    public static void main(String args[])
    {

        // Get the ArrayList with duplicate values
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList( "jin", "lee"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList( "kazuya", "panda"));

        // Print the Arraylist
        System.out.println("ArrayList : "+ list1 + list2);
        list1.add( "panda");
        list1.add("kazuya");


        // Remove duplicates
        ArrayList<String> newList1 = removeDuplicates(list1);

        // Print the ArrayList with duplicates removed
       System.out.println("ArrayList with duplicates removed: "+ newList1);
    }
}
