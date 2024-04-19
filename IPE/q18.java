class SumOfOneToK {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a value for k as a command line argument.");
            return;
        }

        int k = Integer.parseInt(args[0]);

        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from 1 to " + k + ": " + sum);
    }
}
