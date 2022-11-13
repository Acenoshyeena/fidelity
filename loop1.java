
package loops;

/**
* Name: Sheena P. Aceno
* Section: IT Dept
* Year: 4th Year
*/
import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ave, num,loops =0,total = 0;
        
        
       do{loops++;

           System.out.println("Enter number: ");
           num=sc.nextInt();
           total=total+num;
           
       ave=total/loops;
       }
       while(num<100);
        System.out.println("Loops: "+loops);
        
        System.out.println("Average is "+ave);
    }
        
}
