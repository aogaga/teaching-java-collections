import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String [] args){
      TreeMap<String, Double> tm = new TreeMap<>();

      tm.put("ogaga", 33.00);
      tm.put("onos", 29.00 );

      Set<Entry<String, Double>>  set = tm.entrySet();

      for(Map.Entry<String, Double> k : set){
        System.out.println(k.getKey());
        System.out.println(k.getValue());
      }
    }
}
