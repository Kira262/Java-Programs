// Define the Transport interface
interface Transport {
    void deliver();
}

// Define the abstract class Animal
abstract class Animal {
    // Common methods and properties for animals can be defined here
}

// Define the Tiger class
class Tiger extends Animal {
    // Tiger-specific properties and methods
}

// Define the Camel class implementing the Transport interface
class Camel extends Animal implements Transport {
    @Override
    public void deliver() {
        System.out.println("Camel is delivering goods.");
    }
}

// Define the Deer class
class Deer extends Animal {
    // Deer-specific properties and methods
}

// Define the Donkey class implementing the Transport interface
class Donkey extends Animal implements Transport {
    @Override
    public void deliver() {
        System.out.println("Donkey is delivering goods.");
    }
}

class AnimalTransportTest {
    public static void main(String[] args) {
        // Initialize an array of Animal objects
        Animal[] animals = { new Tiger(), new Camel(), new Deer(), new Donkey() };

        // Iterate through the array and check if the object implements Transport
        // If yes, invoke the deliver() method
        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                Transport transportAnimal = (Transport) animal;
                transportAnimal.deliver();
            }
        }
    }
}
