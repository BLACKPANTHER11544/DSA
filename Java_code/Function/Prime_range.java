import java.util.Scanner ; 


public class Prime_range{

   public static boolean prime(int numb1){
    if(numb1 ==2){
        return true ; 
    }
    for(int i=2;i<numb1;i++){
        if(numb1%i==0){
            return false ; 
        }
    }
    return true ;
   }
      
    public static void Range_Prime(int numb){
        for(int i=2 ; i<=numb; i++){
            if(prime(i)){
                System.out.print(i+", ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Range"); 
        int range = sc.nextInt(); 
        Range_Prime(range) ;
    }
}