// Parent class
class Animal {
    // Method to make sound
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class q2 {
    public static void main(String[] args) {
        // Creating objects of type Animal
        Animal myAnimal1 = new Animal();
        Animal myAnimal2 = new Dog();
        Animal myAnimal3 = new Cat();

        // Calling makeSound method on objects
        myAnimal1.makeSound(); // Animal makes a sound
        myAnimal2.makeSound(); // Dog barks
        myAnimal3.makeSound(); // Cat meows
    }
}
