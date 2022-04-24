package ChemoCare.Role;

import ChemoCare.Ecosystem;
import ChemoCare.Account.Account;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import UI.SysAdminWorkArea.SysAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author sid
 */
public class SysAdmin extends Role {
  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Org org, Enterprise enterprise, Ecosystem ecosystem) {
        return new SysAdminWorkArea(userProcessContainer, ecosystem);
    }
}
