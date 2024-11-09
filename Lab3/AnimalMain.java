import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Press 1 for dog and 2 for cat:");
        int choice = scan.nextInt();

        Animal animal;

        if (choice == 1) {
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice");
            animal = new Animal();
        }

        animal.makeSound();

        scan.close();
    }
}


