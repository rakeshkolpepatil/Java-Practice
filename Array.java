
class Student {
	String name;
	int id;

	public void print() {
		System.out.println("The name of student is " + name + " and id is " + id);
	}
}

public class Array {
	public static void main(String[] args) {
		Student d[] = new Student[10];
		
		for(int i=0; i<10; i++) {
			d[i] = new Student();
		}
		
		for (int i = 0; i < 10; i++) {
			d[i].name = "Hi";
			d[i].id = i;
		}
		
		for (int i = 0; i < 10; i++) {
			d[i].print();
		}
		
		// even sized 2 dimensional array
		int array[][] = new int [2][3];
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
		
		// uneven sized ragged array
		int array1[][] = {
				{1,2,3,4,5,6},
				{0,1,2,3},
				{1}
		};
		
		for(int i=0; i < array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				System.out.print(" "+ array1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(" The other way of prining elements of 2d array ");
		// The new way of printing elements.
		for(int k[]: array1) {
			for(int l: k) {
				System.out.print(" "+l);
			}
			System.out.println();
		}
		
		
	}
}
