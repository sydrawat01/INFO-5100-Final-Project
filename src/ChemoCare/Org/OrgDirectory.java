/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Org;

import ChemoCare.Org.Org.Type;
import static ChemoCare.Org.Org.Type.InsuranceTreasurer;
import java.util.ArrayList;
/**
 *
 * @author jeelpatel
 */
public class OrgDirectory {
    
    private ArrayList<Org> organizationList;
    
      public OrgDirectory() {
        organizationList = new ArrayList();
    }
      
     public ArrayList<Org> getOrganizations() {
        return organizationList;
    }
    public Org createOrganization(Type type){
        Org organization = null;
        
        //Adding HealthCenter Organizations
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabAttendantOrg();
            organizationList.add(organization);
        }
        
         else if(type.getValue().equals(Type.Patient.getValue()))
        {
            organization = new PatientOrg();
            organizationList.add(organization);
                    
        }
        
        else if(type.getValue().equals(Type.Accountant.getValue()))
        {
            organization = new AccountantOrg();
            organizationList.add(organization);
                    
        }
        
        //Adding Government Organizations
        
        else if(type.getValue().equals(Type.HealthOfficial.getValue()))
        {
            organization = new HealthOfficialOrg();
            organizationList.add(organization);
                    
        }
        
         else if(type.getValue().equals(Type.Secretary.getValue()))
        {
            organization = new SecretaryOrg();
            organizationList.add(organization);
                    
        }
         else if(type.getValue().equals(Type.FinancialOfficial.getValue()))
        {
            organization = new FinancialOfficialOrg();
            organizationList.add(organization);
                    
        }
                //Adding Insurance Organizations
                
          else if(type.getValue().equals(Type.InsuranceAgent.getValue()))
        {
            organization = new InsuranceAgentOrg();
            organizationList.add(organization);
                    
        } 
          else if(type.getValue().equals(Type.InsuranceTreasurer.getValue()))
        {
            organization = new InsuranceTreasurerOrg();
            organizationList.add(organization);
                    
        }
          else if(type.getValue().equals(Type.InsurancePlanner.getValue()))
        {
            organization = new InsurancePlannerOrg();
            organizationList.add(organization);
                    
        }
          //Adding Pharma Organizations
        else if(type.getValue().equals(Type.Transportation.getValue()))
        {
            organization = new TransportOrg();
            organizationList.add(organization);
                    
        }
        else if(type.getValue().equals(Type.Manager.getValue()))
        {
            organization = new ManagerOrg();
            organizationList.add(organization);
                    
        }
        
        

       
        return organization;
    }
    
}
