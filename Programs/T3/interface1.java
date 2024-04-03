interface Int {
    void m1();
}

class test implements Int {
    // Child class should provide definition of all abstract method of interface.
    public void m1() {
    }
}