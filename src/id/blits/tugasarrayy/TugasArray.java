
package id.blits.tugasarrayy;

import java.util.Scanner;


public class TugasArray {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        String[] nama = new String[12];
        int[] nilai = new int[12];
              
        System.out.println("Masukkan Panjang Array : ");
        
        for(int i=0;i<1;i++){
            
            System.out.print("Masukkan nama ke-"+(i+1)+" : ");
            nama[i] = input.nextLine();
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilai[i] = input.nextInt();
            input.nextLine();
        }
        System.out.println("\n");
        System.out.println("Hasil : ");
        System.out.println("~~~~~~~\n");
        
        for(int i=0;i<1;i++){
            
            System.out.println("Nama ke-"+(i+1)+" : "+nama[i]);
            System.out.println("Nilai ke-"+(i+1)+" : "+nilai[i]);
            System.out.println("________________________");
            
        }
    }
    
}
