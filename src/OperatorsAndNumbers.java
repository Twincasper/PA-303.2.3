public class OperatorsAndNumbers {
    public static void main(String[] args) {
        leftShift();
        rightShift();
        andOperator();
    }
        public static void leftShift() {
            int x = 2;
            System.out.println(Integer.toBinaryString(x));

            // Prediction of decimal value: 4
            // Prediction for binary string: 100
            x <<= 1;
            System.out.println("Decimal value: " + x);
            System.out.println(Integer.toBinaryString(x));

            x = 9;
            System.out.println("Initial value of x: " + x);
            System.out.println(Integer.toBinaryString(x));

            // Prediction of decimal value: 18
            // Prediction for binary string: 10010
            x <<= 1;
            System.out.println("Decimal value: " + x);
            System.out.println(Integer.toBinaryString(x));

            x = 17;
            System.out.println(Integer.toBinaryString(x));

            // Prediction of decimal value: 34
            // Prediction for binary string: 100010
            x <<= 1;
            System.out.println("Decimal value: " + x);
            System.out.println(Integer.toBinaryString(x));

            x = 88;
            System.out.println(Integer.toBinaryString(x));

            // Prediction of decimal value: 176
            // Prediction for binary string: ???
            x <<= 1;
            System.out.println("Decimal value: " + x);
            System.out.println(Integer.toBinaryString(x));
        }

        public static void rightShift() {
            int x = 150;
            System.out.println(Integer.toBinaryString(x));
            x >>= 1;

            // Prediction of decimal value: 75
            // Prediction for binary string: 1001011

            System.out.println("Decimal value of 150 right shifted: " + x);
            System.out.println(Integer.toBinaryString(x));


            x = 225;
            System.out.println(Integer.toBinaryString(x));
            x >>= 1;

            // Prediction of decimal value 112
            // Prediction of binary value 1110000


            System.out.println("Decimal value of 225 right shifted: " + x);
            System.out.println(Integer.toBinaryString(x));

            x = 1555;
            System.out.println(Integer.toBinaryString(x));
            x >>= 1;

            // Prediction of decimal value 777
            // Prediction of binary value 1100001001

            System.out.println("Decimal value of 1555 right shifted: " + x);
            System.out.println(Integer.toBinaryString(x));

            x = 32456;
            System.out.println(Integer.toBinaryString(x));
            x >>= 1;

            // Prediction of decimal value 16228
            // Prediction of binary value 11111101100100

            System.out.println("Decimal value of 32456 right shifted: " + x);
            System.out.println(Integer.toBinaryString(x));
        }

    /* Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y. Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z. */

    public static void andOperator() {
        int x = 7;
        int y = 17;

        // Prediction of decimal value is 1
        // Prediction of binary value is 0000 0001

        int z = x & y;
        System.out.println(Integer.toBinaryString(z));
    }
}