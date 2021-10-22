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
    public void totalOfOneItemInBasketWithPrice100() {
        ShoppingBasket basket = new ShoppingBasket(asList(new Item(100.00, 1)));
        assertEquals(100.00, basket.getTotal(), 0.00);
    }

    @Test
    public void totalOfOneItemInBasketWithPrice200() {
        ShoppingBasket basket = new ShoppingBasket(asList(new Item(200.00, 1)));
        assertEquals(200.00, basket.getTotal(), 0.00);
    }

    @Test
    public void totalOfTwoItemsInBasketWithDifferentPrices() {
        ShoppingBasket basket = new ShoppingBasket(asList(new Item(100.00, 1), new Item(50.00, 1)));
        assertEquals(150.00, basket.getTotal(), 0.00);
    }

    @Test
    public void totalOfOneItemInBasketWithMoreThanOneQuantity() {
        ShoppingBasket basket = new ShoppingBasket(asList(new Item(100.00, 3)));
        assertEquals(300.00, basket.getTotal(),0.00);
    }
}
