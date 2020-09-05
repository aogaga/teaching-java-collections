import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Welcome {

    public static void main(String [] args){
        String [] fam = {"ogaga", "onos", "obehi" };
        String [] names = {"ogaga", "onos", "obehi", "zubi", "Amaro0", "izic" };

       List<String> linkedList = new LinkedList<String>();

       linkedList.add("max");
       linkedList.addAll(Arrays.asList(names));

       for(String x: linkedList){
           System.out.println(x);
       }
    }
}
