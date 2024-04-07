class Temperature {
    double fahrenheit;
    double celsius;

    // Method to convert Fahrenheit to Celsius
    void fahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");
    }

    // Method to convert Celsius to Fahrenheit
    void celsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
    }
}

class Qb29 {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.fahrenheit(98.6); // Calling method to convert Fahrenheit to Celsius
        temp.celsius(37); // Calling method to convert Celsius to Fahrenheit
    }
}
