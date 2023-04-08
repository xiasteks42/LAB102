package projectmanager.projectManagerAdmin;

public class IMS {
    private Project[] myProjects;
    private int numOfProjects;
    private Employee[] myEmployees;
    private int numOfEmployees;

    // constructors
    public IMS(int numOfProjects, int numOfEmployees) {
        this.numOfProjects = numOfProjects;
        this.numOfEmployees = numOfEmployees;
        this.myProjects = new Project[numOfProjects];
        this.myEmployees = new Employee[numOfEmployees];
    }

    public void insertEmployee(String id, String name, String empOfficeNo, String empOfficePhone) {
        if (this.CheckEmployeeIDExists(id)) {
            System.out.println("User already exists");
        } else {
            for (int i = 0; i < numOfEmployees - 1; i++) {

                if (myEmployees[i] == null) {

                    if (empOfficeNo == null && empOfficePhone == null) {
                        myEmployees[i] = new Employee(id, name);

                    } else {
                        myEmployees[i] = new Employee(id, name, empOfficeNo, empOfficePhone);
                    }

                }

            }
        }
    }

    public String displayEmployees() {
        String employeesList = new String();
        for (Employee employee : myEmployees) {
            employeesList = employeesList + employee.toString();

        }
        return employeesList;
    }

    public boolean CheckEmployeeIDExists(String empID) {
        for (Employee employee : this.myEmployees) {
            if (employee.getEmpID() == empID) {
                return true;

            }
        }
        return false;

    }

    // setters&getters
    private Project[] getMyProjects() {
        return myProjects;
    }

    private void setMyProjects(Project[] myProjects) {
        this.myProjects = myProjects;
    }

    private int getNumOfProjects() {
        return numOfProjects;
    }

    public void setNumOfProjects(int numOfProjects) {
        this.numOfProjects = numOfProjects;
    }

    private Employee[] getMyEmployees() {
        return myEmployees;
    }

    private void setMyEmployees(Employee[] myEmployees) {
        this.myEmployees = myEmployees;
    }

    private int getNumOfEmployees() {
        return numOfEmployees;
    }

    private void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }
}
