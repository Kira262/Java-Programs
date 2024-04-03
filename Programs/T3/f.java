class params {
    String name;

    void show() {
        System.out.println("Parent Method");
    }

    void printt() {
        System.out.println("Print");
    }
}

class chill extends params {
    int age;

    void show() {
        System.out.println("Child Method Called");
    }

    void display() {
        System.out.println("Display");
    }
}

class f {
    public static void main(String[] args) {
        params p = new chill();
        // params q = new params();
        p.name = "xyz";
        p.printt();
        // p.display(); // Error
        // chill c = new params(); // Error
        chill c = (chill) p;
        c.printt();
        c.show();

    }
}