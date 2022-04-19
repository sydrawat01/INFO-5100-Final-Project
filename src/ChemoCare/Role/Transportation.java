package ChemoCare.Role;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import UI.PharmacyTransportation.TransportationWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class Transportation extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem ecosystem) {
    return new TransportationWorkArea();
  }
}
