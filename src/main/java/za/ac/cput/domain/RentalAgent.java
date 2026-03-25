package za.ac.cput.domain;

public class RentalAgent {

  private String agentID;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private String branch;

  public RentalAgent(String agentId, String firstName, String lastName, String email, String phoneNumber, String branch) {
    this.agentId = agentId;
    this.firstname = firstname;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.branch = branch;
  }

  public String getAgentId() {
    return agentId;
    
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
    
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public String getBranch() {
    return branch;
  }
  public void setBranch(String branch) {
    this.branch = branch;
  }

  @override
  public String toString() {
    return "RentalAgent{" +
           "agentId=' " + agentId + '\'' +
           ", firstName= '" + firstName + '\'' +
           ", lastName= '" + lastName + '\'' +
           ", email= '" + email + '\'' +
           ", phoneNumber= '" + phoneNumber + '\'' +
           ", branch= '" + branch + '\'' +
          '}';
  }
  
}
