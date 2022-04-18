package ChemoCare.Account;

import ChemoCare.Employee.Employee;
import ChemoCare.JobQueue.JobQueue;
import ChemoCare.Patient.Patient;

/**
 *
 * @author sid
 */
public class Account {
  private String username;
  private String password;
  private Employee employee;
  private Patient customer;
  private JobQueue jobQueue;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Patient getCustomer() {
    return customer;
  }

  public void setCustomer(Patient customer) {
    this.customer = customer;
  }

  public JobQueue getJobQueue() {
    return jobQueue;
  }
  
  @Override
  public String toString() {
    return username;
  }
  
}
