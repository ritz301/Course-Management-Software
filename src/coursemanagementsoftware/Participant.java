package coursemanagementsoftware;

import java.io.Serializable;

public class Participant implements Serializable {
    private String Name;
    private String Address;
    private String MobileNo;
    private String Email;
    private String OrgName;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMobileNo() {
        return MobileNo;
    }
    
    public void setMobileNo(String MobileNo){
        this.MobileNo = MobileNo;
    }
    
    public String getEmail() {
        return Email;
    }

    
    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }
    
}
