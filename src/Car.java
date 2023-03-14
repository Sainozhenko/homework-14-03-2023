public class Car {
    String model;
    String colour;
    int productionDate;

    public Car(String model, String colour, int productionDate) {
        this.model = model;
        this.colour = colour;
        this.productionDate = productionDate;
    }

    void drive() {
        System.out.println("Car can drive");
    }

    void stop() {
        System.out.println("Car a stop when look people or red lights");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }
}
