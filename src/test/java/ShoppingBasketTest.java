import org.junit.jupiter.api.Test;

import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void totalOfZeroForEmptyBasket() {
        ShoppingBasket basket = new ShoppingBasket(asList());
        assertEquals(0.00, basket.getTotal(), 0.00);
    }

    @Test
    public void totalOfOneItemInBasket() {
        ShoppingBasket basket = new ShoppingBasket(asList(new Item(100.00, 1)));
        assertEquals(100.00, basket.getTotal(), 0.00);
    }
}
