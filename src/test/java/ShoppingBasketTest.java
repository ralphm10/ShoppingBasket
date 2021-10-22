import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void totalOfZeroForEmptyBasket() {
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(0.00, basket.getTotal(), 0.00);
    }
}
