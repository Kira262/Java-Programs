class SumDivisibleByFive {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 101; i < 200; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of integers greater than 100 and less than 200 that are divisible by 5: " + sum);
    }
}
