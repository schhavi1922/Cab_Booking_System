package Service;

import Entity.Driver;
import Entity.Location;
import Entity.Ride;
import Entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RideService {

    public static Scanner sc = new Scanner(System.in);

    public List<Ride> searchRide(User user, List<Driver> driverList, Location source, Location destination){
        List<Ride> availableRides = new ArrayList<>();
        int lat1 = user.getLocation().getLat();
        int lon1 = user.getLocation().getLon();
        for (Driver driver: driverList) {
            int lat2 = driver.getLocation().getLat();
            int lon2 = driver.getLocation().getLon();
            Double distance = Math.sqrt((lat2-lat1)*(lat2-lat1)+(lon2-lon1)*(lon2-lon1));
            if(driver.isActive() && distance<5){
                Double billing = (Math.sqrt((destination.getLat()- source.getLat())*(destination.getLat()- source.getLat())+(destination.getLon()-source.getLon())*(destination.getLon()-source.getLon())))*10;
                availableRides.add(new Ride((long) (availableRides.size()+1), source, destination, user, driver, billing));
            }
        }
        System.out.println("Total available rides : "+availableRides.size());
        printAllRides(availableRides);
        return availableRides;
    }

    public void printAllRides(List<Ride> rideList){
        for (Ride ride: rideList) {
            System.out.println(ride.getId()+"   "+ride.getDriver().getName()+"   "+ride.getDriver().getVehicleName()+"   "+ride.getDriver().getVehicleNumber()+"   "+ride.getBilling());
        }
    }

}
