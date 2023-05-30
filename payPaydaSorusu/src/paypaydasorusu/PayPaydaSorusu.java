//**********************************  PAY-PAYDA   *********************************************
package paypaydasorusu;

import java.util.Scanner;


public class PayPaydaSorusu {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("pay değerini girin : ");
        int pay = scanner.nextInt();
        
        System.out.print("pay değerini girin : ");
        int payda = scanner.nextInt();
        
        if(pay<payda){
         System.out.print("Basit kesir girdiniz... ");
        }
        
        else if(pay==payda){
            System.out.print("Basit kesir girdiniz... ");
        }
        else{
           int mod = pay%payda;
           int tamSayi = pay/payda;
           System.out.print("Bileşik bir kesir girdiniz kesir değeri : " + tamSayi + " tam " + mod +"/" +payda + "  ");
        }
        


    }
    
}
