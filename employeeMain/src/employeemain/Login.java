
package employeemain;
import java.util.Scanner;


public class Login {
     Scanner scanner = new Scanner(System.in);
     public boolean login (Employee employee){
       
        String userName;
        String password;
        System.out.print("Kullanici adi : ");
        userName = scanner.nextLine();
        System.out.print("parola : ");
        password = scanner.nextLine();
        
        if(employee.getUserName().equals(userName) && employee.getPassword().equals(password)) {
            return true ;
                    }
        else
            return false ;
            
}
}
