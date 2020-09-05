import java.util.*;

public class LinkedListDemo {


  public static void main(String [] args){
    // create a linkedList

//    Collection<String> ll = new LinkedList<String>();

    LinkedList<String> ll = new LinkedList<>();
    ll.add("ogaga");
    ll.add("agi");


    for(String s : ll){
      System.out.println(s);
    }
  }
}
