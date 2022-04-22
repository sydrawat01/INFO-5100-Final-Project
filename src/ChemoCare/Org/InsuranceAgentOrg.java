/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Org;


import ChemoCare.Role.GovtHealthOfficial;
import ChemoCare.Role.InsuranceAgent;
import ChemoCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jeelpatel
 */
public class InsuranceAgentOrg extends Org {
    public InsuranceAgentOrg() {
        super(Org.Type.InsuranceAgent.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceAgent());
        return roles;
    }
}
