class AlphabetThread extends Thread {
    @Override
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Thread alphabetThread = new AlphabetThread();
        Thread numberThread = new NumberThread();

        alphabetThread.start();
        numberThread.start();
    }
}
