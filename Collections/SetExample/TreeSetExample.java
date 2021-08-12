import java.util.*;

/**
 * Just like HashSet, the Java TreeSet class contains unique elements only.
 *  -   The access and retrieval times of the TreeSet class are very fast.
 *  -   It does not give access to the null element.
 *  -   It maintains the ascending order.
 *  -   It is non-synchronized.
 */
public class TreeSetExample {

    public static void main(String[] args) {

//        TreeSet<String> stringSet = new TreeSet<>(Comparator.reverseOrder());             // comparator interface to sort reverse order
        TreeSet<String> stringSet = new TreeSet<>(Comparator.reverseOrder());

        stringSet.add("A");
        stringSet.addAll(Arrays.asList("B","N","E","F","C","D","O","Z","L"));

        System.out.println("stringSet = " + stringSet);     //maintain ascending order

        System.out.println("reverse iterator ");
        Iterator I1 = stringSet.descendingIterator();
        while (I1.hasNext()){
            System.out.println(I1.next());
        }

        System.out.println("stringSet.first() = " + stringSet.first());
        System.out.println("stringSet.last() = " + stringSet.last());
        System.out.println("stringSet = " + stringSet);

        System.out.println("stringSet.pollFirst() = " + stringSet.pollFirst());
        System.out.println("stringSet.pollLast() = " + stringSet.pollLast());

        System.out.println("stringSet = " + stringSet);
        System.out.println("stringSet.subSet(\"C\",true,\"F\",true) = " + stringSet.subSet("C", true, "F", true));

        stringSet.remove("E");
        System.out.println("stringSet = " + stringSet);
        System.out.println("stringSet.ceiling(\"E\") = " + stringSet.ceiling("E"));
        System.out.println("stringSet.floor(\"E\") = " + stringSet.floor("E"));
        System.out.println("stringSet.descendingSet() = " + stringSet.descendingSet());

        System.out.println("stringSet.tailSet(\"A\",false) = " + stringSet.tailSet("A",false));
        System.out.println("stringSet.headSet(\"c\",false) = " + stringSet.headSet("C", false));


    }
}


/**
 * 1	boolean               add(E e)	            It will add the specified element to this set if it is not already present.
 * 2	boolean    addAll(Collection<? extends E> c)	It will add all of the elements in the specified collection to this set.
 * 3	E                     ceiling(E e)	        It will get the equal or closest greatest element of the specified element from the set, or null there is no such element.
 * 4	Comparator<? super E> comparator()	        It will get the comparator that arranges elements in order.
 * 5	Iterator              descendingIterator()	It will iterate the elements in descending order.
 * 6	NavigableSet          descendingSet()	    It will get the elements in reverse order.
 * 7	E                     floor(E e)	        It will get the equal or closest least element of the specified element from the set, or null there is no such element.
 * 8	SortedSet             headSet(E toElement)	It will get the group of elements that are less than the specified element.
 * 9	NavigableSet  headSet(E toElement, boolean inclusive)	It will get the group of elements that are less than or equal to(if, inclusive is true) the specified element.
 * 10	E                     higher(E e)	        It will get the closest greatest element of the specified element from the set, or null there is no such element.
 * 11	Iterator              iterator()	        It will iterate the elements in ascending order.
 * 12	E                     lower(E e)	        It will get the closest least element of the specified element from the set, or null there is no such element.
 * 13	E                     pollFirst()	        It will retrieve and eliminate the lowest(first) element.
 * 14	E                     pollLast()	        It will retrieve and eliminate the highest(last) element.
 * 15	Spliterator           spliterator()	        It will create a late-binding and fail-fast spliterator over the elements.
 * 16	NavigableSet  subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)	It will get a set of elements that lie between the given range.
 * 17	SortedSet     subSet(E fromElement, E toElement))	It will get a set of elements that lie between the given range which includes fromElement and excludes toElement.
 * 18	SortedSet          tailSet(E fromElement)	It will get a set of elements that are greater than or equal to the specified element.
 * 19	NavigableSet  tailSet(E fromElement, boolean inclusive)	It will get a set of elements that are greater than or equal to (if, inclusive is true) the specified element.
 * 20	boolean               contains(Object o)	It will get true if this set contains the specified element.
 * 21	boolean               isEmpty()	            It will get true if this set contains no elements.
 * 22	boolean               remove(Object o)	    It will eliminate the specified element from this set if it is present.
 * 23	void                  clear()	            It will eliminate all of the elements from this set.
 * 24	Object                clone()	            It will get a shallow copy of this TreeSet instance.
 * 25	E                     first()	            It will get the first (lowest) element currently in this sorted set.
 * 26	E                     last()	            It will get the last (highest) element currently in this sorted set.
 * 27	int                   size()	            It will get the number of elements in this set.
 */

