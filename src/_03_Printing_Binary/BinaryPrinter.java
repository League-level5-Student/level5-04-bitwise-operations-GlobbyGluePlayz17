package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		System.out.println(b);
		System.out.print((b & 0b10000000) >> 7);
		System.out.print((b & 0b1000000) >> 6);
		System.out.print((b & 0b100000) >> 5);
		System.out.print((b & 0b10000) >> 4);
		System.out.print((b & 0b1000) >> 3);
		System.out.print((b & 0b100) >> 2);	
		System.out.print((b & 0b10) >> 1);
		System.out.print((b & 0b1) >> 0);
	}
	
	public void printShortBinary(short s) {
		System.out.println(s);
		for (int i = 16; i <= 0; i++) {
			int binary = 10^i;
			binary = Integer.toBinaryString(binary);
			System.out.print((s & binary) >> i);
		}
		System.out.print((s & 0b10000000) >> 8);
		System.out.print((s & 0b10000000) >> 7);
		System.out.print((s & 0b1000000) >> 6);
		System.out.print((s & 0b100000) >> 5);
		System.out.print((s & 0b10000) >> 4);
		System.out.print((s & 0b1000) >> 3);
		System.out.print((s & 0b100) >> 2);	
		System.out.print((s & 0b10) >> 1);
		System.out.print((s & 0b1) >> 0);
	}
	
	public void printIntBinary(int i) {
		int binary[] = new int[Integer.BYTES];
		int index = 0;
		while (i > 0) {
			binary[index++] = i%2;
			i = (i/2);
		}
		System.out.println(i);
	}
	
	public void printLongBinary(long l) {
		
	}
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary(Byte.MAX_VALUE);
		System.out.println("\n -=-=+=-=-");
		bp.printShortBinary(Short.MAX_VALUE);
		System.out.println("\n -=-=+=-=-");
		bp.printIntBinary(4);
		System.out.println("\n -=-=+=-=-");
		bp.printLongBinary(Long.MAX_VALUE);
		
		
	}
}
