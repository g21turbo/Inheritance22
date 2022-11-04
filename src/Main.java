public class Main {

        // inheritance = the process where one class acquires,
        //               the attributed and methods of another


    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.go();
        System.out.println("the car has " + car.doors + " wheels");

        bicycle.go();
        System.out.println("the bicycle has " + bicycle.pedals + " wheels");


    }





}
