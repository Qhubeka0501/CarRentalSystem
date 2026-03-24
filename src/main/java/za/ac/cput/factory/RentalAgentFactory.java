package za.ac.cput.factory;

import za.ac.cput.domain.RentalAgent;

public class RentalAgentFactory {
    public static RentalAgent createRentalAgent(String agentId, String name, String email, String phoneNumber) {

        return new RentalAgent.Builder()
                .setAgentId(agentId)
                .setName(name)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .build();
    }
}
