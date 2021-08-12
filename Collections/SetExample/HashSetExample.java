import java.util.Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** The elements are stored by the HashSet class using the hashing mechanism.
 *  -   Only unique elements are allowed by the HashSet class.
 *  -   Null values are allowed by the HashSet class.
 *  -   It is non-synchronized.
 *  -   The elements of the HashSet class are inserted based on their hashcode,
 *  thus this class does not maintain the insertion order.
 *  -   It performs the best in search operations.
 *  -   Its initial default capacity is 16.
 *  -   Its load factor is 0.75.
 */

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> stringSet = new HashSet<>();
        Set cloneSet = new HashSet();

        stringSet.add("A");
        stringSet.addAll(Arrays.asList("E","F","B","C","D"));

        System.out.println("stringSet = " + stringSet);

        if(!stringSet.isEmpty()){
            cloneSet = (HashSet)stringSet.clone();                           // clone the stringSet to cloneSet
            System.out.println("cloneSet = " + cloneSet);
        }

        System.out.println("stringSet.contains(\"C\") = " + stringSet.contains("C"));
        System.out.println("cloneSet.containsAll(Arrays.asList(\"B\",\"C\",\"D\")) = " +
                cloneSet.containsAll(Arrays.asList("B", "C", "D")));

        System.out.println("cloneSet.remove(\"C\") = " + cloneSet.remove("C"));

        System.out.println("stringSet.size() = " + stringSet.size());
        Iterator I1 = stringSet.iterator();

        while (I1.hasNext()){
            System.out.println(I1.next());
        }

        Iterator I2 = stringSet.iterator();

        while (I1.hasNext()){
            System.out.println(I1.next());
        }


    }
}



/**
 * 1	boolean	        add(E e)	            -   It will add the specified element to this set if it is not already present.
 * 2	void	        clear()	                -   It will eliminate all of the elements from the set.
 * 3	object	        clone()	                -   It will get a shallow copy of this HashSet instance: the elements themselves are not cloned.
 * 4	boolean	        contains(Object o)	    -   It will get true if this set contains the specified element.
 * 5	boolean	        isEmpty()	            -   It will get true if this set contains no elements.
 * 6	Iterator<E>	    iterator()	            -   It will get an iterator over the elements in this set.
 * 7	boolean	        remove(Object o)	    -   It will eliminate the specified element from this set if it is present.
 * 8	int	            size()	                -   It will get the number of elements in the set.
 * 9	Spliterator<E>	spliterator()	        -   It will create a late-binding and fail-fast Spliterator over the elements in the set.
  */
