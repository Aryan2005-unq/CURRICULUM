// Modify the Order class created before and add two constructors in the class.
// Method Description

// Order()

// Set the value of status to 'Ordered'.

// Order(int orderId, String orderedFoods)

// Initialize the instance variables appropriately with the values passed to the constructor.

// Set the value of status to 'Ordered'.

// Create an object of the Order class by using the parameterless constructor and display the value of the status instance variable in the main() method of the Tester class. 

// Create one more object of the Order class by using the parameterized constructor and display the value of orderId, orderFoods and status instance variables in the main() method of the Tester class.

class Order {
    private int orderId;
    private String orderedFoods;
    private String status;

    public Order() {
        this.status = "Ordered";
    }

    public Order(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.status = "Ordered";
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderedFoods() {
        return orderedFoods;
    }

    public String getStatus() {
        return status;
    }
}

public class Tester {
    public static void main(String[] args) {
        Order order1 = new Order();
        System.out.println("Status of order1: " + order1.getStatus());

        Order order2 = new Order(101, "Pizza, Burger");
        System.out.println("Order ID: " + order2.getOrderId());
        System.out.println("Ordered Foods: " + order2.getOrderedFoods());
        System.out.println("Status of order2: " + order2.getStatus());
    }
}
