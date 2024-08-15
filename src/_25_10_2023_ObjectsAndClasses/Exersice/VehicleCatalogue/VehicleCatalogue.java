package _25_10_2023_ObjectsAndClasses.Exersice.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;

public class VehicleCatalogue {
    String typeOfVehicle;
    String modelOfVehicle;

    String color;
    double horsepower;
    List<List<String>> list = new ArrayList<>();

    public VehicleCatalogue(String typeOfVehicle, String modelOfVehicle, String color,double horsepower) {
       setTypeOfVehicle(typeOfVehicle);
        this.modelOfVehicle = modelOfVehicle;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        if (typeOfVehicle.equalsIgnoreCase("car")) {
            this.typeOfVehicle = "Car";
        } else if (typeOfVehicle.equalsIgnoreCase("truck")) {
            this.typeOfVehicle = "Truck";
        }
    }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public String getColor() {
        return color;
    }

    public double getHorsepower() {
        return horsepower;
    }
    public String print(){
        String formatted=String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %.0f",typeOfVehicle,modelOfVehicle,color,horsepower);
        return formatted;
    }
    public void printResult(List<VehicleCatalogue>list) {
        double carAnv = 0.0;
        int coutCar = 0;
        double truckAnv = 0.0;
        int countTruck = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTypeOfVehicle().equals("Car")) {
                double current = list.get(i).getHorsepower();
                carAnv += current;
                coutCar++;
            } else if (list.get(i).getTypeOfVehicle().equals("Truck")) {
                double current = list.get(i).getHorsepower();
                truckAnv += current;
                countTruck++;

            }
        }
        if(coutCar!=0) {
            carAnv = carAnv / coutCar;
        } if (countTruck!=0){
            truckAnv = truckAnv / countTruck;
        }


        System.out.printf("Cars have average horsepower of: %.2f.\n", carAnv);
        System.out.printf("Trucks have average horsepower of: %.2f.\n", truckAnv);

    }
}