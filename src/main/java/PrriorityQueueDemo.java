import java.util.Collection;
import java.util.PriorityQueue;

public class PrriorityQueueDemo {

  public static void main(String [] args){
  PriorityQueue<String> pq = new PriorityQueue<>();

    pq.add("ogaga");
    pq.add("onos");
    pq.add("obehi");

    for(String s : pq){

      System.out.println(s);
    }

    System.out.println(pq);
  }
}
