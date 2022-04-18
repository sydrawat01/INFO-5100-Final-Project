/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChemoCare.Enterprise;
import java.util.List;
import ChemoCare.Org.Org;
import ChemoCare.Org.OrgDirectory;
/**
 *
 * @author jeelpatel
 */
public abstract class Enterprise extends Org {
    private int zipcode;
    private String address;
    private String email;
    private EnterpriseType enterpriseType;
    private OrgDirectory orgDirectory;

      public Enterprise(String orgName, EnterpriseType type,int zip,String address) {
        super(orgName);
        this.enterpriseType = type;
        this.zipcode = zip;
        this.address = address;
        this.email = "sydrawat@gmail.com";
        orgDirectory = new OrgDirectory();
    }
    public enum EnterpriseType {

        HealthCenter("HealthCenter"),
        InsuranceCompany("InsuranceCompany"),
        Government("Government"),
        Pharma("Pharma");

        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
