
/* 
 * CSS 162 Assert Demo
 * 
 * Usage: This software is configured to crash your program immediately upon 
execution.
 * If your software doesn't crash, you don't have assertions enabled (use "-ea")
 * in your editor.  Google the name of your editor and "how to enable asserts" or 
follow
 * the instructions specific to Eclipse in the lab.
 * 
 * Author: Rob Nash
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AssertDemo {
    /*
     * Work on this in a piecewise fashion by uncommenting and focusing on one
     * section at a time
     * in isolation rather than running everything at once.
     */
    public static void main(String[] args) {
        assert (true);
        assert (false);
        warmUpAsserts();
        assertWithPrimitives();
        assertWithObjects();
        homeworkRelatedAsserts();
    }

    /*
     * Just a few warm-up asserts here.
     * Add two new assert() statements after the TODO below
     */
    private static void warmUpAsserts() {
        assert (5 > 1);
        int a = 30;
        assert (a != 0);
        assert (null == null); // could this ever be false?
        assert (true == true); // a bad day indeed if this could be false
        // TODO: Craft two more asserts and place them here. If they're false, they'll
        // crash the program.
        int b = 10;
        int c = 20;
        assert (b < c);
        assert (b > c);
    }

    /**
     * Using asserts in conjunction with primitive types is familiar to you;
     * just as in a loop or if statement, you want to form a true/false (boolean)
     * expression
     * by employing the relational operators.
     */
    private static void assertWithPrimitives() {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter an integer numerator:");
        int num = keys.nextInt();
        System.out.println("Enter an int denominator, not 0:");
        int denom = keys.nextInt();
        // assert to ensure a Fraction's denominator is never 0
        assert (denom != 0);
        ArrayList<String> emptyList = new ArrayList<String>();
        // assert that all ArrayLists start empty
        assert (emptyList.size() == 0);
        // TODO: build two more asserts that use primitives and relational operators
        // here
        int d = 50;
        int e = 30;
        assert (d > e);
        assert (d < e);
    }

    /*
     * Asserts work with both primitives and objects. Just as you
     * use "==" with primitives and ".equals()" with objects, so too
     * will you use ".equals()" in asserts that deal with object equality.
     */
    private static void assertWithObjects() {
        AssertDemo ad = new AssertDemo();
        ad.checkAddress(ad);
        // guess what .equals() does if you don't create one yourself? (hint ==)
        assert (ad.equals(ad));
        // TODO: make a few objects from any previous lab and test them with assert
        // example: make two Point objects at the origin and assert they are equal
        // assert(p1.equals(p2); //example
    }

    /**
     * This function compares the address at "this" to the address of the object
     * handed
     * into the function.
     */
    public void checkAddress(Object input) {
        System.out.println("Address of this :" + this);
        System.out.println("Address of input:" + input);
        // how many aliases for the one "new" object created in main exist in this
        // scope?
        // 1? 2? 3? Which are they?
        assert (this == input); // == does an address check for objects, which is frequently NOT what we want
    }

    /**
     * Asserts are a useful tool for transforming postconditions and class
     * invariants into code.
     * Lets build a few asserts that work with your current Bill & Money
     * assignment.
     * Change the value of paidDate and cents to trip the asserts and observe the
     * asserted error message.
     */
    private static void homeworkRelatedAsserts() {
        Object date = new Object(); // really, a Date
        assert (date != null); // perhaps one rule is that date shouldn't be null after calling setDate()
        int cents = 0;
        assert (cents >= 0 && cents <= 99); // another class invariant is writtenas an assert here.
        // TODO: craft 2 more asserts that you could use with any assignment
    }

}
