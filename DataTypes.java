
public class DataTypes {
	public static void main(String[] args) {
		Byte b = 10;
		byte pb = 1; //Note that when keyword is written with small case it is primitive data type.
					 // Whereas in above line "Byte" is a Byte class which wraps byte primitive data type.
		
		Character c = 'R';
		char pc='a';		
		Short s = 100;
		short ps = 200;		
		Integer I = (int) 1.2 ; // Explict type conversion.
		int pi = 1;		
		Float f = 1.2f;
		float pf = 1.2f;	
		Double d = 1.2345678;
		Long l = 123L;
		
		
		
		//Please note that float values need to be appended by 'f', long values need to be appended by 'l' and 
		// keyword for character data type is 'Character' and not 'char'.
		
		System.out.println("The value of b is = "+ b);
		System.out.println("The value of c is = "+ c);
		System.out.println("The value of s is = "+ s);
		System.out.println("The value of f is = "+ f);
		System.out.println("The value of d is = "+ d);
		System.out.println("The value of l is = "+ l);
		
		System.out.println("The min and max values of Byte are = "+ Byte.MIN_VALUE + ", "+Byte.MAX_VALUE);
		//System.out.println("The min and max values of byte are = "+ byte.MIN_VALUE + ", "+byte.MAX_VALUE);
		// Note that in above line we are using "byte" and as it is prmitive data type, it does not have MIN_VALUE functions.
		
		System.out.println("The min and max values of Character are = "+ Character.MIN_VALUE + ", "+Character.MAX_VALUE);
		System.out.println("The min and max values of Short are = "+ Short.MIN_VALUE + ", "+ Short.MAX_VALUE);
		System.out.println("The min and max values of Float are = "+ Float.MIN_VALUE + ", "+ Float.MAX_VALUE);
		System.out.println("The min and max values of Double are = "+ Double.MIN_VALUE + ", "+ Double.MAX_VALUE);
		System.out.println("The min and max values of Long are = "+ Long.MIN_VALUE + ", "+ Long.MAX_VALUE);
		
		
		System.out.println("\nThe size of byte is = "+ Byte.SIZE/8 + " Bytes");
		System.out.println("The size of Character is = "+ Character.SIZE/8 + " Bytes");
		System.out.println("The size of Short is = "+ Short.SIZE/8 + " Bytes");
		System.out.println("The size of Integer is = "+ Integer.SIZE/8 + " Bytes");
		System.out.println("The size of Float is = "+ Float.SIZE/8 + " Bytes");
		System.out.println("The size of Double is = "+ Double.SIZE/8 + " Bytes");
		System.out.println("The size of Long is = "+ Long.SIZE/8 + " Bytes");
	}
}
