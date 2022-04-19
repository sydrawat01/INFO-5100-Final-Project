/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Org;
import ChemoCare.Role.LabAttendant;
import ChemoCare.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author jeelpatel
 */
public class LabAttendantOrg extends Org{
    public LabAttendantOrg() {
        super(Org.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAttendant());
        return roles;
    }
}
