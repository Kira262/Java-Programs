class Metoo {
    public static void main(String[] args) {
        facc obj = new facc();
        // facc obj = new facc(22,44̥);
        obj.display();
    }
}

class facc {
    int id = 10, no = 20;

    facc(int id, int no) {
        // this();
        this.id = id;
        this.no = no;
    }

    facc() {
        this(55,77);
        System.out.println("Default");
    }

    void display() {
        System.out.println("Id:" + id + "\tNo:" + no);
    }
}