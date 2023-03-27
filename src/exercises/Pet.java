package exercises;


public class Pet {

    private String name;

    Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        String firstPet = "Fluffy";
        Pet secondPet = new Pet("Fluffy");
        Pet thirdPet = new Pet("Fluffy");

        if (secondPet == thirdPet) {
            System.out.println("1 true");
        }
        if (thirdPet.equals(secondPet)) {
            System.out.println("2 true");
        }
        if (thirdPet.getName().equals(firstPet)) {
            System.out.println("3 true");
        }
        if (thirdPet.equals(firstPet)) {
            System.out.println("4 true");
        }
    }
}



