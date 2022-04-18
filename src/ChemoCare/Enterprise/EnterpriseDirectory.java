/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Enterprise;

import ChemoCare.Org.OrgDirectory;
import java.util.ArrayList;
/**
 *
 * @author jeelpatel
 */
public class EnterpriseDirectory {
      private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
       public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
     
    
}
