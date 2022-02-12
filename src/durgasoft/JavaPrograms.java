package durgasoft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
	
	@Test
	public void P27_List() {
		//List implements collectin interface
		//List allows duplicate elements 
		//LIST allows null values
		//LIST classes are 1.ArrayLIst,2.LinkedList 3.Vector
		//LIST is indexed based
		//LIST retrive the elements the randomly,since it is index based
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("india");
		al.add("paksitan");
		al.add("singapore");
		al.add("bangladesh");
		al.add("austrlia");
		
		System.out.println(al.size());
		//System.out.println(al.get(4));
		
		//al.set(1,"sweden");//it replaces the element at the index 1 with new value as sweden
		
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(al.contains("India")); //false,it searches in the entire list and returns boolen value
		System.out.println(al.contains("india")); //true
		
		System.out.println(al.indexOf("Singapore")); //elemnt not fond returns -1
		System.out.println(al.indexOf("singapore"));
		//-------------------------------ARRAYLIST-----------------------------------------
		//LinkedList implements LIST and QUEUE interface
		//It is also indexed based
		//In LinkedLIst we can add null and duplicate elements
		//LinkedList uses circular linked list data structure algorithm to store the elemnts
		//So the linkedLIst is FAST when we are adding the elements in between
		//LinkedList class provides four methods addFirst(),addLast(),getFirst(),getLast()
		
		LinkedList<String> ls=new LinkedList<String>();
		
		ls.add("france");
		ls.add("norway");
		ls.add("netherlands");
		ls.add("amesterderm");
		ls.add("finland");
		
		Iterator<String> it1=ls.iterator();
		
		/*while(it1.hasNext()){
			
			System.out.println(it1.next());
		}*/
		
				
		ListIterator<String> it2=ls.listIterator();
		
		while(it2.hasNext()){
			System.out.println("Listinterface forward direction::="+it2.next());
		}
		
		while(it2.hasPrevious()){
			System.out.println("Listinterface backward direction::="+it2.previous());
		}
		
		
		//-------------------------------LINKEDLIST-----------------------------
		
		//VECTOR
		//Vector is similar to Arraylist,but all the methods of vector class are synchronised,
		//hence its thread safe
		//Vector is a legacy class,its available since JAVA 1.0 release
		
		
		//DIFFERENCE BETWEEN ARRAYLIST AND LINKEDLIST
		
		//ARRAYLIST :implements lIST interface
		//LINKEDLIST : implements LIST and QUEUE interface
		
		//ARRAYLIST : is fast if we are adding or removing the elements at the end.
		//LINKEDLIST :is fast if we are adding the elements in between
		
		//ARRAYLIST : itrate faster than linkedList
		//LINKEDLIST : itrate slower than Arraylist
		
	}
	
	@Test
	public void P28_Set() {
		// TODO Auto-generated method stub
		//it will not allow duplicate values to add 
		//Set interface which extends the collection interface
		//Set Classes do not allow duplicate elements
		//Set Classes := 1.HashSet(Random order),2.TreeSet(Ascending order),3.LinkedHashSet(Maintains the insertion order),
		//Set is not an indexed based ,in order to retrive the elements iterator class needs to be used
		
		//Hashset is not ordered or sorted ie random
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("india");
		hs.add("paksitan");
		hs.add("singapore");
		hs.add("bangladesh");
		hs.add("austrlia");
		
		
		//retrive the elements using the for each,Enumaration and Iterator
		/*for(Object ele:hs){
			System.out.println("it prints the elements in random order::"+ele);
		}*/
		
		//2.Iterator ,
		//Iterator class is a unidirectional(only forward direction)
		//And it works for all the collection classes
		//it has three methods 1.hasnext(),2.next(),3.remove
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//-----------------end of hashSet example---------------------
		
		LinkedHashSet<String> lhs=new LinkedHashSet();
		//LinkedHashSet is maintains the insertion order
		lhs.add("india");
		lhs.add("paksitan");
		lhs.add("singapore");
		lhs.add("bangladesh");
		lhs.add("austrlia");
		
		Iterator<String> it1=lhs.iterator();
		
		while(it1.hasNext()){
			System.out.println("LinkedHashSet maintainsthe insertion order:+"+it1.next());
		}
		
		//-----------------end of LinkedHashSet example---------------------
		TreeSet<String> ts=new TreeSet();
		//TreeSet maintains the insertion order
		ts.add("india");
		ts.add("paksitan");
		ts.add("singapore");
		ts.add("bangladesh");
		ts.add("austrlia");
		
		for(Object ele1:ts){
			System.out.println(ele1);
		}
		
		Iterator<String> it3=ts.iterator();
		while(it3.hasNext()){
			System.out.println("It sorts in ascending order TreeSet:="+it3.next());
		}
		
	}
	
	@Test
	public static void P29_ConcatStrings() {
		
		//Program to concatenate the two strings
	    // create first string
		Scanner scr = new Scanner(System.in);
	    String first =scr.nextLine();
	    System.out.println("First String: " + first);
	    
	    Scanner scr1 = new Scanner(System.in);
	    // create second
	    String second = scr1.nextLine();
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);
	    
	  }
	
	@Test
	public void P30_CompareTwoStringsEqualsMethod() {

	    // create 3 strings
	    String first = "java programming";
	    String second = "java programming";
	    String third = "python programming";

	    // compare first and second strings
	    boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);

	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	  }
	
	@Test
	public void P31_NoOfWordsString() 
    {	
		//program to count the number of words in a string?
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[] words = s.trim().split(" ");
        System.out.println("Number of words in the string = "+words.length);
    }
	
	@Test
	public void P32_CountNoOfOccurancesString()
    {	
		//program to count the total number of occurrences of a given character in a string without using any loop
        String s = "Java is java again java again";
       //char c = 'a';
        int count = s.length() - s.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
    }
	
	@Test
	public void P33_ConvertStringToInteger()
    {
        String s = "2015";
        int i = Integer.parseInt(s);
        System.out.println(i);          //Output : 2015
    }
	
	@Test
	public void P34_ConvertStringToInteger()
    {
        String s = "2015";
        int i = Integer.valueOf(s);
        System.out.println(i);          //Output : 2015
    }
	
	
	@Test
	public void P35_ConvertIntegerToString()
    {
		int i = 2015;
        String s = Integer.toString(i);
        System.out.println(s);     //Output : 2015
    }
	
	@Test
	public void P36_ConvertIntegerToString()
    {
		int i = 2015;
        String s = String.valueOf(i);
        System.out.println(s);     //Output : 2015
    }
	
}


