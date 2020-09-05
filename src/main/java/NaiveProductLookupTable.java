import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable {

    private List<Product> products = new ArrayList<Product>();
    @Override
    public Product lookupById(int id) {
       for(Product product : products){

           if(product.getId() == id){
               return product;
           }
       }
       return null;
    }

    @Override
    public void addProduct(Product productToAdd) {
        int id = productToAdd.getId();
        for(Product product : products){

            if(product.getId() == id){
                throw  new IllegalArgumentException("" +
                        "Unable to add product - duplicate id for " + product);
            }
        }

        products.add(productToAdd);
    }

    @Override
    public void clear() {

    }
}
