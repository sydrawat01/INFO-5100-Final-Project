/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Org;

import ChemoCare.Role.Doctor;
import ChemoCare.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author jeelpatel
 */
public class DoctorOrg extends Org {
     public DoctorOrg() {
        super(Org.Type.Doctor.getValue());
    }
     
         
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
}
