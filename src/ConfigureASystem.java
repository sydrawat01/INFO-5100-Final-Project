
import ChemoCare.Employee.Employee;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.NetworkSystem.NetworkSystem;


/**
 *
 * @author sid
 */
public class ConfigureASystem {
  public static Ecosystem configure() {
    Ecosystem ecosystem = Ecosystem.getInstanceOf();
    
    String email = "sydrawat@gmail.com";
    
    // NetworkSystem
    NetworkSystem ns1 = ecosystem.createAndAddSystem();
    ns1.setName("New Jersey");
    ns1.setZipcode(1111);
    
    NetworkSystem ns2 = ecosystem.createAndAddSystem();
    ns2.setName("Boston");
    ns2.setZipcode(1112);
    
    NetworkSystem ns3 = ecosystem.createAndAddSystem();
    ns3.setName("New York");
    ns3.setZipcode(1113);
    
    // Enterprise
    for(Enterprise.EnterpriseType type: Enterprise.EnterpriseType.values()) {
      if(type.toString() != null) switch(type.toString()) {
        case "CancerCenter":
          // Cancer center enterprise
          Enterprise e1 = ns1.getEnterpriseDirectory().createAndAddEnterprise("NJHealth", type, 1111, "745 Secaucus Rd, Jersey City, NJ 07307");
          Enterprise e2 = ns2.getEnterpriseDirectory().createAndAddEnterprise("BostonHealth", type, 1112, "104 Ward Street, Boston, MA 02120");
          Enterprise e3 = ns3.getEnterpriseDirectory().createAndAddEnterprise("NYHealth", type, 1113, "575 Hudson St, New York, NY 10014");
        
          // Cancer center employees
          Employee emp1 = e1.getEmployeeDirectory().createEmployee("NJHealth");
          emp1.setEmpEmail(email);
          // Create account with role: enterprise admin
          break;
        case "Pharma":
          // Pharma enterprise
          // Pharma employees
          // Create account with role: enterprise admin
          break;
        case "InsuranceCompany":
          // Insurance company enterprise
          // Insurance company employees
          // Create account with role: enterprise admin
          break;
        case "Government":
          // Govt enterprise
          // Govt employees
          // Create account with role: enterprise admin
          break;
        default:
          break;
      }
    }
    
    Employee sys = ecosystem.getEmployeeDirectory().createEmployee("admin");
    // Create account with role: sys admin
    
    return null;
  }
}
