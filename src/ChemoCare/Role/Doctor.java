package ChemoCare.Role;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import ChemoCare.Org.DoctorOrg;
import UI.DoctorRole.DoctorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class Doctor extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account userAccount, Org org, Enterprise enterprise, Ecosystem business) {
    return new DoctorWorkArea(userProcessContainer, userAccount, (DoctorOrg)org, enterprise);
  }
  
}
