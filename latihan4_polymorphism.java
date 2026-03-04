public class latihan4_polymorphism {
    public static void main(String[] args) {
        Car myCar = new ElectricCar("Wuling", "Biru", 67);
        myCar.startEngine();
        Car mobilbaru = new GasCar("Toyota", "Hitam", 67);
        mobilbaru.startEngine();
    }
}

abstract class Car {
    protected String brand;
    protected String color;
    private int speed;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void setSpeed(int speed) {
        if (speed >= 0){
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    abstract void startEngine();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Warna: " + color + ", Kecepatan: " + speed);
    }
}

class ElectricCar extends Car {
    public ElectricCar(String brand, String color, int speed){
        super(brand, color);
        this.setSpeed(speed);
    }
    @Override
    void startEngine(){
        System.out.println("Ini adalah Mobil Elektrik");
    }
}

class GasCar extends Car {
    public GasCar(String brand, String color, int speed){
        super(brand, color);
        this.setSpeed(speed);
    }
    @Override
    void startEngine(){
        System.out.println("Ini adalah Mobil Gas");
    }
}