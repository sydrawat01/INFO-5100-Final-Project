package ChemoCare.Role;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import UI.InsuranceAgent.InsuranceAgentWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class InsuranceAgent extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem business) {
    return new InsuranceAgentWorkArea();
  }
}
