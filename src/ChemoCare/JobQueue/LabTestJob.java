package ChemoCare.JobQueue;

/**
 *
 * @author sid
 */
public class LabTestJob extends JobRequest {
  private String results;

  public String getResults() {
    return results;
  }

  public void setResults(String results) {
    this.results = results;
  }
  
  
}
