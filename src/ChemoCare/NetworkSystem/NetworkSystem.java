/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.NetworkSystem;

import ChemoCare.Enterprise.EnterpriseDirectory;

/**
 *
 * @author jeelpatel, sid
 */
public class NetworkSystem {
    private String name;
    private int zipcode;
    private EnterpriseDirectory enterpriseDirectory;

  public NetworkSystem() {
    enterpriseDirectory = new EnterpriseDirectory();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getZipcode() {
    return zipcode;
  }

  public void setZipcode(int zipcode) {
    this.zipcode = zipcode;
  }

  public EnterpriseDirectory getEnterpriseDirectory() {
    return enterpriseDirectory;
  }
  
}
