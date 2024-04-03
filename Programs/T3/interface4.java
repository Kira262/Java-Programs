interface Veh {
    int engCap = 100;

    void ingite();

    default void defMethod() {
        System.out.println("Default interface method");
    }
}

class Two implements Veh {
    public void ingite() {
        System.out.println("Kick Start");
    }
}

class interface4 {
    public static void main(String[] args) {
        Veh vv = new Two();
        vv.defMethod();
    }
}