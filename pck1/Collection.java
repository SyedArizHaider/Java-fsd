package pck1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {

	        //  ArrayList
	        ArrayList<String> list = new ArrayList<>();
	        list.add("apple");
	        list.add("banana");
	        list.add("cherry");
	        System.out.println("ArrayList: " + list);

	        //  LinkedList
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(10);
	        linkedList.add(20);
	        linkedList.add(30);
	        System.out.println("LinkedList: " + linkedList);

	        //  HashSet
	        HashSet<String> set = new HashSet<>();
	        set.add("apple");
	        set.add("banana");
	        set.add("cherry");
	        System.out.println("HashSet: " + set);

	        //  TreeSet
	        TreeSet<Integer> treeSet = new TreeSet<>();
	        treeSet.add(10);
	        treeSet.add(20);
	        treeSet.add(30);
	        System.out.println("TreeSet: " + treeSet);
	}

}