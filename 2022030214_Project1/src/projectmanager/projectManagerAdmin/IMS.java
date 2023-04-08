package projectmanager.projectManagerAdmin;

import utils.Globals.programmingLanguages;
import projectmanager.projectManagerAdmin.Developer;
import projectmanager.projectManagerAdmin.Manager;

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

    // functions
    public void insertEmployee(String id, String name, String empOfficeNo, String empOfficePhone) {
        if (this.CheckEmployeeIDExists(id)) {
            System.out.println("User already exists");
        } else {
            for (int i = 0; i < myEmployees.length; i++) {

                if (myEmployees[i] == null) {

                    if (empOfficeNo == null && empOfficePhone == null) {
                        myEmployees[i] = new Employee(id, name);
                        break;

                    } else {
                        myEmployees[i] = new Employee(id, name, empOfficeNo, empOfficePhone);
                        break;
                    }

                }

            }
        }
    }

    public void insertProject(String name, Double Budget) {
        if (this.CheckProjectNameExists(name)) {
            System.out.println("Project already exists");
        } else {
            for (int i = 0; i < myProjects.length; i++) {

                if (myProjects[i] == null) {

                    myProjects[i] = new Project(name, Budget);
                    break;

                }

            }
        }
    }

    public void updateProject(int pID, String title, Double budget) {
        // Check integrity
        if (title == null || budget == null) {
            return;
        }
        // Find project
        int idx = this.findProjectById(pID);
        if (idx != -1) {
            // Update project
            myProjects[idx].setProjectBudget(budget);
            myProjects[idx].setProjectName(title);
        }
        System.out.println("Project does not exist");
    }

    public String displayEmployees() {
        String employeesList = new String();
        System.out.println(this.myEmployees);
        for (int i = 0; i < myEmployees.length; i++) {
            if (myEmployees[i] == null) {
                continue;
            } else {

                employeesList = employeesList + myEmployees[i].toString();
            }

        }

        return employeesList;
    }

    public String displayProjects() {
        String projectList = new String();
        System.out.println(this.myProjects);
        for (int i = 0; i < myProjects.length; i++) {
            if (myProjects[i] == null) {
                continue;
            } else {

                projectList = projectList + myProjects[i].toString();
            }

        }

        return projectList;
    }

    public boolean CheckEmployeeIDExists(String empID) {
        for (Employee employee : this.myEmployees) {
            if (employee == null) {
                break;
            }
            if (employee.getEmpID() == empID) {
                return true;

            }
        }
        return false;

    }

    public boolean CheckProjectNameExists(String name) {
        for (Project project : this.myProjects) {
            if (project == null) {
                break;
            }
            if (project.getProjectName() == name) {
                return true;

            }
        }
        return false;

    }

    public void assignDevPosition(String id, programmingLanguages[] languages) {
        int check = this.findEmployeeById(id);
        if (check == -1) {
            System.out.println("User does not exist");
        } else {

            this.myEmployees[check] = new Developer(id, this.myEmployees[check].getEmpName(),
                    this.myEmployees[check].getEmpOfficeNo(), this.myEmployees[check].getEmpOfficePhone(), languages);

        }
    }

    public void assignManagerPosition(String id) {
        int check = this.findEmployeeById(id);
        if (check == -1) {
            System.out.println("User does not exist");
        } else {

            this.myEmployees[check] = new Manager(id, this.myEmployees[check].getEmpName(),
                    this.myEmployees[check].getEmpOfficeNo(), this.myEmployees[check].getEmpOfficePhone());

        }
    }

    public void updateEmployee(String id, String name, String empOfficeNo, String empOfficePhone) {
        int check = this.findEmployeeById(id);
        if (check == -1) {
            System.out.println("User does not exist");
        } else {
            if (name == null) {
                System.out.println("Cannot update, name is null");

            } else {
                this.myEmployees[check].setEmpName(name);
                this.myEmployees[check].setEmpOfficeNo(empOfficeNo);
                this.myEmployees[check].setEmpOfficePhone(empOfficePhone);
            }

        }

    }

    private int findEmployeeById(String id) {
        for (int i = 0; i < this.myEmployees.length; i++) {
            if (this.myEmployees[i].getEmpID() == id) {
                return i;
            }

        }
        return -1;
    }

    public int findEmployeeByName(String name) {
        for (int i = 0; i < this.myEmployees.length; i++) {
            if (this.myEmployees[i].getEmpName() == name) {
                return i;
            }
        }
        return -1;
    }

    public int findProjectByName(String projName) {
        for (int i = 0; i < this.myProjects.length; i++) {
            if (this.myProjects[i].getProjectName() == projName) {
                return i;
            }
        }
        return -1;
    }

    public int findProjectById(int projectID) {
        for (int i = 0; i < this.myProjects.length; i++) {
            if (this.myProjects[i].getProjectID() == projectID) {
                return i;
            }
        }
        return -1;
    }

    void deleteEmployee(String empID) {
        for (int i = 0; i < myEmployees.length; i++) {
            if (this.myEmployees[i].getEmpID() == empID) {
                this.myEmployees[i] = null;
            }
        }

    }

    void deleteProject(int projID) {
        for (int i = 0; i < myProjects.length; i++) {
            if (this.myProjects[i].getProjectID() == projID) {
                this.myProjects[i] = null;
            }
        }
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
