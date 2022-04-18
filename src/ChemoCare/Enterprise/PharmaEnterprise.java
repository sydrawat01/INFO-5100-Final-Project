/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Enterprise;

import ChemoCare.Order.OrderDirectory;
import ChemoCare.Org.Org;
import ChemoCare.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jeelpatel, sid
 */
public class PharmaEnterprise extends Enterprise {

  private OrderDirectory orderDirectory;
  HashMap<String, Double> menu;

  public PharmaEnterprise(String orgName, int zip, String address) {
    super(orgName, EnterpriseType.Pharma, zip, address);
    orderDirectory = new OrderDirectory();
    menu = new HashMap();
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    return null;
  }

  @Override
  public List<Org.Type> getAllOrganizationTypes() {
    List<Org.Type> orgTypes = new ArrayList<>();
    orgTypes.add(Org.Type.Transportation);
    orgTypes.add(Org.Type.Manager);

    return orgTypes;
  }

  public OrderDirectory getOrderDirectory() {
    return orderDirectory;
  }

  public void setOrderDirectory(OrderDirectory orderDirectory) {
    this.orderDirectory = orderDirectory;
  }

  public HashMap<String, Double> getMenu() {
    return menu;
  }

  public void setMenu(HashMap<String, Double> menu) {
    this.menu = menu;
  }
}
