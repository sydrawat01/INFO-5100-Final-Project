/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Role;

import javax.swing.JPanel;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.Org;
import ChemoCare.Account.Account;

/**
 *
 * @author jeelpatel
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Patient("Patient"),
        Accountant("Accountant"),
        InsuranceAgent("Insurance Agent"),
        InsurancePlanner("Insurance Planner"),
        InsuranceFinanceManager("Insurance Finance Manager"),
        GovernmentHealthOfficer("Government Health Officer"),
        GovernmentTreasurer("Government Treasurer"),
        GovernmentSecretary("Government Secretary"),
        PharmaTransport("Pharmacy Transport"),
        PharmaManager("Pharmacy Manager")
        ;
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            Account account, 
            Org org, 
            Enterprise enterprise);

    @Override
    public String toString() {
        return this.getClass().getName().toString().split("ChemoCare.Role.")[1];
    }
    
    
    
}
