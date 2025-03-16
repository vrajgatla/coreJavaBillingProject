

public class Employees {

    private int EmployeeId;
    private String EmployeeName;
    private int MobileNo;
    private String EmailId;
    private String Address;

    
  

    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }
    public int getMobileNo() {
        return MobileNo;
    }
    public void setMobileNo(int mobileNo) {
        MobileNo = mobileNo;
    }
    public String getEmailId() {
        return EmailId;
    }
    public void setEmailId(String emailId) {
        EmailId = emailId;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }


    public Employees(int employeeId, String employeeName, int mobileNo, String emailId, String address) {
        this.EmployeeId = employeeId;
        this.EmployeeName = employeeName;
        this.MobileNo = mobileNo;
        this.EmailId = emailId;
        this.Address = address;
    }
      
    @Override
    public String toString() {
        return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", MobileNo=" + MobileNo
                + ", EmailId=" + EmailId + ", Address=" + Address + "]";
    }

    
}
