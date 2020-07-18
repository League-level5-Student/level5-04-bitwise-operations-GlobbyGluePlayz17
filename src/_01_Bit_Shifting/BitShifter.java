package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;   // in binary: 100
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);  // in binary: 1000
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		//adds a bit? no multiplies by 2
		// 4. Try shifting num 3 places.
		int numShifted3 = num << 3;
		System.out.println(numShifted3);
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
