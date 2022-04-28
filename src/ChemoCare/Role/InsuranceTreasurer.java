package ChemoCare.Role;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import ChemoCare.Org.InsurancePlannerOrg;
import ChemoCare.Org.InsuranceTreasurerOrg;
import ChemoCare.Account.Account;
import UI.InsuranceTreasurer.InsuranceTreasurerWorkArea;
import UI.InsurancePlanner.InsurancePlannerWorkArea;
import static ChemoCare.Org.Org.Type.InsuranceTreasurer;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class InsuranceTreasurer extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem business) {
    return new InsuranceTreasurerWorkArea(userProcessContainer, account, (InsuranceTreasurerOrg)org, enterprise);
  }
}
