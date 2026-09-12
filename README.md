# SDP assignment 1
# TravelItinerary Builder
## Muratova Albina | SE-2511

## Project Description

This project demonstrates the Builder design pattern in Java.
The product is a `TravelItinerary`, which represents a travel plan. It contains information such as destination, duration, transport, accommodation, travel style, activities, and budget.
The Builder pattern is useful for this product because a travel itinerary can have many optional parameters. It allows the object to be created step by step without using a large constructor with many parameters.

## Builder Pattern Components

### Product

`TravelItinerary` is the Product. It represents the final travel itinerary object.

### Builder

`TravelItinerary.Builder` is responsible for the step-by-step construction of a `TravelItinerary`.
Each setter method returns the same Builder object, which allows method chaining.

### Director

`TravelItineraryDirector` creates predefined travel configurations such as:
- Budget trip
- Weekend trip
- Luxury trip
The Director reuses the Builder to create these configurations.

### Client

`Main` is the Client. It creates different travel itineraries using the Builder and Director and prints the results.

## Clean Code Principles

### 1. Meaningful Names

Before:

```java
public Builder setS(String s) {
    this.s = s;
    return this;
}
```

After:

```java
public Builder setDestination(String destination) {
    this.destination = destination;
    return this;
}
```
The second version makes the purpose of the method and variable clear.

### 2. Small Methods

Each Builder method performs one simple task.
For example:

```java
public Builder setBudget(double budget) {
    this.budget = budget;
    return this;
}
```

The method only sets the budget and returns the Builder.

### 3. Focused Classes

The project separates responsibilities between different classes:

- `TravelItinerary` represents the product.
- `TravelItineraryDirector` creates predefined configurations.
- `Main` tests the implementation.

This makes the code easier to read and maintain.

### 4. Validated Construction

The `build()` method checks whether the itinerary contains valid data.
For example:

```java
if (destination == null || destination.isBlank()) {
    throw new IllegalArgumentException("Destination is required");
}
```

It also validates the trip duration and budget before creating the final object.

### 5. No Magic Numbers

Instead of writing duration limits directly in the validation logic, named constants are used:

```java
private static final int MIN_TRIP_DURATION_DAYS = 1;
private static final int MAX_TRIP_DURATION_DAYS = 30;
```

This makes the meaning of the values clear and makes them easier to change.

## Example

A custom itinerary can be created using method chaining:

```java
TravelItinerary trip = new TravelItinerary.Builder()
        .setDestination("Astana")
        .setDurationDays(5)
        .setTransport("Train")
        .setAccommodation("Hotel")
        .setTravelStyle("Adventure")
        .setActivities("excursion")
        .setBudget(150000)
        .build();
```

The Builder also allows creating a simpler itinerary with only the required information:

```java
TravelItinerary simpleTrip = new TravelItinerary.Builder()
        .setDestination("Almaty")
        .setDurationDays(2)
        .build();
```

## Project Structure

```text
TravelItineraryBuilder/
├── src/
│   ├── TravelItinerary.java
│   ├── TravelItineraryDirector.java
│   └── Main.java
├── README.md
└── .gitignore
```

## Technologies

- Java
- IntelliJ IDEA
- Git
- GitHub
