import java.util.Scanner;

public class Recursive {
	/**
     * Goal: Define recursively using your math knowledge.
	 *  - Sum(N) = 1 + 2 + 3 + ... + N
		- BiPower(N) = 2^N
		- TimesFive(N) = 5N
	 * @param args
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a non-negative whole number: ");
        int N = sc.nextInt();
        System.out.println("Sum(N): " + Sum(N));
        System.out.println("2^N: " + BiPower(N));
        System.out.println("5N: " + TimesFive(N));
        System.out.println("Fib(N): " + NonReFib(N));
	}

	
	public static int Sum(int N) {
		if(N==0) {
			return N;
		}
		else {
			N += Sum(N-1);
		} 
		return N;
	}
	
	public static int BiPower(int N) {
		int two = 2;
		if(N<=1) {
			
		} else {
			two *= BiPower(N-1); // repeat 2*2 N times
		}
		return two;
	}
	
	public static int TimesFive(int N) {
		int five = 5;
		if(N<=1) {
			
		} else {
			five += TimesFive(N-1); // repeat 5+5 N times
		} 
		return five;
	}
	
	public static int Fib(int N) {
		if ( N==0 || N==1) {
			return N;
		} else {
			N = Fib(N - 2) + Fib(N - 1);
		}
		return N;
	}
	
	public static int NonReFib(int N) {	//Index starts with 0
		int first = 0;					
		int second = 1;
		for(int x=1; x<N; x++) { 
			if(x%2==0) {			//Increase first if x is even
				first = first + second;	//move first up one index
				//System.out.println("even" + N + " : first: " + first);
			}
			else {					//Increase second if x is odd
				second = first + second;	//move second up one index
				//System.out.println("odd" + N + " : second: " + second);
			}
		}
		return N = first + second;

	}
	

	
}

