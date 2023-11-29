import java.util.*;
public class CheckRandom{
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=1;
        while(num!=0){
        Random rand = new Random();
        int randn = rand.nextInt(100);
        int c=10;
        System.out.println("Guess the numbers from 0 to 100");
        System.out.println("You will be having total 10 chances and if you guess the correct based on that you are scored ");
        while(c!=0){
        System.out.println("Enter your number");
        int n= sc.nextInt();
        if(randn==n){
            System.out.println("Equal to generated number");
           break;
        }
        else if(randn < n){
            System.out.println("Greater than the generated number");
        }
        else{
           System.out.println("Lesser than the generated number"); 
        }
     c--;   
    }
    System.out.println("Your score = "+c);
    System.out.println("Random Integers: "+randn);
 System.out.println("Do you want to play again? YES=1 & NO=0 ");
 int next=sc.nextInt();
	if(next==1){
              System.out.println("START OVER");
             num=1;
	}
	else{
             System.out.println("GAME ENDED");
	    num=0; 
	} 
    }
   }
}