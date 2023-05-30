//**********************************  KALORİ HESAPLAMA  *********************************************

package kalorihesaplama;

import java.util.Scanner;


public class KaloriHesaplama {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kalori;
        System.out.print("Cinsiyeti girin (Erkek-Kadın):  ");
        String cinsiyet = scanner.nextLine();
        
        System.out.print("Adım sayisini girin :  ");
        int adim = scanner.nextInt();
        
        if(cinsiyet.equals("Erkek")){
            
            kalori = (adim*45)/500;
           
        }
        else{
            kalori = (adim*30)/500;
        }
        System.out.print("Yakılan kalori : "+kalori);
        


    }
    
}
