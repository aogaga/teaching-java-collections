import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
  public static void main(String [] args){
    HashSet<String> hs = new HashSet<>();
    hs.add("ogaga");
    hs.add("Agi");
    hs.add("Fidelis");

    for(String s: hs){
      System.out.println(s);
    }

    LinkedHashSet<String> lh = new LinkedHashSet<String>();
    lh.add("lagos");
    lh.add("Benin City");


    for(String s: lh){
      System.out.println(s);
    }
  }
}
