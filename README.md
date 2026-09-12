# SDP_assingment1
# TravelItinerary Builder

## Project Description
This project demonstrates the Builder design pattern in Java.
The product is a `TravelItinerary`, which represents a travel plan. It contains information such as destination, duration, transport, accommodation, travel style, activities, and budget.
The Builder pattern is useful for this product because a travel itinerary can have many optional parameters. It allows the object to be created step by step without using a large constructor with many parameters.

## Builder Pattern Components
### Product
`TravelItinerary` is the Product. It represents the final travel itinerary object.

### Builder
`TravelItinerary.Builder` is responsible for step-by-step construction of a `TravelItinerary`.
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

After:
```java
public Builder setDestination(String destination) {
    this.destination = destination;
    return this;
}

The second version makes the purpose of the method and variable clear.
  

