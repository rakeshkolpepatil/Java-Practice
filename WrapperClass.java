/*
 * For all the primitive data types Java has warpper classes.
 * char    -> Character
 * byte    -> Byte
 * short   -> Short
 * int     -> Integer
 * long    -> Long
 * float   -> Float
 * double  -> Double
 * boolean -> Boolean
 * 
 */

public class WrapperClass {
	public static void main(String[] args) {
		int x = Integer.parseInt("12234578");
		Integer i =0; // Auto-boxing
		System.out.println("The parsed string is = "+ x);
		Integer y = new Integer(5); // Wrapping of primitive data type around an object is called as "Boxing/Wrapping".
		int yy = y.intValue();      // Getting value of object into primitive data type is called as "Unboxing/Unwrapping"
		int z = y;   // This is auto unboxing.
		System.out.println("The value of yy is = "+ yy);
	}
}
