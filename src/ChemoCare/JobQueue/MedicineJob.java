package ChemoCare.JobQueue;

import ChemoCare.Account.Account;
import ChemoCare.Patient.Patient;

/**
 *
 * @author sid
 */
public class MedicineJob extends JobRequest {
  private String regDate;
  private String visitReason;
  private Patient patient;
  private String labTestMessage;
  private String prescription;
  private double billAmount;
  private Account assignedDoctor;

  public MedicineJob(String regDate, String visitReason, Patient patient) {
    this.regDate = regDate;
    this.visitReason = visitReason;
    this.patient = patient;
  }

  public String getRegDate() {
    return regDate;
  }

  public void setRegDate(String regDate) {
    this.regDate = regDate;
  }

  public String getVisitReason() {
    return visitReason;
  }

  public void setVisitReason(String visitReason) {
    this.visitReason = visitReason;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public String getLabTestMessage() {
    return labTestMessage;
  }

  public void setLabTestMessage(String labTestMessage) {
    this.labTestMessage = labTestMessage;
  }

  public String getPrescription() {
    return prescription;
  }

  public void setPrescription(String prescription) {
    this.prescription = prescription;
  }

  public double getBillAmount() {
    return billAmount;
  }

  public void setBillAmount(double billAmount) {
    this.billAmount = billAmount;
  }

  public Account getAssignedDoctor() {
    return assignedDoctor;
  }

  public void setAssignedDoctor(Account assignedDoctor) {
    this.assignedDoctor = assignedDoctor;
  }
  
  @Override
  public String toString() {
    return visitReason;
  }
}
