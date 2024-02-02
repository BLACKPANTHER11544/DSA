import java.util.Scanner ; 

public class Swap_two_number{
    
    public static void swap(int a,int b){
        int temp = a ; 
        a = b ;
        b = temp ; 
        System.out.println("Swapped Numbers "+a+" and "+b);  
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter any Two numbers"); 
        int numb1 = sc.nextInt(); 
        int numb2 = sc.nextInt(); 
        swap(numb1 , numb2); 
    }
}