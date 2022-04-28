package ChemoCare.Role;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import ChemoCare.Org.DoctorOrg;
import ChemoCare.Org.HealthOfficialOrg;
import UI.HealthcareOfficial.HealthOfficialWorkArea;
import UI.DoctorRole.DoctorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class GovtHealthOfficial  extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account userAccount, Org org, Enterprise enterprise, Ecosystem business) {
    return new HealthOfficialWorkArea(userProcessContainer, userAccount, (HealthOfficialOrg)org, enterprise);
  }
}
