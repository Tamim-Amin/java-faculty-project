
package chapter5;


//Fig 5.11
public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    // Constructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // Sets the accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Returns the accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Sets the makeAndModel
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    // Returns the makeAndModel
    public String getMakeAndModel() {
        return makeAndModel;
    }

    // Sets the state
    public void setState(String state) {
        this.state = state;
    }

    // Returns the state
    public String getState() {
        return state;
    }

    // Predicate method returns whether the state has no-fault insurance
    public boolean isNoFaultState() {
        boolean noFaultState;

        switch (state) {
            case "NJ":
            case "NY":
            case "PA":
            case "FL":
            case "MI":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
}