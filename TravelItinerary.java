public class TravelItinerary {
    private static final int MIN_TRIP_DURATION_DAYS = 1;
    private static final int MAX_TRIP_DURATION_DAYS = 30;
    private final String destination;
    private final int durationDays;
    private final String transport;
    private final String accommodation;
    private final String travelStyle;
    private final String activities;
    private final double budget;
    private TravelItinerary(Builder builder) {
        this.destination = builder.destination;
        this.durationDays = builder.durationDays;
        this.transport = builder.transport;
        this.accommodation = builder.accommodation;
        this.travelStyle = builder.travelStyle;
        this.activities = builder.activities;
        this.budget = builder.budget;
    }
    @Override
    public String toString() {
        return "TravelItinerary{" +
                "destination='" + destination + '\'' +
                ", durationDays=" + durationDays +
                ", transport='" + transport + '\'' +
                ", accommodation='" + accommodation + '\'' +
                ", travelStyle='" + travelStyle + '\'' +
                ", activities='" + activities + '\'' +
                ", budget=" + budget + '}';
    }
    public static class Builder {
        private String destination;
        private int durationDays;
        private String transport;
        private String accommodation;
        private String travelStyle;
        private String activities;
        private double budget;
        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public Builder setDurationDays(int durationDays) {
            this.durationDays = durationDays;
            return this;
        }
        public Builder setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public Builder setAccommodation(String accommodation) {
            this.accommodation = accommodation;
            return this;
        }
        public Builder setTravelStyle(String travelStyle) {
            this.travelStyle = travelStyle;
            return this;
        }
        public Builder setActivities(String activities) {
            this.activities = activities;
            return this;
        }
        public Builder setBudget(double budget) {
            this.budget = budget;
            return this;
        }
        public TravelItinerary build() {
            if (destination == null || destination.isBlank()) {
                throw new IllegalArgumentException("Destination is required");
            }
            if (durationDays < MIN_TRIP_DURATION_DAYS || durationDays > MAX_TRIP_DURATION_DAYS) {
                throw new IllegalArgumentException("DurationDays must be between 1 and 30 days");
            }
            if (budget < 0) {
                throw new IllegalArgumentException("Budget cannot be negative");
            }
            return new TravelItinerary(this);
        }


    }
}
