package restaurant;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuList = new ArrayList<>();
    public static String date;

    public void addItem(MenuItem item) {
        for (MenuItem food : this.menuList) {
            if (food.getName() == item.getName()) {
                System.out.println(item.getName() + " is already on the menu!");
                return;
            }
        }
        System.out.println("adding " + item.getName() + " to the menu");
        this.menuList.add(item);
        this.date = setDate();
    }

    public void removeItem(MenuItem item) {
        System.out.println("removing " + item.getName() + " to the menu");
        this.menuList.remove(this.menuList.indexOf(item));
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    private String setDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public void setNew() {
        int length = this.menuList.size();
        this.menuList.get(length - 1).setNewOld("New");
    }

    //    public static void main(String[] args) {
//        ArrayList<MenuItem> menu = new ArrayList<>();
//
//        //create menu items
//        MenuItem tacos = new MenuItem("Beef Tacos",1.59,"Tasty, Large portions","Entree", "New");
//        MenuItem tacosChicken = new MenuItem("Chicken Tacos",1.39,"Tasty, Large portions","Entree", "");
//        MenuItem fish = new MenuItem("King Salmon",12.00,"Fresh From Sitka, Alaska","Entree", "");
//        MenuItem samosas = new MenuItem("Beef Samosas",2.39,"Good ole greasy Samosas","Appetizers", "New");
//        MenuItem iceCream = new MenuItem("Vanilla Ice Cream",5.49,"Cold & Plain","Dessert", "");
//        MenuItem iceCream2 = new MenuItem("Chocolate Ice Cream",5.49,"Cold & Plain","Dessert", "");
//
//        //add menu items to the menu
//        menu.add(tacos);
//        menu.add(tacosChicken);
//        menu.add(fish);
//        menu.add(samosas);
//        menu.add(iceCream);
//        menu.add(iceCream2);
//
//        for(MenuItem item : menu){
//            System.out.println(item.toString());
////            System.out.println(item.getName());
////            System.out.println(item.getDate());
//        }
//    }

}
