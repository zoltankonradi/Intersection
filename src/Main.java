import java.util.LinkedList;
import java.util.List;

public class Main {

    /*

     Cracking the Coding Interview - Linked Lists

     2.7 - Intersection:
     Given two (singly) linked lists, determine if the two lists intersect. Return the inter­
     secting node. Note that the intersection is defined based on reference, not value. That is, if the kth
     node of the first linked list is the exact same node (by reference) as the jth node of the second
     linked list, then they are intersecting.
    */

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new LinkedList<>();
        Integer commonNumber = new Integer(5);
        list1.add(new Integer(2));
        list1.add(new Integer(3));
        list1.add(commonNumber);
        list2.add(new Integer(4));
        list2.add(commonNumber);
        list2.add(new Integer(4));
        list3.add(new Integer(4));
        list3.add(new Integer(2));
        list3.add(new Integer(1));
        System.out.println(isIntersection(list1, list2)); // 5
        System.out.println(isIntersection(list1, list3)); // -1
    }

    public static Integer isIntersection(List<Integer> list1, List<Integer> list2) {
        for (Integer object1 : list1) {
            for (Integer object2 : list2) {
                if (object1 == object2) {
                    return object1;
                }
            }
        }
        return -1;
    }
}
