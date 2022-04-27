package ChemoCare.JobQueue;

import java.util.ArrayList;

/**
 *
 * @author sid
 */
public class JobQueue {
  private ArrayList<JobRequest> jobRequestList;

  public JobQueue() {
    jobRequestList = new ArrayList<>();
  }

  public ArrayList<JobRequest> getJobRequestList() {
    return jobRequestList;
  }
  
  
}
