package ChemoCare.Role;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import UI.HealthcareAccountant.AccountantWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class Accountant extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem ecosystem) {
    return new AccountantWorkArea();
  }
}
