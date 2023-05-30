//**********************************  BKİ HESAPLAMA  *********************************************
package boykiloındeksi;

import java.util.Scanner;


public class BoyKiloIndeksi {

   
    public static void main(String[] args) {
        int kilo,boy;
        double bki;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu girin : ");
        kilo = scanner.nextInt();
        System.out.print("Boyunuzu girin : ");
        boy = scanner.nextInt();
        
        bki = kilo/(boy*boy);
        
     if(bki <18)
    {
       System.out.print("ZAYIF ");
    }   
    else if(bki >= 18 && bki <25)
    {
        System.out.print("NORMAL ");
    }
    else if(bki >= 25 && bki <30)
    {
        System.out.print("KİLOLU ");        
    }
    else if(bki >= 30 && bki <35)
    {
        System.out.print("OBEZ" );
    }
    else
    {
        System.out.print("CİDDİ OBEZ" );
    }   


        
    }
    
}
