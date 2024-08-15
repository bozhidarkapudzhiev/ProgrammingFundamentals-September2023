package _25_10_2023_ObjectsAndClasses.Exersice.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<VehicleCatalogue> list = new ArrayList<>();
        VehicleCatalogue vehicleCatalogue = null;
        while (!input.equals("End")) {
            String[] line = input.split("\\s");
            vehicleCatalogue = new VehicleCatalogue(line[0], line[1], line[2], Double.parseDouble(line[3]));
            list.add(vehicleCatalogue);
            input = scanner.nextLine();
        }
        String line = scanner.nextLine();
        while (true) {
            if (!line.equals("Close the Catalogue")) {
                for (VehicleCatalogue vehicle : list) {
                    if (vehicle.getModelOfVehicle().equals(line)) {
                        System.out.println(vehicle.print());
                        line = scanner.nextLine();
                    }
                }
            }else {
                break;
            }
        }
        vehicleCatalogue.printResult(list);
    }
}


