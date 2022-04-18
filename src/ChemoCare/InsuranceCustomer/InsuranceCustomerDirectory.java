package ChemoCare.InsuranceCustomer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sid
 */
public class InsuranceCustomerDirectory {
  private List<InsuranceCustomer> insuranceCustomerList;

  public InsuranceCustomerDirectory() {
    insuranceCustomerList = new ArrayList<>();
  }

  public List<InsuranceCustomer> getInsuranceCustomerList() {
    return insuranceCustomerList;
  }

  public void setInsuranceCustomerList(
      List<InsuranceCustomer> insuranceCustomerList) {
    this.insuranceCustomerList = insuranceCustomerList;
  }
  
  
}
