class inheritance1 {
    void eat() {
        System.out.println("Eatinga lah");
    }
}

class Doggo extends inheritance1 {
    void bhaw() {
        System.out.println("Barks meow");
    }
}

class Mainee {
    public static void main(String[] args) {
        Doggo d = new Doggo();
        d.bhaw();
        d.eat();
    }
}   