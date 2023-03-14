public class PassengerCar extends Car {
    protected int numberOfSeats;

    public PassengerCar(String model, String colour, int productionDate, int numberOfSeats) {
        super(model, colour, productionDate);
        this.numberOfSeats = numberOfSeats;
    }
}

