class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class TransactionThread extends Thread {
    private BankAccount account;
    private boolean isDeposit;
    private double amount;

    public TransactionThread(BankAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        TransactionThread depositThread1 = new TransactionThread(account, true, 200);
        TransactionThread withdrawThread1 = new TransactionThread(account, false, 300);
        TransactionThread depositThread2 = new TransactionThread(account, true, 500);
        TransactionThread withdrawThread2 = new TransactionThread(account, false, 700);

        depositThread1.start();
        withdrawThread1.start();
        depositThread2.start();
        withdrawThread2.start();
    }
}
