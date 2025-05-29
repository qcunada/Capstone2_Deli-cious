package SandwichShop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class OrderTest {
    private Order order;

    @BeforeEach
    void setup() {
        order = new Order();
    }

    @Test
    void testAddItemAndGetSubtotal() {
        order.addItem(new MenuItem() {
            public String getDescription() {
                return "Cola";
            }

            public double getPrice() {
                return 2.00;
            }
        });

        order.addItem(new MenuItem() {
            public String getDescription() {
                return "Chips";
            }

            public double getPrice() {
                return 1.50;
            }
        });

        assertEquals(3.50, order.getSubtotal(), 0.001);
    }
    @Test
    void testSetAndGetTip() {
        order.setTip(3.00);
        assertEquals(3.00, order.getTip(), 0.001);
    }
    @Test
    void testGetTotalWithTip() {
        order.addItem(new MenuItem() {
            public String getDescription() {
                return "Veggie Wrap";
            }
            public double getPrice() { return 8.00; }
        });

        order.setTip(1.50);
        assertEquals(9.50, order.getTotal(), 0.001);
    }
    @Test
    void testGetOrderDetails() {
        order.addItem(new MenuItem() {
            public String getDescription() {
                return "Meat lover";
            }
            public double getPrice() {
                return 22.50;
            }
        });

        String details = order.getOrderDetails();
        assertTrue(details.contains("Meat lover"));
        assertTrue(details.contains("Subtotal: $22.50"));
    }
    @Test
    void testEmptyOrderSubtotalAndTotal() {
        assertEquals(0.00, order.getSubtotal(), 0.001);
        assertEquals(0.00, order.getTotal(), 0.001);
    }
}

