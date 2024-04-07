// Q1
// Abstract class Pen
abstract class Pen {
    // Abstract methods
    abstract void write();

    abstract void refill();
}

// Q2
// Concrete class FountainPen extending Pen
class FountainPen extends Pen {
    // Method to change nib
    void changeNib() {
        System.out.println("Changing nib of fountain pen");
    }

    // Implementing abstract methods from Pen
    @Override
    void write() {
        System.out.println("Writing with fountain pen");
    }

    @Override
    void refill() {
        System.out.println("Refilling fountain pen");
    }
}

// Q3
// Class Monkey
class Monkey {
    // Methods
    void jump() {
        System.out.println("Monkey jumping");
    }

    void bite() {
        System.out.println("Monkey biting");
    }
}

// Class Human inheriting from Monkey and implementing BasicAnimal interface
class Human extends Monkey implements BasicAnimal {
    // Implementing methods from BasicAnimal interface
    @Override
    public void eat() {
        System.out.println("Human eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeping");
    }
}

// Interface BasicAnimal
interface BasicAnimal {
    void eat();

    void sleep();
}

// Q4
// Abstract class Telephone
abstract class Telephone {
    // Abstract methods
    abstract void ring();

    abstract void lift();

    abstract void disconnected();
}

// Class SmartTelephone extending Telephone
class SmartTelephone extends Telephone {
    // Overriding abstract methods from Telephone
    @Override
    void ring() {
        System.out.println("Smart telephone ringing");
    }

    @Override
    void lift() {
        System.out.println("Smart telephone lifted");
    }

    @Override
    void disconnected() {
        System.out.println("Smart telephone disconnected");
    }
}

// Q5
// Demonstrate polymorphism using Monkey class
public class q15 {
    public static void main(String[] args) {
        // Q2
        // Creating FountainPen object
        FountainPen fountainPen = new FountainPen();
        fountainPen.write();
        fountainPen.refill();
        fountainPen.changeNib();

        // Q3
        // Creating Human object
        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();

        // Q4
        // Creating SmartTelephone object
        Telephone smartTelephone = new SmartTelephone();
        smartTelephone.ring();
        smartTelephone.lift();
        smartTelephone.disconnected();
    }
}
