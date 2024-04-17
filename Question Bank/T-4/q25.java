import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class InductionMachineAnalysis {
    public static void main(String[] args) {
        List<Double> machinePrices = new ArrayList<>();
        machinePrices.add(10000.0);
        machinePrices.add(55000.0);
        machinePrices.add(80000.0);
        machinePrices.add(25000.0);
        machinePrices.add(55000.0);

        System.out.println("List of Machine Prices: " + machinePrices);

        double maxPrice = Collections.max(machinePrices);
        System.out.println("Maximum Price: " + maxPrice);

        Collections.sort(machinePrices);
        System.out.println("Sorted List of Machine Prices: " + machinePrices);
    }
}
