/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Enterprise;

import ChemoCare.Role.Role;
import ChemoCare.Order.OrderDirectory;
import ChemoCare.Org.Org;
import ChemoCare.Patient.PatientDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeelpatel, sid
 */
public class CancerCenterEnterprise  extends Enterprise {
    private PatientDirectory patientDirectory;
    private OrderDirectory orderDirectory;
    
      public CancerCenterEnterprise(String orgName, int zip, String address) {
        super(orgName, EnterpriseType.CancerCenter, zip,address);
        patientDirectory = new PatientDirectory();
        orderDirectory = new OrderDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public List<Org.Type> getAllOrganizationTypes() {
        List<Org.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Org.Type.Doctor);
        orgTypes.add(Org.Type.Lab);
        orgTypes.add(Org.Type.Accountant);

        return orgTypes;

    }
     @Override
    public String toString() {
        return this.getOrgName();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

}
