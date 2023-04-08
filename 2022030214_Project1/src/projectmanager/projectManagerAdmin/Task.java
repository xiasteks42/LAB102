package projectmanager.projectManagerAdmin;

import java.util.Date;
import utils.Globals.*;

public class Task {
   protected String taskID, taskTitle;
   protected status taskStatus;
   protected Date taskFromDate;
   protected Date taskEndDate;    
   private int taskDuration;
   
public Task(String taskID, String taskTitle, status taskStatus, Date taskFromDate, Date taskEndDate) {
    this.taskID = taskID;
    this.taskTitle = taskTitle;
    this.taskStatus = taskStatus;
    this.taskFromDate = taskFromDate;
    this.taskEndDate = taskEndDate;
}
@Override
public String toString(){
return this.taskID+"\t"+ this.taskTitle+"\t"+this.taskStatus+"\t"+this.taskFromDate+"\t"+this.taskEndDate+"\t"+this.taskDuration;
}

//setters&getters
private String getTaskID() {
    return taskID;
}
private void setTaskID(String taskID) {
    this.taskID = taskID;
}
private String getTaskTitle() {
    return taskTitle;
}
private void setTaskTitle(String taskTitle) {
    this.taskTitle = taskTitle;
}
private status getTaskStatus() {
    return taskStatus;
}
private void setTaskStatus(status taskStatus) {
    this.taskStatus = taskStatus;
}
private Date getTaskFromDate() {
    return taskFromDate;
}
private void setTaskFromDate(Date taskFromDate) {
    this.taskFromDate = taskFromDate;
}
private Date getTaskEndDate() {
    return taskEndDate;
}
private void setTaskEndDate(Date taskEndDate) {
    this.taskEndDate = taskEndDate;
}
private int getTaskDuration() {
    return taskDuration;
}
private void setTaskDuration(int taskDuration) {
    this.taskDuration = taskDuration;
}
}
