import java.util.*;

public class CollectionConcepts {

    public static void main(String [] args){

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product>  products   = new ArrayList<Product>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        System.out.println(products);


        Collection<String> hset = new HashSet<>();
        hset.add("ogaga");
        hset.add("ogaga");
        hset.add("mike");

        System.out.println(hset);

//        products.forEach(x->{
//            if (x.getWeight() > 20) {
//                products.remove(x);
//            } else {
//                System.out.println(x);
//            }
//        });


//







       Collection ct = new HashSet();
      Map<String, String> hs = new HashMap<String, String>();


      Iterator iterator = hs.entrySet().iterator();

      while (iterator.hasNext()){
          String s =  (String) iterator.next();

      }


        

    }
}
