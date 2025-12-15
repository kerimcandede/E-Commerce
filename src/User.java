import java.util.ArrayList;
public class User {
    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String HomeAddress;
    private String WorkAddress;
    private ArrayList<Product> favouriteProducts;

    
    private static ArrayList<User> userList = new ArrayList<>();
    private static ArrayList<Product> orderedProducts = new ArrayList<>();
    public static ArrayList<CreditCard> creditCardInfo = new ArrayList<>();
    

    public User(String username,String name, String surname, String password, String email,String dateOfBirth) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.favouriteProducts = new ArrayList<>();
        
        
        
    }
    public User() {

        this.favouriteProducts = new ArrayList<>();
    }

    public ArrayList<CreditCard> getCreditCardInfo() {
        return creditCardInfo;
    }
    
    
    
    public void setCreditCardInfo(ArrayList<CreditCard> creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

    public String getWorkAddress() {
        return WorkAddress;
    }

    public void setWorkAddress(String WorkAddress) {
        this.WorkAddress = WorkAddress;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(ArrayList<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public ArrayList<Product> getFavouriteProducts() {
        return favouriteProducts;
    }

    public void setFavouriteProducts(ArrayList<Product> favouriteProducts) {
        this.favouriteProducts = favouriteProducts;
    }

    

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void setUserList(ArrayList<User> userList) {
        User.userList = userList;
    }


    
    public void orderProduct(Product product,User user) {
        user.getOrderedProducts().add(product);
        
        System.out.println("Pruduct has been ordered");
        
    }
    
    public void seeOrderedProducts(ArrayList<Product> orderedProducts) {
        for(Product product : orderedProducts) {
            System.out.println("Ordered Product's Name: "+product.getName()+"\n"+
                               "Ordered Product's Color: "+product.getColor()+"\n"+
                               "Ordered Product's Category: "+product.getCategory()+"\n"+
                               "Ordered Product's Stock: "+product.getStock()+"\n"+
                               "Ordered Product's Weight: "+product.getWeight()+"\n"+
                               "Ordered Product's Description: "+product.getDescription()+"\n");
            System.out.println("--------------------------------------------");
        }
    }
    
    public void seeFavouriteProducts(ArrayList<Product> favouriteProducts) {
        for(Product product : favouriteProducts) {
            System.out.println("Product's Name: "+product.getName()+"\n"+
                               "Product's Color: "+product.getColor()+"\n"+
                               "Product's Category: "+product.getCategory()+"\n"+
                               "Product's Stock: "+product.getStock()+"\n"+
                               "Product's Weight: "+product.getWeight()+"\n"+
                               "Product's Description: "+product.getDescription()+"\n");
            System.out.println("--------------------------------------------");
        }
    }
    }