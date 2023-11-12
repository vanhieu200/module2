package ss5_Ac_Modifier;

public class Car {
    private String name;
    private String hang;
    private static int numberOfcar;

    public Car(String name, String hang){
        this.name = name;
        this.hang = hang;
        numberOfcar++;
    }

    public static void main(String[] args) {
        Car c1 = new Car("camry","toyota");
        System.out.println(Car.numberOfcar);
        Car c2 = new Car("civic","honda");
        System.out.println(Car.numberOfcar);
    }
}
