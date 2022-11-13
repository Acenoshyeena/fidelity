
package loops;

/**
* Name: Sheena P. Aceno
* Section: IT Dept
* Year: 4th Year
*/
import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int enterGrade,i,total=0,ave,loop=0,grade;
        
        do{
            System.out.println("Would you like to enter grade?");
            System.out.print(" [1-yes:2-no]");
            enterGrade = input.nextInt();
            
            if(enterGrade == 1){
                i = 1;
                loop++;
                System.out.println("Enter grade: ");
                grade = input.nextInt();
                total = total + grade;
                System.out.println("Total grade is "+total);
            }
            else{
                i = 0;
                 ave = total / loop;
                System.out.println("Average is "+ave);
               
                
            }
                        
        }while(i == 1);
            
    }   
}
