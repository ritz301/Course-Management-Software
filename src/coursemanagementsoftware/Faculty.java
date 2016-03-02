package coursemanagementsoftware;

import java.io.Serializable;

public class Faculty implements Serializable{
    private String Department;
    private String Name;
    private String Address;
    private String MobileNo;
    private String Email;
    
    public void setName(String Name){
        this.Name = Name;
    }
    public void setDepartment(String Department){
        this.Department = Department;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    
    public void setMobileNo(String MobileNo){
        this.MobileNo = MobileNo;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String getDepartment() {
        return Department;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public String getEmail() {
        return Email;
    }
    
    Faculty(){
        
    }
}
