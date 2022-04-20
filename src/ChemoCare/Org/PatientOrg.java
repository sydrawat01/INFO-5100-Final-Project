/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Org;

import ChemoCare.Role.GovtHealthOfficial;
import ChemoCare.Role.Patient;
import ChemoCare.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jeelpatel
 */
public class PatientOrg extends Org{
    
    public PatientOrg() {
        super(Org.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Patient());
        return roles;
    }
    
}
