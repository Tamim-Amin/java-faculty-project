
package chapter5;
//Fig 5.12

public class AutoPolicyTest {
    public static void main(String[] args) {
        // Create two AutoPolicy objects
        AutoPolicy policy1 = new AutoPolicy(1111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(2222, "Honda Civic", "TX");

        // Test each policy to see if it's in a no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    // Method to check if the policy is in a no-fault state
    public static void policyInNoFaultState(AutoPolicy policy) 
    {
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(),(policy.isNoFaultState()? "is": "is not"));
    }
}
