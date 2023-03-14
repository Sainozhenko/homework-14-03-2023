public class Main {
    public static void main(String[] args) {
        Car vw = new Car("VW", "Black", 2023);
        vw.stop();
        vw.drive();
        System.out.println(vw);

        System.out.println();

        PassengerCar car = new PassengerCar("Volvo", "Green", 2002, 4);
        System.out.println(car);
        car.drive();
        car.stop();
        System.out.println(car.numberOfSeats);


        System.out.println();

        Track traktor = new Track("Mann", "Yellow", 2009, 300);
        System.out.println(traktor);
        traktor.drive();
        traktor.stop();
        System.out.println(traktor.loadCapacity);

    }
}