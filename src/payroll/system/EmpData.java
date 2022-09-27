/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.system;

/**
 *
 * @author pc
 */
public class EmpData {
 private int Emp_Id;
    private String Firstname, Lastname, MiddleName, Dob, Gender, Email, Phone, Address, Postcode, Designation, Status, Date_hired,Job_title,Basic_Salary;
    public EmpData(int id, String firstname, String lastname, String MiddleName, String Dob, String Gender, String Email, String Phone, String Address, String Postcode, String Designation, String Status, String Date_hired, String Job_title, String basic_salary){
        this.Emp_Id = id;
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.MiddleName = MiddleName;
        this.Dob = Dob;
        this.Gender = Gender;
        this.Email = Email;
        this.Phone = Phone;
        this.Address = Address;
        this.Postcode = Postcode;
        this.Designation = Designation;
        this.Status = Status;
        this.Date_hired = Date_hired;
        this.Job_title = Job_title;
        this.Basic_Salary = basic_salary;
    }
    
    
    
    
    /**
     * @return the Emp_Id
     */
    public int getEmp_Id() {
        return Emp_Id;
    }

    /**
     * @param Emp_Id the Emp_Id to set
     */
    public void setEmp_Id(int Emp_Id) {
        this.Emp_Id = Emp_Id;
    }

    /**
     * @return the Firstname
     */
    public String getFirstname() {
        return Firstname;
    }

    /**
     * @param Firstname the Firstname to set
     */
    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    /**
     * @return the Lastname
     */
    public String getLastname() {
        return Lastname;
    }

    /**
     * @param Lastname the Lastname to set
     */
    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    /**
     * @return the MiddleName
     */
    public String getMiddleName() {
        return MiddleName;
    }

    /**
     * @param MiddleName the MiddleName to set
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * @return the Dob
     */
    public String getDob() {
        return Dob;
    }

    /**
     * @param Dob the Dob to set
     */
    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Postcode
     */
    public String getPostcode() {
        return Postcode;
    }

    /**
     * @param Postcode the Postcode to set
     */
    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    /**
     * @return the Designation
     */
    public String getDesignation() {
        return Designation;
    }

    /**
     * @param Designation the Designation to set
     */
    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the Date_hired
     */
    public String getDate_hired() {
        return Date_hired;
    }

    /**
     * @param Date_hired the Date_hired to set
     */
    public void setDate_hired(String Date_hired) {
        this.Date_hired = Date_hired;
    }

    /**
     * @return the Job_title
     */
    public String getJob_title() {
        return Job_title;
    }

    /**
     * @param Job_title the Job_title to set
     */
    public void setJob_title(String Job_title) {
        this.Job_title = Job_title;
    }

    /**
     * @return the Basic_Salary
     */
    public String getBasic_Salary() {
        return Basic_Salary;
    }

    /**
     * @param Basic_Salary the Basic_Salary to set
     */
    public void setBasic_Salary(String Basic_Salary) {
        this.Basic_Salary = Basic_Salary;
    }
      
}
