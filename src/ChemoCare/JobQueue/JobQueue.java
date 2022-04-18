package ChemoCare.JobQueue;

import java.util.ArrayList;

/**
 *
 * @author sid
 */
public class JobQueue {
  private ArrayList<JobQueue> jobRequestList;

  public JobQueue() {
    jobRequestList = new ArrayList<>();
  }

  public ArrayList<JobQueue> getJobRequestList() {
    return jobRequestList;
  }
  
  
}
