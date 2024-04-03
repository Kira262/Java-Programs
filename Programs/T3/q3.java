// 1. Create an abstract class Pen w/ methods , write and refill as abstract methods.
// 2. Use Pen class from 1. to create a concrete class fountain pen with additional methods Nib.
// 3. Create a  class monke with jump and bite methods. Create a class Human which inherits monke class and implements basic animal interface with eat and sleep methods.
// 4. Create a class telephone with lift and disconnect methods as abstract methods. Create another class smartTelephone and show polymorphism.
// 5. Demonstrate polymorphism using monke class from 3.
// 6. Create an interface tvRemote and use it to inherit another interface smartTvRemote.
// 7. Create a class TV which implements tvRemote interface from 6.
interface Animal {
    void eat();

    void sleep();
}

abstract class Pen {
    abstract void write();

    abstract void refill();
}

interface TvRemote {
    void turnOn();

    void turnOff();
}

interface SmartTvRemote extends TvRemote {
    void useApps();

    void voiceCommand();
}

class FountainPen extends Pen {

    public void write() {
        System.out.println("Writing with a fountain pen.");
    }

    public void refill() {
        System.out.println("Refilling the fountain pen.");
    }

    public void nib() {
        System.out.println("The nib is smooth.");
    }
}

abstract class Telephone {
    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends Telephone {

    public void lift() {
        System.out.println("Lifting the smart telephone receiver.");
    }

    public void disconnect() {
        System.out.println("Disconnecting the smart telephone.");
    }

    public void useApps() {
        System.out.println("Using various apps on the smart telephone.");
    }
}

class Monkey implements Animal {

    public void eat() {
        System.out.println("Monkey eating banana.");
    }

    public void sleep() {
        System.out.println("Monkey sleeping on a tree.");
    }

    public void jump() {
        System.out.println("Monkey jumping from one branch to another.");
    }

    public void bite() {
        System.out.println("Monkey biting an enemy.");
    }
}

@SuppressWarnings("unused")
class Human extends Monkey implements Animal {

    public void eat() {
        System.out.println("Human eating pizza.");
    }

    public void sleep() {
        System.out.println("Human sleeping on a bed.");
    }

    public void walk() {
        System.out.println("Human walking down the street.");
    }
}

class TV implements TvRemote {

    public void turnOn() {
        System.out.println("Turn on the TV.");
    }

    public void turnOff() {
        System.out.println("Turn off the TV.");
    }
}

class SmartTV extends TV implements SmartTvRemote {

    public void useApps() {
        System.out.println("Using apps on the smart TV.");
    }

    public void voiceCommand() {
        System.out.println("Using voice command on the smart TV.");
    }
}

class q3 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.nib();
        SmartTelephone stp = new SmartTelephone();
        stp.lift();
        stp.disconnect();
        stp.useApps();
        Monkey mnk = new Monkey();
        mnk.eat();
        mnk.sleep();
        mnk.jump();
        mnk.bite();
        Human hm = new Human();
        hm.eat();
        hm.sleep();
        hm.walk();
        TV ttv = new TV();
        ttv.turnOn();
        ttv.turnOff();
        SmartTV stv = new SmartTV();
        stv.useApps();
        stv.voiceCommand();
    }
}