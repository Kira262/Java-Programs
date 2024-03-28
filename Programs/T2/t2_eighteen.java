// Static Keyword

class std_nt {
    int rno;
    String name;
    static String clg = "FF";

    static void change() {
        clg = "Name NAme";
    }

    std_nt(int r, String m) {
        rno = r;
        name = m;
    }

    void display() {
        System.out.println(rno + "\t" + name + "\t" + clg);
    }
}

class t2_eighteen {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        std_nt obj = new std_nt(11, "Karen");
        obj.display();
        obj.change();
        obj.display();
    }
}