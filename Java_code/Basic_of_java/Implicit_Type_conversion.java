import java.util.Scanner ;




public class Implicit_Type_conversion{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter floating value"); 
     Float numb = sc.nextFloat() ; 
     System.out.println("Trying to store flaoting value into integer type variable"); 
     int NUMBER1 = numb ; 
     // agar kabhi 9th line chall gayi to ye print hoga. Jo kabhi nhi hoga hahahahahahhaahaha
     System.out.println("error: incompatible types: possible lossy conversion from float to int "+NUMBER1); 
    }
}





// Ye niche wala is complte fine aur ye chalega bhi.

/*
public class Implicit_Type_conversion{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter floating value"); 
     int numb = sc.nextInt() ; 
     System.out.println("Trying to store integer value into flaoting type variable"); 
     float NUMBER1 = numb ; 
     // iss bar ye line chal gayegi kyunki chhote se bade main ho rha hai conversion
     System.out.println("Conversion SuccessFull"+NUMBER1); 
    }
}
*/