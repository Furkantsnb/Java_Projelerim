
package employeemain;


 abstract class Employee {
    private String userName;
    private String password;
    private String name;
    private String department;
    private String experience;
    private int wage;
    // Diğer özellikler de eklenebilir
    
    public Employee(String userName, String password) {
        this.userName = userName;
        this.password = password;
        
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setParola(String password) {
        this.password = password;
    }
    
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
    
    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    
    public int getWage(){
        return wage;
    }
    
    public void setWage(int wage){
        this.wage = wage;
    }
    
    // Diğer getter/setterlar
    
}
