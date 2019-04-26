class PizzaDelivery {
    // ...
    int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }
}



class PizzaDelivery {
    // ...
    int getRating() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }
}