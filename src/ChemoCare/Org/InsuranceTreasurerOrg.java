/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Org;

import ChemoCare.Role.InsuranceTreasurer;
import ChemoCare.Role.Role;
import java.util.ArrayList;
        
/**
 *
 * @author jeelpatel
 */
public class InsuranceTreasurerOrg extends Org {
    
    public InsuranceTreasurerOrg() {
        super(Org.Type.InsuranceTreasurer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceTreasurer());
        return roles;
    }
    
}
