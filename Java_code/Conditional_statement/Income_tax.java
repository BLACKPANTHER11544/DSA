import java.util.Scanner ; 

public class Income_tax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income");
        float income = sc.nextFloat();
        int tax = 0 ;
        if(income < 500000){
          tax = 0 ;
        } else if(income > 500000 && income < 1000000){
            tax =(int) (income * 0.2 ); 
        }else{
            tax = (int) (income*0.3);
        }
        System.out.println("Your Tax " + tax);
    }
}