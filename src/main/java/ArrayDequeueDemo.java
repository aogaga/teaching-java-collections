import java.util.ArrayDeque;
import java.util.Collection;

public class ArrayDequeueDemo {

    public static void main(String [] args){
      ArrayDeque<String> ad = new ArrayDeque<>();
      ad.push("dennis");
      ad.push("ogaga");
      ad.push("agi");
      ad.push("fidelis");
      ad.push("maxwell");


      while(ad.peek() != null){
        System.out.println(ad.pop());
      }

      for (String s: ad){
        System.out.println(s);
      }
    }
}
