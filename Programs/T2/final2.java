class bik {
    // final void run̥
    void run() {
        System.out.println("RUn ");
    }
}

class honda extends bik {
    void run() {
        System.out.println("RUn  blah blah");

    }
}

class main11 {
    public static void main(String[] args) {
        honda ob = new honda();
        ob.run();
    }
}