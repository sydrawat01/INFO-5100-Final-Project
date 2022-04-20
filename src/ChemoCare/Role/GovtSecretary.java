package ChemoCare.Role;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import UI.GovtSecretary.SecretaryWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class GovtSecretary extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account userAccount, Org org, Enterprise enterprise, Ecosystem business) {
    return new SecretaryWorkArea();
  }
}
