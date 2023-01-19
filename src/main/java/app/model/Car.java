package app.model;

public class Car {
    public Car(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    private String brand;

    private String model;

    private int power;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
