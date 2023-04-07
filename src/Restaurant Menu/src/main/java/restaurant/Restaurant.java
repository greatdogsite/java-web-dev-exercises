package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        //create menu items
        MenuItem tacos = new MenuItem("Beef Tacos", 1.59, "Tasty, Large portions", "Entree", "New");
        MenuItem tacosChicken = new MenuItem("Chicken Tacos", 1.39, "Tasty, Large portions", "Entree", "");
        MenuItem fish = new MenuItem("King Salmon", 12.00, "Fresh From Sitka, Alaska", "Entree", "");
        MenuItem samosas = new MenuItem("Beef Samosas", 2.39, "Good ole greasy Samosas", "Appetizers", "New");
        MenuItem iceCream = new MenuItem("Vanilla Ice Cream", 5.49, "Cold & Plain", "Dessert", "");
        MenuItem iceCream2 = new MenuItem("Chocolate Ice Cream", 5.49, "Cold & Plain", "Dessert", "");

        // Create a menu with the Menu Class
        Menu menu = new Menu();

        // add items to an ArrayList in the Menu Class
        menu.addItem(tacos);
        menu.addItem(tacosChicken);
        menu.addItem(fish);
        menu.addItem(samosas);
        menu.addItem(iceCream);
        menu.addItem(iceCream2);

        //remove an item
        menu.removeItem(tacos);
        System.out.println("\r");

        //set the last item added as New
        menu.setNew();

        // Check when the menu was last updated
        System.out.println("Menu Updated on " + Menu.date + "\n");

        // Print the menu
        for (MenuItem item : menu.getMenuList()) {
            System.out.println(item);
            //System.out.println(item.getName());
        }

        //Print a single item using toString
        System.out.println("\r");
        System.out.println("Printing a single Menu Item");
        System.out.println(tacos.toString());

        //Add more tacos for equality testing
        MenuItem tacos2 = new MenuItem("Beef Tacos", 1.59, "Tasty, Large portions", "Entree", "New");
        MenuItem fish2 = new MenuItem("King Salmon", 12.00, "Fresh From Sitka, Alaska", "Entree", "");
        System.out.println("\r");
        menu.addItem(fish2);
        // equals method works
        System.out.println("\r");
        System.out.println("do tacos equal tacos2? " + tacos.equals(tacos2));

    }
}
