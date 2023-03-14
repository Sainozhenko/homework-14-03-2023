public class Track extends Car {
    public int loadCapacity;

    public Track(String model, String colour, int productionDate, int loadCapacity) {
        super(model, colour, productionDate);
        this.loadCapacity = loadCapacity;
    }
}
