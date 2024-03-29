class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Sound");
    }
}

class Main20 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Animal a = new Animal();
        c.speak();
        c.eat();
        a.eat();
        d.bark();
        // c.bark();
        // a.bark();
        // d.speak();
    }
}