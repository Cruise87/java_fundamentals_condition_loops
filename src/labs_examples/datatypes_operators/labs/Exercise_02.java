package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 * <p>
 * Write the necessary code to demonstrate type conversion:
 * <p>
 * Widening:
 * 1. Declare and initialize an int with the value 10
 * 2. Declare a double and set it equal to the int
 * 3. Print out the double
 * <p>
 * Narrowing (with casting):
 * 1. Declare and initialize a new double with the value 10.5
 * 2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 * 3. Print out the int
 * <p>
 * Notice how each type is converted. In which direction is information lost?
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // write code here
        int x = 10;
        double y = x;
        System.out.println(y);
        double z = 10.5;
        int w = (int) z;
        System.out.println(w);
    }
}
