package ulanganharian;

import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bil;
        
        System.out.println("Menentukan bilangan termasuk ganjil atau genap");
        System.out.println("Masukkan Bilangan : ");
        bil = scan.nextInt();
        
        if(bil%2==0){
            System.out.println("Bilangan "+bil+" merupakan bilangan genap");
        }else{
            System.out.println("Bilangan "+bil+" merupakan bilangan ganjil");
        }
    }
    
}
