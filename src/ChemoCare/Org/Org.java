/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Org;
import ChemoCare.Employee.EmployeeDirectory;
import ChemoCare.JobQueue.JobQueue;
import ChemoCare.Account.AccountDirectory;
/**
 *
 * @author jeelpatel
 */
public abstract class Org {
     private String orgName;
    private JobQueue jobQueue;
    private EmployeeDirectory employeeDirectory;
    private AccountDirectory userAccountDirectory;
    private int orgID;
    private static int counter = 0;

  public Org(String orgName) {
        this.orgName = orgName;
        jobQueue = new JobQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new AccountDirectory();
        orgID = counter;
        ++counter;
    
  }
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public JobQueue getJObQueue() {
        return jobQueue;
    }

    public void setJObQueue(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public AccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(AccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Org.counter = counter;
    }
    
      @Override
    public String toString() {
        return orgName;
    }
}
