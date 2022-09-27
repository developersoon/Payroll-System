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
public class EmployeeData {

    /**
     * @return the EmpID
     */
    private int EmpID;
    private String Overtime, Medical, Bonus, Other, EmpId, Salary, Rate, Total_Allowance, Firstname, Lastname;
public EmployeeData(int Id, String Overtime, String Medical, String Bonus, String Other, String EmpId, String salary, String Rate, String Total_allowance, String firstname, String lastname){
    this.EmpID = Id;
    this.Overtime = Overtime;
    this.Medical = Medical;
    this.Bonus = Bonus;
    this.Other = Other;
    this.EmpId = EmpId;
    this.Salary = salary;
    this.Rate = Rate;
    this.Total_Allowance = Total_allowance;
    this.Firstname = firstname;
    this.Lastname = lastname;
    
}
    public int getEmpID() {
        return EmpID;
    }

    /**
     * @param EmpID the EmpID to set
     */
    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    /**
     * @return the Overtime
     */
    public String getOvertime() {
        return Overtime;
    }

    /**
     * @param Overtime the Overtime to set
     */
    public void setOvertime(String Overtime) {
        this.Overtime = Overtime;
    }

    /**
     * @return the Medical
     */
    public String getMedical() {
        return Medical;
    }

    /**
     * @param Medical the Medical to set
     */
    public void setMedical(String Medical) {
        this.Medical = Medical;
    }

    /**
     * @return the Bonus
     */
    public String getBonus() {
        return Bonus;
    }

    /**
     * @param Bonus the Bonus to set
     */
    public void setBonus(String Bonus) {
        this.Bonus = Bonus;
    }

    /**
     * @return the Other
     */
    public String getOther() {
        return Other;
    }

    /**
     * @param Other the Other to set
     */
    public void setOther(String Other) {
        this.Other = Other;
    }

    /**
     * @return the EmpId
     */
    public String getEmpId() {
        return EmpId;
    }

    /**
     * @param EmpId the EmpId to set
     */
    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    /**
     * @return the Salary
     */
    public String getSalary() {
        return Salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    /**
     * @return the Rate
     */
    public String getRate() {
        return Rate;
    }

    /**
     * @param Rate the Rate to set
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * @return the Total_Allowance
     */
    public String getTotal_Allowance() {
        return Total_Allowance;
    }

    /**
     * @param Total_Allowance the Total_Allowance to set
     */
    public void setTotal_Allowance(String Total_Allowance) {
        this.Total_Allowance = Total_Allowance;
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

}
