//**********************************  ATM PROJESİ  *********************************************
package atmprojesi;

import java.util.Scanner;

public class AtmProjesi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Güncel bakiyenizi girin : ");
        int bakiye = scanner.nextInt();
        
        System.out.println("1.işlem bakiyeyi görüntüle");
        System.out.println("2.işlem hesaptan para çek");
        System.out.println("3.işlem hesaptan para yükle");
        System.out.println("4.işlem işlemleri sonlandırmak için 0 basın");
        System.out.println("atm aktif etmek için lutfen 0 haricinde bir sayı giriniz");
        
        
        int islem = scanner.nextInt();
            while(islem!=0){
                System.out.println("Yapmak istediğiniz işlemi seçin : ");
                 islem = scanner.nextInt();
            switch(islem){
            
                case 1:
                    System.out.println("Bakiyeniz "+bakiye+"TL dir.");
                    
                     
                    break;
                    
                case 2:
                    System.out.print("Ne kadar para çekmek istiyorsunuz: ");
                    int miktar = scanner.nextInt();
                    if(bakiye > miktar){
                    bakiye -=miktar;
                    System.out.println("Güncel bakiyeniz: " + bakiye + " TL dir.");
                    }
                    else{
                        System.out.println("Yetersiz bakiye hesabınızda " + bakiye +"Tl bulunmaktadır...");
                    }
                    break;
                case 3:
                    System.out.println("Ne kadar para yatırmak istiyorsunuz: ");
                     miktar = scanner.nextInt();
                     bakiye+=miktar;
                    System.out.println("Güncel bakiyeniz: " + bakiye + " TL dir.");
                    break;
                default :
                    System.out.println("Yanlış işlem yaptınız");
                    break;
                
        }
            }
            System.out.println("işleminiz sonlandı tekrar bekleriz...");
        
    }
    
}
