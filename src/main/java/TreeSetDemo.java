import java.util.Collection;
import java.util.TreeSet;

public class TreeSetDemo {

  public static void main(String [] args){
    TreeSet<String> ts = new TreeSet<String>();
//
//    ts.add("e");
//    ts.add("a");
//    ts.add("c");
//    ts.add("d");
//    ts.add("b");

  ts.add("ogaga");
  ts.add("fidelis");
  ts.add("agi");


    for(String s: ts){
      System.out.println(s);
    }

    System.out.println(ts);
  }

}
