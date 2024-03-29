class this1 {
    int id, no;

    this1(int id, int no) {
        this.id = id;
        this.no = no;
    }

    this1 add1(this1 f, this1 i) {
        id = f.id + i.id;
        no = f.no + i.no;
        return this;
    }

    this1() {

    }

    void gethits() {
        System.out.println("ID: " + id);
        System.out.println("No: " + no);
    }
}

class two_four {
    public static void main(String[] args) {
        this1 f1 = new this1(10, 20);
        this1 f2 = new this1(46, 20); 
        this1 f3 = new this1();
        this1 f4 = new this1();
        f4 = f3.add1(f1, f2);
        f4.gethits();
    }
}