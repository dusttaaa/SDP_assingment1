public  class Main {
    public static void main(String[] args) {
        TravelItinerary trip = new TravelItinerary.Builder()
                .setDestination("Astana")
                .setDurationDays(5)
                .setTransport("Train")
                .setAccommodation("Hotel")
                .setTravelStyle("Adventure")
                .setActivities("excursion")
                .setBudget(150000)
                .build();
        System.out.println(trip);

        TravelItinerary simpleTrip = new TravelItinerary.Builder()
                .setDestination("Almaty")
                .setDurationDays(2)
                .build();
        System.out.println(simpleTrip);

        TravelItinerary anotherTrip = new TravelItinerary.Builder()
                .setBudget(100000)
                .setDestination("Shymkent")
                .setDurationDays(4)
                .setAccommodation("Hostel")
                .build();
        System.out.println(anotherTrip);

        TravelItineraryDirector director = new TravelItineraryDirector();

        TravelItinerary budgetTrip = director.createBudgetTrip("Almaty");
        System.out.println(budgetTrip);

        TravelItinerary weekendTrip = director.createWeekendTrip("Astana");
        System.out.println(weekendTrip);

        TravelItinerary luxuryTrip = director.createLuxuryTrip("Istanbul");
        System.out.println(luxuryTrip);
    }
}