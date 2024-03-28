// This Keyword

class Fac {
    int id, no;

    void setFac(int id, int no) {
        this.no = no;
        this.id = id;
    }

    void display() {
        System.out.println("id:" + id);
        System.out.println("no:" + no);
    }
}

class Mein {
    public static void main(String[] args) {
        Fac obj = new Fac();
        obj.setFac(22, 23);
        obj.display();
    }
}