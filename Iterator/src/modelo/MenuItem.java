
package modelo;

public class MenuItem {
   private String name;
   private String descriptio;
   private double price;
   boolean vegetarian;

    public MenuItem(String name, String descriptio, double price, boolean vegetarian) {
        this.name = name;
        this.descriptio = descriptio;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptio() {
        return descriptio;
    }

    public void setDescriptio(String descriptio) {
        this.descriptio = descriptio;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
   
   
}
