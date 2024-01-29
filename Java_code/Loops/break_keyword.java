import java.util.Scanner ; 


/* Stop the loop when we get Any Positive integer. to break keyword ka use ker skte hain, as iss task ko achieve kerne ke liye we'll have to use loop 
aur it is given ki agar koi ek even number bhi mil jaye to print kerke bahar aa jao , to ham loop chaleyenge till nth number aur usmain jaise hi first 
even +ve integer milega ham usse print karake loop se bahar aa jayenge. execution time kam hoga(code tez chalega) as ham baki ke even numbers ko print nhi kara rahe 
bas the fisrt even number hi print karana hai.
*/
public class break_keyword{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Any positive integer"); 
        int number = sc.nextInt() ; 
        int counter = 1 ; 
        do{
            if(counter%2==0){
                System.out.print(counter+" is even"); 
                break ;
            }else{
                counter++;
            }
        }while(counter<=number);
    }
}