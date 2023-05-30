//**********************************  X DAKİKA SONRA SAAT KAÇ  *********************************************
package xdakikasonrasaatkac;

import java.util.Scanner;


public class XDakikaSonraSaatKac {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("100 ile 500 arasında bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        
        while( sayi<100 || sayi>500){
            System.out.println("Geçersiz ilem ");
            System.out.print("100 ile 500 arasında bir sayi giriniz : ");
            sayi = scanner.nextInt();
            
        }
        
        int saat = 8+(sayi/60);
        int dakika =30+( sayi%60);
        
        if(dakika>60){
            saat += dakika/60;
            dakika = dakika%60;
        }
        System.out.println("Sınavın başlangıç saati 08.30 dur. bundan "+ sayi + " dk sonra saat " +saat+"."+dakika+" olacaktır.");
        
    }
    
}
