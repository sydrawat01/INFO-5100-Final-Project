package ChemoCare.Role;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import UI.InsurancePlanner.InsurancePlannerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class InsurancePlanner extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem business) {
    return new InsurancePlannerWorkArea();
  }
}
