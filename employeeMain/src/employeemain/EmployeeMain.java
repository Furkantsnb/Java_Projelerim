
package employeemain;
import java.util.Scanner;
public class EmployeeMain {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee =new Employee("furkan tasan","12345") {};
        
        Login input = new Login();
        
         System.out.println("***************************************************************");
         System.out.println("                     Kullanici girisi");
         System.out.println("****************************************************************");
        
        
    
        while(true){
        if(input.login(employee)){
            System.out.println("******************* Giris basarili! *******************");
            // İşçi özelliklerini girme
          
            
            
            System.out.print("İsci adi: ");
            String userName = scanner.nextLine();
            employee.setName(userName);
            
            System.out.print("Departman adi: ");
            String department = scanner.nextLine();
            employee.setDepartment(department);
            
            System.out.print("İsci tecrübesi: ");
            String experience = scanner.nextLine();
            employee.setExperience(experience);
            
             System.out.print("İsci Maası: ");
            int wage = scanner.nextInt();
            employee.setWage(wage);
            
            
            // Diğer özellikleri de burada girilebilir
            // ...
            // İşçi bilgilerini gösterme
            UI.showWorkerInfo(employee);
            return;
        }
        else{
            System.out.println("giris basarisiz tekrar deneyin...");

        }
       
         
    }
        
    }
    
}
