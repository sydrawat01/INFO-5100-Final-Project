/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Enterprise;

import ChemoCare.Org.Org;
import ChemoCare.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeelpatel
 */
public class GovtEnterprise extends Enterprise {

    public GovtEnterprise(String orgName, int zip, String address) {
        super(orgName, EnterpriseType.Government, zip,address);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Org.Type> getAllOrganizationTypes() {
        List<Org.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Org.Type.HealthcareOfficer);
        orgTypes.add(Org.Type.Secretary);
        orgTypes.add(Org.Type.Treasurer);

        return orgTypes;
    }

}