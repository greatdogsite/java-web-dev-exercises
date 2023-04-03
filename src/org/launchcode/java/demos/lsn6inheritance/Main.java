package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat meelo = new HouseCat("meelo", 15.);
        System.out.println(meelo.purr());
        System.out.println(meelo.getName());
        System.out.println(meelo.noise());
        System.out.println("Is meelo tired? " + meelo.isTired());
        meelo.eat();
        System.out.println("Is meelo tired now? " + meelo.isTired());
        System.out.println(meelo.noise());
    }
}
