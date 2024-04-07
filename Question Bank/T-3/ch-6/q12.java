// Transport interface
interface Transport {
    void deliver();
}

// Abstract class Animal
abstract class Animal {
    // Abstract method
    abstract void display();
}

// Tiger class extending Animal
class Tiger extends Animal {
    @Override
    void display() {
        System.out.println("Tiger");
    }
}

// Camel class extending Animal and implementing Transport interface
class Camel extends Animal implements Transport {
    @Override
    void display() {
        System.out.println("Camel");
    }

    @Override
    public void deliver() {
        System.out.println("Camel is delivering");
    }
}

// Deer class extending Animal
class Deer extends Animal {
    @Override
    void display() {
        System.out.println("Deer");
    }
}

// Donkey class extending Animal and implementing Transport interface
class Donkey extends Animal implements Transport {
    @Override
    void display() {
        System.out.println("Donkey");
    }

    @Override
    public void deliver() {
        System.out.println("Donkey is delivering");
    }
}

// Main class
public class q12 {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = { new Tiger(), new Camel(), new Deer(), new Donkey() };

        // Iterate through the array
        for (Animal animal : animals) {
            // Check if the object implements the Transport interface
            if (animal instanceof Transport) {
                // If so, invoke the deliver() method
                ((Transport) animal).deliver();
            }
        }
    }
}
