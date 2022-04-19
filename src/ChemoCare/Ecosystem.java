package ChemoCare;

import ChemoCare.NetworkSystem.NetworkSystem;
import ChemoCare.Org.Org;
import ChemoCare.Role.Role;
import ChemoCare.Role.SysAdmin;
import java.util.ArrayList;


/**
 *
 * @author sid
 */
public class Ecosystem extends Org {
  private static Ecosystem ecosystem;
  private ArrayList<NetworkSystem> networkSystems;

  private Ecosystem() {
    super(null);
    networkSystems = new ArrayList<NetworkSystem>();
  }

  public ArrayList<NetworkSystem> getNetworkSystems() {
    return networkSystems;
  }

  public void setNetworkSystems(ArrayList<NetworkSystem> networkSystems) {
    this.networkSystems = networkSystems;
  }
  
  public static Ecosystem getInstanceOf() {
    if(ecosystem == null)
      ecosystem = new Ecosystem();
    return ecosystem;
  }
  
  public NetworkSystem createAndAddSystem() {
    NetworkSystem ns = new NetworkSystem();
    networkSystems.add(ns);
    return ns;
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> rolesList=new ArrayList<Role>();
    rolesList.add(new SysAdmin());
    return rolesList;
  }
  
  public boolean checkUniqueUser(String username) {
    if(!this.getUserAccountDirectory().checkUniqueUsername(username))
      return false;
    return true;
  }
}
