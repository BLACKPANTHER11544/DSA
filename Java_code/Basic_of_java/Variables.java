public class Variables  {
    public static void main(String args[]){
        int number = 5 ; 
        String name= "BLACKPANTHER11544" ;
        System.out.print("number is "+number+" and name is "+name); 
    }
}

/* variables are the containers that can store value in them , these container/variables are stored in the memory and each variable in assign to a single block in the
memory.

Note the size of these block in memory differs based on the type of the variable . 
Some Type of variables are : 
a>interger value = int , size=32 bits 
b>decimal values = float , size=32 bits 
c>single character = char  ,size= 16 bits 
d>String value = String
and etc etc . 

Note the data types are of two types 
a>primitive data type 
Primitive data types are the predefined type by the compiler and they specifies the size and type for any variable, Apart from this they dont have any methods .
example of primitive data type => int, float, char, boolean, short, long and etc .
b>Non primitive data type 
Non Primitive data types are the user defiened types and the size of these types are ususally not pre-knonw. 
example of Non-primitive data types =>String array classes . 

Note, the Syntax for declearing a variable : 
data-type name-of-variable assignment_operator value that is to be assigned 

Note: 
It is not necessary to initialize the variable at the same time of declearing. As it can be done later also. 

Note : 
Like any other programming language java doesn't directly support CONSTANT variables. 
So how is any variable is made constant, So in here(java) we have two way of doing that 

1> using static modifier 
the advantage of using static modifier is in momery management, because when any varible with static modifier is decleared as well as initialized then the value of that variable 
can be used anywhere in the code base even without creating any instance of the class in which that variable is defined. Example Static int value = 5 ; 

2> using final modifier 
final modifier makes the promitive data types vlaues immutable/unchangeble 
final int name="BLACKPANTHER11544" ; 
So now if we'll reinitialize variable name then we'll get error as the variable is decleared with modifier final. 

*/

/*
Declearing variables in java : 
In java, A variable's name can be any legal identifier — an unlimited-length sequence of Unicode letters and digits, beginning with a letter, the dollar sign " $ ", 
or the underscore character " _ ". The convention, however, is to always begin your variable names with a letter, not " $ " or " _ ".
*/