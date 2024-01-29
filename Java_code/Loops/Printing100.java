/*
while(condition){
    .....
    terminating condition 
    .....
}
Loops start hoga while keyword ke sath and jab tak parenthesis ye andar ki terminating condtion false rhegi tab tak code chalta rhega, 
To issi liye terminating condition ka true hona is also important, werna infinite loop ban jayega, aur bekar main computer ki memory khayega.
So the Loop Stops jab terminating condition true ho jati hai . And it achieve terminating condition we usually use loop counters. 
Example : 
int counter = 1 ; 
This is a loop counter
*/


public class Printing100{
    public static void main(String args[]){
        int counter =1 ; 
        while(counter <=100){
            System.out.println(counter) ; 
            counter++; 
        }
    }
}