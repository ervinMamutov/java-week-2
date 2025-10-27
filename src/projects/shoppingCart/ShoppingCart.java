package projects.shoppingCart;

public class ShoppingCart {
    public static void main(String[] args) {

    }
}

class Product {
    private String name = "";
    private int price = 0;
    private int quantity = 0;


    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void calculateTotal(){
        System.out.print(name);
        System.out.print();
    }



}



class App {

}
