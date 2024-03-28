// CAlculate max of 5 values. PAss  array as an constructor parameter 
class q1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 ,546,3,23,423,43,2,43,4,234,23,423,4};
        Max ob = new Max(arr);
        System.out.println("MAx Value is: " + ob.CalcMax());
    }
}

class Max {
    int[] val;

    Max(int[] x) {
        val = x;
    }

    int CalcMax() {
        int max = val[0];
        for (int i = 0; i < val.length; i++) {
            if (val[i] > max) {
                max = val[i];
            }
        }
        return max;
    }

}