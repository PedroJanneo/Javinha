package POO.Entities;

public class Produtos {

    public String name;
    public double price;
    public int quantity;


    public double priceTotal(){
        double total = quantity * price;
        return total;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;

    }

    public void removeProduct(int quantity){
       this.quantity -= quantity;
    }
}
