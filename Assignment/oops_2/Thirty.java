package oops_2;


class Product {
    int prod_id;
    String prod_name;
    double price;

    // Initializing the product details with exception handling
    public void init(int prod_id, String prod_name, double price) {
        try {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            this.prod_id = prod_id;
            this.prod_name = prod_name;
            this.price = price;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to display product details
    public void display() {
        try {
            System.out.println("Product ID: " + prod_id);
            System.out.println("Product Name: " + prod_name);
            System.out.println("Price: " + price);
        } catch (Exception e) {
            System.out.println("Error displaying product details: " + e.getMessage());
        }
    }
}

public class Thirty {
    public static void main(String[] args) {
        try {
            // Creating and initializing a product object
            Product p = new Product();
            p.init(1, "Laptop", -50000);  // This will cause an exception
            p.display();
        } catch (Exception e) {
            System.out.println("Error in main: " + e.getMessage());
        }
    }
}

