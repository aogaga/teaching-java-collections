import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
  public static void main(String [] args){
    HashMap<String, Double> hm = new HashMap<>();

    hm.put("Ogaga agi", 32.00);
    hm.put("onoriode Agi", 29.00);


    Set<Map.Entry<String, Double>> set = hm.entrySet();

    for(Map.Entry<String, Double> k : set){

      String key = k.getKey();
      Double kval = k.getValue();

      System.out.println(key + " is " + String.valueOf(kval) + " years old ");
    }




  }
}
