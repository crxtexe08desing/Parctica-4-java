package main.java;

public class Engine {

    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        if (horsepower > 0) {
            this.horsepower = horsepower;
        } else {
            System.out.println("La potencia en HP debe ser mayor a 0.");
        }
    }

    public void start() {
        System.out.println("El motor " + type + " de " + horsepower + " HP ha sido encendido. Brum brum!");
    }

    public void showInformation() {
        System.out.println("Tipo de Motor: " + type);
        System.out.println("Potencia: " + horsepower + " HP");
    }
}
 