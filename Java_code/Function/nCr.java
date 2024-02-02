import java.util.Scanner ; 

public class nCr{
     public static int fact(int num){
        int fact = 1 ; 
        for(int i=1 ; i <= num ; i++){
            fact = fact*i ; 
        }
        return fact ;
    }
    public static void binomial(int n,int r){
        int bi = (int)(fact(n)/(fact(n-r)*fact(r)));
        System.out.println("binomial cofficient is "+bi);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter total number and number of selections");
        int n = sc.nextInt(); 
        int r = sc.nextInt(); 
        binomial(n,r); 
    }
}