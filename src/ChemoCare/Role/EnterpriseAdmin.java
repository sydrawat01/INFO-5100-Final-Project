package ChemoCare.Role;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import UI.AdminRole.EnterpriseAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class EnterpriseAdmin extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem ecosystem) {
   return new EnterpriseAdminWorkArea(userProcessContainer, enterprise, account,ecosystem);
  }
}
