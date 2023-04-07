package restaurant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
    //    Each menu item has a price, description, and category (appetizer, main course, or dessert)
    private String name;
    private Double price;
    private String description;
    private String category;
    private String newOld;
    private String date;

    public MenuItem(String aName, Double aPrice, String aDescription, String aCategory, String aNewOld) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        //this.newOld = aNewOld;
        this.newOld = "";
        this.date = setDate();
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    private String setDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public void setNewOld(String aNewOld) {
        this.newOld = aNewOld;
    }

    @Override
    public String toString() {
        return this.name + " - " + "$" + this.price + " Each - " + this.description + " - " + this.category + " - " + this.newOld + " Added to the menu on " + this.date;
    }

    //@Override
    public Boolean equals(MenuItem item) {
        if (this.name == item.name) ;
        return true;
    }
}


