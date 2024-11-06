public class OperatorsAndNumbers {
    public static void main(String[] args) {
        leftShift();
        rightShift();
        andOperator();
        orOperator();
        postfixOperator();
        prefixAndPostfix();
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

        public static void andOperator() {
            int x = 7;
            int y = 17;

            // Prediction of decimal value is 1
            // Prediction of binary value is 0000 0001

            int z = x & y;
            System.out.println(Integer.toBinaryString(z));
        }

    /* Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y. As before, write a comment that indicates what you predict the values to be before printing them out. */

        public static void orOperator() {
            int x = 10;
            int y = 25;

            int z = x | y;

            //

            System.out.println("Decimal value of x | y: " + z);
            System.out.println(Integer.toBinaryString(z));
        }

    /* Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value. Print the value before and after the increment operator. */

        public static void postfixOperator() {
            int num = 15;
            System.out.println("Before increment: " + num);
            num++;
            System.out.println("After increment: " + num);
        }

   /* Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times. Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again. */

        public static void incrementer() {
            int num = 25;
            num++;
            System.out.println("After postfix increment: " + num);

            ++num;
            System.out.println("After prefix increment: " + num);

            num += 1;
            System.out.println("After addition increment: " + num);
        }

        /* Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y. Create another variable sum and assign the value of ++x added to y, and print the result. Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum, while the second configuration calculated the sum, and then incremented x. */

        public static void prefixAndPostfix() {
            int x = 5;
            int y = 8;

            int sum = x++ + y;
            System.out.println("Prefix increment: " + sum);
        }

}