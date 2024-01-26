import java.util.Scanner ; 

public class Average_of_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter any three integer numbers"); 
        int numb1 = sc.nextInt() ;
        int numb2 = sc.nextInt() ;
        int numb3 = sc.nextInt() ;
        System.out.println("The average of provided Numbres is "+ (numb1+numb2+numb3)/3) ; 
    }
}