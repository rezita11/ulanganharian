package ulanganharian;

import java.util.Scanner;

public class jumlah {
    
   public static void main (String args[]){
       Scanner scan = new Scanner(System.in);
       System.out.println("Masukkan jumlah bilangan : ");
       int bil = scan.nextInt();
       int jumlah = 0;
       
       for(int i=1;i<=bil;i++)
       jumlah += i;
       System.out.println("Jumlah total nilai tersebut adalah : "+jumlah);
  }
}


   
