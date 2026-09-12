public class TravelItineraryDirector {
    public TravelItinerary createBudgetTrip(String destination) {
        return new TravelItinerary.Builder()
                .setDestination(destination)
                .setDurationDays(3)
                .setTransport("Bus")
                .setAccommodation("Hostel")
                .setTravelStyle("Budget")
                .setActivities("City walk")
                .setBudget(50000)
                .build();
    }
    public TravelItinerary createWeekendTrip(String destination) {
        return new TravelItinerary.Builder()
                .setDestination(destination)
                .setDurationDays(2)
                .setTransport("Train")
                .setAccommodation("Hotel")
                .setTravelStyle("Relax")
                .setActivities("Sightseeing")
                .setBudget(80000)
                .build();
    }
    public TravelItinerary createLuxuryTrip(String destination) {
        return new TravelItinerary.Builder()
                .setDestination(destination)
                .setDurationDays(7)
                .setTransport("Plane")
                .setAccommodation("5-star Hotel")
                .setTravelStyle("Luxury")
                .setActivities("Private tours")
                .setBudget(500000)
                .build();
    }
}
