

package tipeData;

import java.util.Scanner;

public class day10 {
     public static void main(String[] args) {
        System.out.println("pilih operator anda");
        System.out.println("1. penjumlahan");
        System.out.println("2. perkalian");
        System.out.println("3. pengurangan");
        System.out.println("4. pembagian");
 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan anda : ");
        int pilihan = input.nextInt();
        
        System.out.println();
        System.out.print("masukkan bilangan 1 : ");
        int bilangan1 = input.nextInt();
        System.out.print("masukkan bilangan 2 : ");
        int bilangan2 = input.nextInt();
        
        if (pilihan == 1){
            int hasil = bilangan1 + bilangan2;
            System.out.println("Hasil penjumlahan bilangan : "+hasil);
        }else if (pilihan == 2){
            int hasil = bilangan1 * bilangan2;
            System.out.println("Hasil perkalian bilangan : "+hasil);
        }else if (pilihan == 3){
            int hasil = bilangan1 - bilangan2;
            System.out.println("Hasil perngurangan bilangan : "+hasil);
        }else if (pilihan == 4){
            int hasil = bilangan1 / bilangan2;
            System.out.println("Hasil pembagian bilangan : "+hasil);
        }
    }
}


