package za.ac.cput.repository;

import za.ac.cput.domain.RentalAgent;
import java.util.*;
import java.util.HashMap;

public class RentalAgentRepository {
    private Map<String, RentalAgent> agentMap;

    // Constructor
    public RentalAgentRepository() {
        this.agentMap = new HashMap<>();
    }

    // CREATE / SAVE
    public RentalAgent save(RentalAgent rentalAgent) {
        agentMap.put(rentalAgent.getAgentId(), rentalAgent);
        return rentalAgent;
    }

    // READ (find by ID)
    public RentalAgent findById(String agentId) {
        return agentMap.get(agentId);
    }

    // READ ALL
    public List<RentalAgent> getAll() {
        return new ArrayList<>(agentMap.values());
    }

    // DELETE
    public boolean delete(String agentId) {
        return agentMap.remove(agentId) != null;
    }
}
