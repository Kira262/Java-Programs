
interface vehicle {
    // Error cuz not initialized 
    // int enCap;
    void ignite();
}

class twowheel implements vehicle {

    public void ignite() {
        System.out.println("Startu ");
    }
}

class interface3 {
    public static void main(String[] args) {
        vehicle v = new twowheel();
        v.ignite();
    }
}
