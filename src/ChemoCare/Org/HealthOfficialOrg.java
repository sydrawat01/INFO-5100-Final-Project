/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Org;

import ChemoCare.Role.GovtHealthOfficial;
import ChemoCare.Role.LabAttendant;
import ChemoCare.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author jeelpatel
 */
public class HealthOfficialOrg extends Org{
    
     public HealthOfficialOrg() {
        super(Org.Type.HealthOfficial.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovtHealthOfficial());
        return roles;
    }
}
