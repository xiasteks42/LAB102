package projectmanager.projectManagerAdmin;

import utils.Globals.*;
import java.util.Date;

public class Project {
    private int numOfProjects;
    protected int projectID;
    private String projectName;
    private double projectBudget;
    private int projectDuration;
    private status projectStatus;
    private Task[] projectTasks = new Task[5];
    private int numOfTasks;

    // constructors
    protected Project(String projectName, double projectBudget) {
        this.projectName = projectName;
        this.projectBudget = projectBudget;
    }

    @Override
    public String toString() {
        return this.numOfProjects + "\t" + this.projectID + "\t" + this.projectName + "\t" + this.projectBudget + "\t"
                + this.projectDuration + "\t" + this.projectStatus + "\t" + this.numOfTasks + "\t" + this.projectTasks;
    }

    int findTaskByID(String tID) {
        int indx = 0;
        for (int i = 0; i < numOfTasks; i++) {
            if (projectTasks[i].taskID.equals(tID)) {
                indx = i;
            }

        }
        return indx;
    }

    // instertTask
void insertTask(String taskTitle, Date fromDate, Date toDate, status taskStatus){
       this.projectTasks.
        }

    // deleteTask
    void deleteTask(int taskIdx) {
        for (int i = 0; i < numOfTasks; i++) {

            if (i == taskIdx) {
                projectTasks[i] = null;
            }

        }
    }

    // updateTask
    void updateTask(String tID, String title, Date newFrom, Date newTo, status stat) {
        for (int i = 0; i < numOfTasks; i++) {
            if (projectTasks[i].equals(tID)) {
                if (title != null) {
                    projectTasks[i].taskTitle = title;

                }
                if (newFrom != null) {
                    projectTasks[i].taskFromDate = newFrom;
                }
                if (newTo != null) {
                    projectTasks[i].taskEndDate = newTo;
                }
                if (stat != null) {
                    projectTasks[i].taskStatus = stat;
                }
            }
        }
    }

    // updateProjectStatus**************************
    void updateProjectStatus() {
    }

    // computeProjectDuration
    void computeProjectDuration() {
    }

    // displayTasks
    String displayTasks() {
        String Project_Tasks = null;
        for (int i = 0; i < numOfTasks; i++) {
            Project_Tasks += this.projectTasks[i].toString();
        }
        return Project_Tasks;
    }

    // setters&getters
    private int getNumOfProjects() {
        return numOfProjects;
    }

    private void setNumOfProjects(int numOfProjects) {
        this.numOfProjects = numOfProjects;
    }

    private int getProjectID() {
        return projectID;
    }

    private void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    private String getProjectName() {
        return projectName;
    }

    private void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    private double getProjectBudget() {
        return projectBudget;
    }

    private void setProjectBudget(double projectBudget) {
        this.projectBudget = projectBudget;
    }

    private int getProjectDuration() {
        return projectDuration;
    }

    private void setProjectDuration(int projectDuration) {
        this.projectDuration = projectDuration;
    }

    private status getProjectStatus() {
        return projectStatus;
    }

    private void setProjectStatus(status projectStatus) {
        this.projectStatus = projectStatus;
    }

    private Task[] getProjectTasks() {
        return projectTasks;
    }

    private void setProjectTasks(Task[] projectTasks) {
        this.projectTasks = projectTasks;
    }

    private int getNumOfTasks() {
        return numOfTasks;
    }

    private void setNumOfTasks(int numOfTasks) {
        this.numOfTasks = numOfTasks;
    }

}
