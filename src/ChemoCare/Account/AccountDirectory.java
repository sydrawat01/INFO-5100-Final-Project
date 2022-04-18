package ChemoCare.Account;

import java.util.ArrayList;

/**
 *
 * @author sid
 */
public class AccountDirectory {
  private ArrayList<Account> userAccountList;

  public AccountDirectory() {
    userAccountList = new ArrayList<>();
  }

  public ArrayList<Account> getUserAccountList() {
    return userAccountList;
  }
  
  // createUser - Employee
  //createUser - Patient
  // have unique username
  
  // Authenticate User
  public Account authUser(String username, String password) {
    for(Account account: userAccountList) {
      if(account.getUsername().equals(username) && account.getPassword().equals(password))
        return account;
    }
    return null;
  }
  
}
