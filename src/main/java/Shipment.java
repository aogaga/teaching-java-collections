import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Shipment implements Iterable<Product> {

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private final List<Product> products = new ArrayList<>();
    
    public void add(Product product){
        products.add(product);
    }

    public boolean replace(Product oldProduct, Product newProduct){
        // TODO

        int position = products.indexOf(oldProduct) ;
        products.set(position, newProduct);
        
        return true;
    }

    public void prepare(){
        
    }

    public List<Product> getHeavyVanProducts(){
        return null;
    }

    public List<Product> getLightVanProducts(){
        return null;
    }


    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    @Override
    public void forEach(Consumer<? super Product> action) {

    }

    @Override
    public Spliterator<Product> spliterator() {
        return null;
    }
}
