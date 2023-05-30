
package employeemain;


public class UI {
    
    public static void showWorkerInfo(Employee employee) {
        // İşçi bilgilerini gösterme işlemi burada yapılabilir
        System.out.println("******************* isci bilgileri *******************");
        System.out.println("İsci adi: " + employee.getName());
        System.out.println("Departman: " + employee.getDepartment());
        System.out.println("İsci tecrubesi: " + employee.getExperience());
        System.out.println("İsci maasi: " + employee.getWage());
        // Diğer özellikler de burada gösterilebilir
        // ...
    }
    
}
