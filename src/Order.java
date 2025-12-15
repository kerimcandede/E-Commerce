import javax.swing.JOptionPane;

public class Order {
    private User orderingUser;
    private Product orderList;
    private CreditCard usedCreditCard;

    public Order(User orderingUser, Product orderList, CreditCard usedCreditCard) {
        this.orderingUser = orderingUser;
        this.orderList = orderList;
        this.usedCreditCard = usedCreditCard;
    }

    public User getOrderingUser() {
        return orderingUser;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public Product getOrderedProduct() {
        return orderList;
    }

    public void setOrderedProduct(Product orderList) {
        this.orderList = orderList;
    }

    public CreditCard getUsedCreditCard() {
        return usedCreditCard;
    }

    public void setUsedCreditCard(CreditCard usedCreditCard) {
        this.usedCreditCard = usedCreditCard;
    }
    
    public static boolean orderingSession(User user, Product product, int amount) {
        if (product.stockManager(product, amount)) {
            user.orderProduct(product, user);
            System.out.println("Operation successful");
            return true;
        } else {
            System.out.println("Operation failed");
            return false;
        }
    }
}
