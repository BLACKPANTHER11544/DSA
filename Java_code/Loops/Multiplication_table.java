import java.util.Scanner ; 

public class Multiplication_table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter any +ve integer"); 
        int numb = sc.nextInt(); 
        for(int i=1 ; i<=10; i++){
            System.out.println(numb+"X"+i+" = "+i*numb); 
        }
    }
}