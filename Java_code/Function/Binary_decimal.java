import java.util.Scanner ; 
import java.lang.Math ; 

public class Binary_decimal{
   
   public static void binaryToDecimal(int num){
    int pow = 0 ; 
    int decNum =0 ; 
    int num1 = num ; 
    while(num > 0){
        int lastDigit = num%10 ; 
        decNum = decNum + (lastDigit* (int)Math.pow(2,pow));
        pow++ ;
        num = num/10 ; 
    }
    System.out.println("The bianry "+num1+" in decimal is "+decNum);
   }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a binary Number"); 
        int numb = sc.nextInt(); 
        binaryToDecimal(numb); 
    }
}