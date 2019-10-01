package tugasasis2;

import java.util.Scanner;

public class PelajarMain {
    public static void main (String[] args) {
        PelajarClass p1 = new PelajarClass();
        
        Scanner input = new Scanner(System.in);
            System.out.println ("DATA PELAJAR");
            System.out.println ("");
    
            System.out.print ("Masukkan Nama \t\t : ");
            p1.setNama(input.nextLine()); 
    
            System.out.print ("Masukkan NIP \t\t : ");
            p1.setNip(input.nextInt());
    
            System.out.print ("Masukkan Nilai Ujian 1 \t : ");
            p1.setNilaiUjian1(input.nextDouble());
    
            System.out.print ("Masukkan Nilai Ujian 2 \t : ");
            p1.setNilaiUjian2(input.nextDouble());
    
            System.out.print ("Masukkan Nilai Tugas \t : ");
            p1.setNilaiTugas(input.nextDouble());
    
            System.out.println ("");
            
            p1.Status();
    }        
}
