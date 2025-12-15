import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Product {
    private String name;
    private String color;
    private String category;
    private int stock;
    private double weight;
    private String description;
    private String price;
    
    private static ArrayList<Product> productList = new ArrayList<>();

    public Product(String name, String color, String category, int stock, double weight, String description, String price) {
        this.name = name;
        this.color = color;
        this.category = category;
        this.stock = stock;
        this.weight = weight;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    public static ArrayList<Product> getProductList() {
        return productList;
    }

    public static void addProduct(Product product) {
        productList.add(product);
    }

    public static void printAllProducts() {
        for (Product p : productList) {
            System.out.println(
                p.getName() + " " +
                p.getColor() + " " +
                p.getCategory() + " " +
                p.getStock() + " " +
                p.getWeight() + " " +
                p.getDescription()
            );
        }
    }

    public boolean isEnoughStock(Product product, int amount) {
        if (product.getStock() >= amount) {
            System.out.println("Stock is sufficient");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Not Enough Stock!", "Stock Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("not enough stock");
            return false;
        }
    }
    
    public boolean stockManager(Product product, int amount) {
        if (isEnoughStock(product, amount)) {
            System.out.println(product.getStock());
            product.setStock(product.getStock() - amount);
            System.out.println(product.getStock());
            return true;
        } else {
            System.out.println("Operation could not be completed");
            return false;
        }
    }
}
