package main.java;

public class Car {

    private String brand;
    private String model;
    private Engine engine; 

    public Car(String brand, String model, String engineType, int horsepower) {
        this.brand = brand;
        this.model = model;
        
        this.engine = new Engine(engineType, horsepower);
    }

    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Encendiendo el vehículo " + brand + " " + model + "...");
        if (engine != null) {
            engine.start();
        } else {
            System.out.println("Error: El automóvil no cuenta con un motor instalado.");
        }
    }

    public void showInformation() {
        System.out.println("----------------------------------------");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("DETALLES DEL MOTOR:");
        if (engine != null) {
            engine.showInformation();
        } else {
            System.out.println("Sin motor.");
        }
        System.out.println("----------------------------------------");
    }
}