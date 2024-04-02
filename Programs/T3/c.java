class Parent {
    void printt() {
        System.out.println("Method to Parent Class");
    }
}

class child extends Parent {
    void printt() {
        System.out.println("Method to Child Class");
    }
}

class example {
    public static void main(String[] args) {
        Parent obj = new child();
        Parent obj1 = (Parent) new child();
        obj.printt();
        obj1.printt();
    }
}