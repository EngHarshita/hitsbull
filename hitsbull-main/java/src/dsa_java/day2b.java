package dsa_java;
/*import java.util.Scanner;
public class day2b {

    // Parent class
    class Animal {
        String typeOfAnimal;
        int limbs;
        String size;

        // Constructor
        Animal(String typeOfAnimal, int limbs, String size) {
            this.typeOfAnimal = typeOfAnimal;
            this.limbs = limbs;
            this.size = size;
        }

        void displayInfo() {
            System.out.println("Type of Animal: " + typeOfAnimal);
            System.out.println("Number of Limbs: " + limbs);
            System.out.println("Size: " + size);
        }
    }

    // Child class that extends Animal
    class Dog extends Animal {
        String breed;

        // Constructor for child class
        Dog(String typeOfAnimal, int limbs, String size, String breed) {
            super(typeOfAnimal, limbs, size); // call parent constructor
            this.breed = breed;
        }

        void bark() {
            System.out.println("The dog is barking.");
        }

        void displayDogInfo() {
            displayInfo(); // inherited method
            System.out.println("Breed: " + breed);
        }
    }

    // Main class
    public class InheritanceInputDemo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input for Animal properties
            System.out.print("Enter type of animal: ");
            String typeOfAnimal = sc.nextLine();

            System.out.print("Enter number of limbs: ");
            int limbs = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            System.out.print("Enter size of animal (small/medium/large): ");
            String size = sc.nextLine();

            // Taking extra input for Dog
            System.out.print("Enter dog breed: ");
            String breed = sc.nextLine();

            // Creating object of child class
            Dog d = new Dog(typeOfAnimal, limbs, size, breed);

            System.out.println("\n--- Animal & Dog Details ---");
            d.displayDogInfo();
            d.bark();

            sc.close();
        }
    }

}*/
