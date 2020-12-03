import java.util.Scanner;

public class Prob3  {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a number between 0-4");
  // gets number from user
  int num = scan.nextInt(); 
  // translates number to a letter 
  if (num == 0) {
  System.out.println("F");
  }

  else if (num == 1){
  System.out.println("D");
  }

  else if (num == 2) {
  System.out.println("C");
  }

  else if (num == 3) {
  System.out.println("B");
  }

  else {
  System.out.println("A");
  }

  
    
  }
}
