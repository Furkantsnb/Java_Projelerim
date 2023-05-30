
package userlogin;
import java.util.Scanner;
public class UserLogin {
    private static String username = "admin";
    private static String password = "password";

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcı girişi
        System.out.print("Kullanıcı adı: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Şifre: ");
        String inputPassword = scanner.nextLine();
        
        
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Giriş başarılı!");
            // İşçi özelliklerini girme
            Worker worker = new Worker() {};
            System.out.print("İşçi adı: ");
            String name = scanner.nextLine();
            worker.setName(name);
            // Diğer özellikleri de burada girilebilir
            // ...
            // İşçi bilgilerini gösterme
            UI.showWorkerInfo(worker);
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre!");
        }
        
        scanner.close();
    
    }
}

abstract class Worker {
    private String name;
    private String department;
    // Diğer özellikler de eklenebilir

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    // Diğer getter/setterlar
}

class UI {
    public static void showWorkerInfo(Worker worker) {
        // İşçi bilgilerini gösterme işlemi burada yapılabilir
        System.out.println("İşçi adı: " + worker.getName());
        System.out.println("Departman: " + worker.getDepartment());
        // Diğer özellikler de burada gösterilebilir
        // ...
    }
}

