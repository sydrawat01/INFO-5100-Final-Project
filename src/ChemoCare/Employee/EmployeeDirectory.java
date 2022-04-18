package ChemoCare.Employee;

import java.util.ArrayList;

/**
 *
 * @author sid
 */
public class EmployeeDirectory {
  private ArrayList<Employee> empList;

  public EmployeeDirectory() {
    empList = new ArrayList<>();
  }

  public Employee createEmployee(String name) {
    Employee emp = new Employee();
    emp.setEmpName(name);
    empList.add(emp);
    return emp;
  }
  
}
