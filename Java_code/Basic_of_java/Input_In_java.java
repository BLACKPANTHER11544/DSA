import java.util.Scanner ; 

public class Input_In_Java{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in) ; 
      System.out.println("Enter the Numbers"); 
      int number1 = sc.nextInt() ; 
      int number2 = sc.nextInt() ; 
      int sum = number1 + number2 ; 
      System.out.println("The Sum given numbers are "+ sum); 
    }
}

/* 
Inputs in java are taken with help of Scanner class ;
Process of taking inputs is : 
1> Firstly we have to import the Scanner class into our file
2> Then we'll have to create an instance of the Scanner class, inside the entry-point(main function) of the java code, Example (creating instance of Scanner Class)=> "Scanner sc = new Scanner(System.in)" . 
3> Then we can take input from the user by initializing the variable by sc'instance of the Scanner fuction'.next'data-type of variable'(), Example, here we'll take input from user where the data-type of variable is Integer. 

import java.util.Scanner ; 
......
Scanner sc = new Scanner(System.in); 
System.out.println("Enter number"); 
int number1 = sc.nextInt(); 
System.out.println(number1); 
........


Note: 
To take input of different data-type we'll have to write the data-type after sc.next(_______) here are some examples :
 
1> sc.nextInt() = integer , 
2> sc.nextFloat() = Floating value , 
3> sc.nextChar() = Character value , 
4> sc.nextDouble = Double value ,
5> sc.Long() = Long value , 
6> sc.Short() = short value , 
7> sc.Byte() = Byte value ,
........ And Etc .


*/