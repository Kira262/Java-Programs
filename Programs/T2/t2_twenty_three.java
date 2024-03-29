class t2_twenty_three {
    public static void main(String[] args) {
        thiss obj = new thiss();
        obj.setthis(20, 32);
        // obj.print(obj);
        obj.objPrint();
    }
}

class thiss {
    int id, no;

    void setthis(int id, int no) {
        this.id = id;
        this.no = no;
    }

    void print(thiss f) {
        System.out.println("This id: " + f.id);
        System.out.println("This no: " + f.no);
    }

    void objPrint() {
        print(this);
    }
}