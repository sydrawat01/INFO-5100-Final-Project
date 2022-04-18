package ChemoCare.Account;

import ChemoCare.Employee.Employee;
import ChemoCare.JobQueue.JobQueue;
import ChemoCare.Patient.Patient;
import ChemoCare.Role.Role;

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
  private Role role;
  
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

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }
  
  @Override
  public String toString() {
    return username;
  }
  
}
