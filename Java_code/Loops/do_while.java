import java.util.Scanner ; 


/*while loop main jaise pehle terminating condition check hoti hain fir loop body main flow jata hain . 
waise hi do-while main loop body pehle chalti hai then terminating condition check hoti hain. 
*/

public class do_while{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Any positive integer"); 
        int number = sc.nextInt() ; 
        int counter = 0 ;
        do{
            System.out.println("Counter "+counter+" is still less than provided number "+number) ;
            counter++ ; 
        }while(counter<number); 
        
    }
}