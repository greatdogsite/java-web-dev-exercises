package exercises.technology.main;

public class Program {
    public static void main(String[] args) {
        Laptop firstLaptop = new Laptop(500, 4, true, 6);
        Computer firstComputer = new Computer(500, 4, true);
        SmartPhone firstSmartPhone = new SmartPhone(500, 4, true, 95);
        Computer letsCastSomething = new Laptop(500, 4, true, 5);
        Boolean yes = ((Laptop) letsCastSomething).isClunky(); //practice casting
        System.out.println(yes);
    }
}
