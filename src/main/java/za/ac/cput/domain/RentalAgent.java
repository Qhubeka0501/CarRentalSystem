package za.ac.cput.domain;

public class RentalAgent {
    private String agentId;
    private String name;
    private String email;
    private String phoneNumber;

    private RentalAgent(Builder builder) {
        this.agentId = builder.agentId;
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getAgentId() {
        return agentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder {
        private String agentId;
        private String name;
        private String email;
        private String phoneNumber;

        public Builder setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public RentalAgent build() {
            return new RentalAgent(this);
        }
    }

    @Override
    public String toString() {
        return "RentalAgent{" +
                "agentId='" + agentId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

