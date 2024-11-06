public class OperatorsAndNumbers {
    public static void main(String[] args) {
        leftShift();
    }
        public static void leftShift() {
            int x = 2;
            System.out.println(Integer.toBinaryString(x));

            // Predicted decimal value: 4
            // Predicted binary string: 100
            x = x << 1;
            System.out.println("Decimal value: " + x);
            System.out.println(Integer.toBinaryString(x));

            x = 9;
            System.out.println("Initial value of x: " + x);
            System.out.println(Integer.toBinaryString(x));

            // Predicted decimal value: 18
            // Predicted binary string: 10010
            x = x << 1;
            System.out.println("Decimal value: " + x);
            System.out.println(Integer.toBinaryString(x));

            x = 17;
            System.out.println(Integer.toBinaryString(x));

            // Predicted decimal value: 34
            // Predicted binary string: 100010
            x = x << 1;
            System.out.println("Decimal value: " + x);
            System.out.println(Integer.toBinaryString(x));

            x = 88;
            System.out.println(Integer.toBinaryString(x));

            // Predicted decimal value: 176
            // Predicted binary string: 10110000
            x = x << 1;
            System.out.println("Decimal value: " + x);
            System.out.println(Integer.toBinaryString(x));
        }
}