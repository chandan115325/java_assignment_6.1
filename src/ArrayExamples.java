import java.util.*;
public class ArrayExamples {
	
	int[] arrPrime = new int[10];
	int[] arrPrimeReverse = new int[10];
	int i=0;
	int flag;
	int count;
	
	public ArrayExamples() {
		// TODO Auto-generated constructor stub
		this.flag=0;
		this.count=0;
	}
	//Parameterized constructor to initialize the array
	public ArrayExamples(int arr[],int ar[])
	{	
		
		for( ;i<10;i++)
		{
			
		this.arrPrime[i]=arr[i];
		this.arrPrimeReverse[i]=ar[i];
		System.out.println("array elements are :"+this.arrPrime[i]);
		//System.out.println("array elements are new array :"+this.arrPrimeReverse[i]);
		}
		
	
		
	}
	
	public void Reverse()
	{	
		/*int j;
		for(j=i-1,i=0;j>=0;j--,i++)
		{	
			System.out.println(i+"j"+j);
			this.arrPrimeReverse[j] = this.arrPrime[i];
			System.out.println("array in reverse order :"+this.arrPrimeReverse[i]);
			
		}*/
		this.arrPrimeReverse[0]=this.arrPrime[9];
		this.arrPrimeReverse[1]=this.arrPrime[8];
		this.arrPrimeReverse[2]=this.arrPrime[7];
		this.arrPrimeReverse[3]=this.arrPrime[6];
		this.arrPrimeReverse[4]=this.arrPrime[5];
		this.arrPrimeReverse[5]=this.arrPrime[4];
		this.arrPrimeReverse[6]=this.arrPrime[3];
		this.arrPrimeReverse[7]=this.arrPrime[2];
		this.arrPrimeReverse[8]=this.arrPrime[1];
		this.arrPrimeReverse[9]=this.arrPrime[0];
		for(int c=0;c<10;c++)
		System.out.print(this.arrPrimeReverse[c]+"\t");
	}
	
	public void PrimeCheck(int a[])
	{	
		int num=0,c=0;
		
		for(int p=2;p<=a[c];p++,c++)
		{	
			
			if(a[c]%p==0  )
			{
				
				this.flag=1;
				break;
				
				
			}
			else
			{
				this.flag=0;
				
			}
			
		}
		if(flag ==0)
		{
			System.out.println("valid input");
			this.count++;
		}
		else
		{
			System.out.println("Invalid input , number is not prime");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		int ar[] = new int[10];
		int num;
		Scanner sc = new Scanner(System.in);
		
		ArrayExamples prime = new ArrayExamples();
		
		while(prime.count!=9)
		{	
			System.out.println("Enter the only prime numbers elements in array  :");
			
			a[prime.count] = sc.nextInt();
			//num=a[i];
			prime.PrimeCheck(a);
			System.out.println("integers count is :"+prime.count);
			
		}
		
		ArrayExamples ae = new ArrayExamples(a,ar);
		
		ae.Reverse();
	}

}
