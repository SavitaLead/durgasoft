package durgasoft;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class JavaPrograms {
	
	@Test
	public void P1_OddEvenNumber() {
		//Odd and Even number
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		
		
		if(num>0) {
				System.out.println("Valid Number");
				if(num%2==0)
				{
					System.out.println("Even Number");
				} else 
				{
				 
					System.out.println("Odd Number");
				}
		}
		else {
			System.out.println("Invalid Number");
		}
	}
	
	@Test
	public void P2_program2() {
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		
		
		if(num%2!=0)
			System.out.println("Weired");
		else {
			if(num>=2 && num<=5) {
				System.out.println("Weired");
			}else if (num>=5 && num<=20) {
				System.out.println("NOT Weired");
			}
		}
	}
	
	@Test
	public void P3_leapYr() {
		//leap year
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the Valid year : ");
		int year = scr.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0)){
			System.out.println("Leap Year");
		}else {
			System.out.println("NOT Leap Year");
		}
	}
	
	@Test
	public void P4_conditionalIf() {
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the Valid 2 digit number : ");
		int n = scr.nextInt();
		
		if(n>0 && n<100) {
			
			if(n>=30 && n<=50) {
				System.out.println("Category D");
			}else if(n>=51 && n<=60) {
				System.out.println("Category C");
			}else if (n>=61 && n<=80) {
				System.out.println("Category B");
			}else
				System.out.println("Category A");
			}
		else
			System.out.println("Invalid Number");
		}
		
	@Test
	public void P5_postIncrement() {
		//Take the number as input and increment by 1 and print the value
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		System.out.println(++num);
	}
	
	
	@Test
	public void P6_sumOfPrimeNos() {
		//Sum of prime numbers
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		
		int sum=0;
		int d;
		
		while(num!=0) {
			d = num%10;
			if(d==2 || d==3 ||d==5 || d==7) {
				sum = sum+d;
			}
				num = num/10;
		}
		
		System.out.println("Sum of prime numbers is: "+sum);
	}
	
	
	@Test
	public void P7_sumOfDivisableBy3() {
		//Sum of numbers which is divisible by 3
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		
		int sum=0;
		int d;
		
		while(num!=0) {
			d = num%10;
			//OR d%3==0
			if(d==3 || d==6 ||d==9 ) {
				sum = sum+d;
			}
				num = num/10;
		}
		
		System.out.println("Sum of prime numbers is: "+sum);
	}
	
	@Test
	public void P8_CountNoOfDigits() {
		//Sum of numbers which is divisible by 3
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		
		int count=0;
		while(num!=0) {
			count++;
			num = num/10;
		}
		
		System.out.println("Number of digits is: "+count);
	
			
	
	//OR
	
	//Sum of numbers which is divisible by 3
	/*
	 * Scanner scr = new Scanner(System.in); System.out.print("Enter the number: ");
	 * String num = scr.nextLine();
	 * System.out.println("Number of digits is: "+num.length());
	 */
	}
	
	@Test
	public void P9_sumOfOddNos() {
		//Sum of numbers which is divisible by 3
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		
		int sum=0;
		int d;
		
		while(num!=0) {
			d = num%10;
			//OR d%3==0
			if(d%2!=0) {
				sum = sum+d;
			}
				num = num/10;
		}
		
		System.out.println("Sum of odd numbers is: "+sum);
	}
	
	@Test
	public void P10_reverseOfNumber() {
		//Sum of numbers which is divisible by 3
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		int rev = 0;
		int d;
		
		while(num!=0) {
			d = num%10;
			rev = rev*10+d;
			num = num/10;
		}
		
		System.out.println("reverse of the number numbers is: "+rev);
	}
	
	@Test
	public void P11_vowelORConsonant() {
		//Find the given character is vowel or consonant
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = scr.nextLine();
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i' || str.charAt(i)=='o'||str.charAt(i)=='u')
				System.out.println("Given Character is Vowel: "+str.charAt(i));
			else
				System.out.println("Given Character is Consonant: "+str.charAt(i));
		}
	}
	
	@Test
	public void P12_LargestOfThreeNos() {
		//Largest of Three numbers
		int a = 10;
		int b = 50;
		int c = 40;
		int largest;
		if(a > b && a > c) 
			largest = a;
		 else if(b > c) 
			 largest = b;
		  else
			 largest = c;
		System.out.println("Largest of three numbers is: "+largest);
		   
		}
	
	@Test
	public void P13_SwapTwoNOs() {
		//Largest of Three numbers
		int a = 10;
		int b = 50;
		
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
		
		a = a+b;//10+50=60
		b = a-b; //60-50=10
		a = a-b;
		
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
		   
		}
	
	
	@Test
	public void P14_ReverseOfString() {
		//Largest of Three numbers
		int a = 10;
		int b = 50;
		
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
		
		a = a+b;//10+50=60
		b = a-b; //60-50=10
		a = a-b;
		
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
		   
		}
	
	
	@Test
	public void P15_DuckNumber() {
		//Find the given number is Duck(Number should contain 0 except begning number
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: "); //56709
		
		int num = scr.nextInt();
		
		int flag =0;
		int d;
		while(num!=0) {
			
			d = num%10;
			if(d==0) {
				flag =1;
				break;
			}
			num = num/10;
		}
		
		if(flag==1)
			System.out.println("Given number is duck number");
		else
			System.out.println("Given number is Not a duck number");
	}
	
	@Test
	public void P16_NoOfTimesDigitOccures() {
		//Find the KEY(digit) occurs no of times for a given number //123456122 - 1 occurs 2 times
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		
		System.out.print("Enter the KEY(number): ");
		int key = scr.nextInt();
		int count =0;
		while(num!=0) {
			if(num%10 == key) {
				count++;
			}
			   num = num/10;
		}
			System.out.println("The given digit "+key+" Occures "+count+" times"); 
		
	}
		
	
	@Test
	public void P17_FrequencyOfDigits() {
		Scanner sc=new Scanner(System.in);
        int number,i,count,digit,temp;
        System.out.println("Enter any Number : "); //1234320
        number=sc.nextInt();
        System.out.println("Digit\tFrequency");
         
        for(i=0;i<=10;i++)
        {
            count=0;
            temp=number;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"\t"+count);
            }
        }
	}
	
	@Test
	public void P18_Palindrome() {
		//Find the given number is palindrome or Not //121, 434,565,5665
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scr.nextInt();
		int rev = 0, d;
		int temp;
		temp=num;
		while(num!=0) {
			d = num%10;
			rev = rev*10+d;
			num = num/10;
		}
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	
	@Test
	public void P19_FactorialOfNumber() {
		//Find the factorial for a given number
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: "); //56709
		
		int num = scr.nextInt();
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of a given number is :"+fact);
	}
	
	@Test
	public void P20_FabonacciNumber() {
		//Find the fabonacci series for  given number
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: "); //0,1,2,3,5,8...
		
		int num = scr.nextInt();
		int a = 0;
		int b = 1;
		int c;
		System.out.print("Fabonnaci series for given number :"+num+" : ");
		for(int i=1;i<=num;i++) {
			c = a+b;
			System.out.println(c+",");
			a=b;
			b=c;
		}
	}
	
	@Test
	public void P21_ReverseOfNumberWay2() {
		//Find the fabonacci series for  given number
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: "); //1234 - 4321
		int num = scr.nextInt();
		int rev;
		while(num!=0) {
			rev = num%10;
			System.out.print(rev);
			num = num/10;
		}
	}
	
	@Test
	public void P22_PrimeNumber() {
		//Find the given number is prime or not
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number: "); 
		int num = scr.nextInt();
		boolean flag=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) 
				flag = true;
				break;
		}
		
		if (flag==true)
			System.out.println("Given number is NOT a prime :"+num);
		else
			System.out.println("Given number is  a prime :"+num);
	
	}
	
	@Test
	public void P23_DuplicateNosArrayWay1() {
		//Find the duplicate numbers in an array
		int[] arr = {1,2,3,4,5,2,3,5,6,7,7};
		
		System.out.print("Duplicate numbers in given array are : ");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j =i+1; j<=arr.length-1;j++) {
				if(arr[i]==arr[j] && i!=j)
					System.out.println(arr[i]+",");
				
			}
		}
	}
	
	@Test
	public void P24_DuplicateNosArrayWay2() {
		//Find the duplicate numbers in an array
		int[] arr = {1,2,3,4,5,2,3,5,6,7,7};
		Set<Integer> set = new HashSet<Integer>();
		System.out.print("Duplicate numbers in given array are : ");
		for(int i=0;i<=arr.length-1;i++) {
			if(set.add(arr[i])==false)
				System.out.println(arr[i]+",");
		}
	}

	
	@Test
	public void P25_LargestElementOfArray() {
		//Find the largest element of an array in an array
		int[] arr = {10,20,30,40,50,60,70,9,8,7,6,5};
		int largest = arr[0];
		
		System.out.print("Largest element of an array is : ");
		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>largest)
				largest = arr[i];
		}
		
		System.out.println(largest);
	}
	

	@Test
	public void P26_SmallestElementOfArray() {
		//Find the largest element of an array in an array
		int[] arr = {10,20,30,40,50,60,70,9,8,7,6,5};
		int smallest = arr[0];
		
		System.out.print("smallest element of an array is : ");
		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]<smallest)
				smallest = arr[i];
		}
		
		System.out.println(smallest);
	}
	
	@Test
	public void ChristmasOffer() {
		/*Christmas offer
		An e-commerce company plans to give their customers a special discount for the Christmas, they are planning to offer a flat discount. The discount value is calculated as the sum of all prime digits in the total bill amount.
		Write an algorithm to find the discount value for the given total bill amount.*/
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the billamount: "); 
		int billamount=obj.nextInt();
		int discount = discount(billamount);
		System.out.println("Special discount on billamount : "+discount+"%");
	}

	private int discount(int num) {
		int s=0;
		int d;
		while(num!=0) {
			
			d = num%10;
			if(d==2||d==3||d==5||d==7)
				s=s+d;
			num = num/10;
		}
		
		return s;
	}
	
	@Test
	public void NivanNumber() {
		/*Write a program to accept a number and check and display whether it is a Niven Number or not.
		Niven Number is that a number which is divisible by its sum of digits.*/

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number: "); 
		int num = obj.nextInt();
		System.out.println(Nivan(num));
		
	}
	
	
	String Nivan(int num){
		
		int s=0;
		int d;
		int temp=num;
		String str = null;
		while(num!=0) {
			d= num%10;
			s=s+d;
			num=num/10;
		}
		
		if(temp%s==0)
			str = "Niven Number";
		else
			str = "Not Niven";
		return str;
		
	}
	
	
}


