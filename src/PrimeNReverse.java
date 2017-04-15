//a program Declare and initialize an integer array of size 10. Fill it with only prime numbers. (step-1) Create another integer array of size 10 and copy the values of first array into second array in the reverse order and print them. (step-2)
public class PrimeNReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring both array of size 10 and initialized primeArray with prime numbers
		
		int primeArray[] = {2,3,5,7,11,13,17,19,23,29};
		int reverseArray[] = new int[10];
		System.out.println("Elements in array is :");
		//Displaying the prime elements in arrayPrime
		for(int i=0;i<10;i++)
		System.out.print("\t"+primeArray[i]);
		
		//reversing prime numbers in reverseArray
		for(int i=0,j=9 ; i<10 && j>=0 ;i++,j--){
			reverseArray[i]=primeArray[j];
		}
		
		//Displaying reversed array prime elements
		System.out.println("\nElements after getting reversed :");
		for(int i=0;i<10;i++)
		{
			System.out.print("\t"+reverseArray[i]);
		}
	}

}
