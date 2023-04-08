package projectmanager.projectManagerAdmin;

import java.util.Date;

public class Employee {
    private String empID;
    private String empName;
    private String empOfficeNo;
    private String empOfficePhone;
    private Date HireDate;
    private Project[] workingOn;
    private int numOfProjects;

    // constructors
    protected Employee(String id, String name, String empOfficeNo, String empOfficePhone) {

        this.empID = id;
        this.empName = name;
        this.empOfficeNo = empOfficeNo;
        this.empOfficePhone = empOfficePhone;
        this.numOfProjects = 0;
    }

    protected Employee(String empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return this.empID + "\t" + this.empName + "\t" + this.empOfficeNo + "\t" + this.empOfficePhone + "\t"
                + this.HireDate + "\t" + this.workingOn + "\t" + this.numOfProjects + "\n";
    }

    // assignProject

    void assignProject(Project proj) {
        workingOn[numOfProjects] = proj;
        numOfProjects++;
    }

    // ceaseFromProject
    void ceaseFromProject(int projIdx) {

        for (int i = 0; i < numOfProjects; i++) {
            if (projIdx == workingOn[i].projectID) {
                workingOn[i] = null;
                numOfProjects--;
            }

        }

    }

    // setEmpOfficeNo
    void setEmpOfficeNo(String empOfficeNo, String pattern) {
        if (pattern.matches(empOfficeNo) == true) {
            this.empOfficeNo = empOfficeNo;
        } else
            this.empOfficeNo = null;
    }

    // setEmpOfficePhone
    void setEmpOfficePhone(String empOfficePhone, String pattern) {
        if (pattern.matches(empOfficePhone) == true) {
            this.empOfficePhone = empOfficePhone;
        } else
            this.empOfficePhone = null;
    }

    // setters&getters

    public String getEmpID() {
        return empID;
    }

    private void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpOfficeNo() {
        return empOfficeNo;
    }

    public void setEmpOfficeNo(String empOfficeNo) {
        this.empOfficeNo = empOfficeNo;
    }

    public String getEmpOfficePhone() {
        return empOfficePhone;
    }

    public void setEmpOfficePhone(String empOfficePhone) {
        this.empOfficePhone = empOfficePhone;
    }

    private Date getHireDate() {
        return HireDate;
    }

    private void setHireDate(Date hireDate) {
        HireDate = hireDate;
    }

    private Project[] getWorkingOn() {
        return workingOn;
    }

    private void setWorkingOn(Project[] workingOn) {
        this.workingOn = workingOn;
    }

    private int getNumOfProjects() {
        return numOfProjects;
    }

    private void setNumOfProjects(int numOfProjects) {
        this.numOfProjects = numOfProjects;
    }

}
