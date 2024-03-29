class Animel {
    void eat() {
        // System.out.println("Eat");
    }
}

class Dogg extends Animel {
    void bhaw() {
        System.out.println("BArkss");
    }
}

class babydogo extends Animel {
    void cry() {
        System.out.println("Crys");
    }
}

class Meine {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        babydogo ob = new babydogo();
        Dogg ob1 = new Dogg();
        Animel ob2 = new Animel();
    }
}