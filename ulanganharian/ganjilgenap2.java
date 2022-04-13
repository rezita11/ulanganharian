package ulanganharian;

import java.util.Scanner;

public class ganjilgenap2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah bilangan :");
        int N = scan.nextInt();
        int bil;
        
        for (int i = 0; i < N; i++) {
            System.out.println("Masukkan " +N+ " angka :");
            bil = scan.nextInt();
            if(bil%2==0){
                System.out.println("Bilangan " +bil+ " adalah bilangan Genap");
            }else{
                System.out.println("Bilangan " +bil+ " adalah bilangan Ganjil");
            } 
        }
    } 
}
