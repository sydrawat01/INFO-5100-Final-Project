/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Org;

import java.util.ArrayList;
import ChemoCare.Role.Accountant;
import ChemoCare.Role.Role;
import ChemoCare.Role.Transportation;


/**
 *
 * @author jeelpatel
 */
public class TransportOrg extends Org{
     public TransportOrg() {
        super(Org.Type.Transportation.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Transportation());
        return roles;
    }

}
