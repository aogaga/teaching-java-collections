import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ShipmentTests {
    Product door = new Product("Wooden Door", 35);
    Product floorPanel = new Product("Floor Panel", 25);
    Product window = new Product("Glass Window", 10);

    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems(){
        shipment.add(door);
        shipment.add(window);
       
        assertThat(shipment, contains(door, window));
    }

    @Test
    public void shouldNotReplaceMissingItems(){
        shipment.add(window);
        assertFalse(shipment.replace(door, floorPanel));
        assertThat(shipment, contains(window));
    }
}
