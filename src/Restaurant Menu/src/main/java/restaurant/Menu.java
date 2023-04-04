package restaurant;

import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        ArrayList<MenuItem> menu = new ArrayList<>();

        //create menu items
        MenuItem tacos = new MenuItem("Beef Tacos",1.59,"Tasty, Large portions","Entree", "New");
        MenuItem tacosChicken = new MenuItem("Chicken Tacos",1.39,"Tasty, Large portions","Entree", "");
        MenuItem fish = new MenuItem("King Salmon",12.00,"Fresh From Sitka, Alaska","Entree", "");
        MenuItem samosas = new MenuItem("Beef Samosas",2.39,"Good ole greasy Samosas","Appetizers", "New");
        MenuItem iceCream = new MenuItem("Vanilla Ice Cream",5.49,"Cold & Plain","Dessert", "");
        MenuItem iceCream2 = new MenuItem("Chocolate Ice Cream",5.49,"Cold & Plain","Dessert", "");

        //add menu items to the menu
        menu.add(tacos);
        menu.add(tacosChicken);
        menu.add(fish);
        menu.add(samosas);
        menu.add(iceCream);
        menu.add(iceCream2);

        for(MenuItem item : menu){
            System.out.println(item.toString());
//            System.out.println(item.getName());
//            System.out.println(item.getDate());
        }
    }

}
