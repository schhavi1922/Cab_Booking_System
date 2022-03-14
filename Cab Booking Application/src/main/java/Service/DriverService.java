package Service;

import Entity.Driver;
import Entity.Location;

import java.util.List;
import java.util.Scanner;

public class DriverService {

    public static Scanner sc = new Scanner(System.in);

    public List<Driver> addDriver(List<Driver> driverList){
        Driver driver = new Driver();
        Location location = new Location();
        driver.setId((long) (driverList.size()+1));
        System.out.print("Please enter Driver's name :");
        driver.setName(sc.next());
        System.out.print("Please enter Driver's mobile no. :");
        driver.setPhone(sc.nextLong());
        System.out.print("Please enter Driver's age :");
        driver.setAge(sc.nextInt());
        System.out.print("Please enter Driver's location X :");
        location.setLat(sc.nextInt());
        System.out.print("Please enter Driver's location Y :");
        location.setLon(sc.nextInt());
        driver.setLocation(location);
        System.out.println("Please set driver status : ");
        driver.setActive(sc.nextBoolean());
        System.out.println("Please Enter vehicle name :");
        driver.setVehicleName(sc.next());
        System.out.println("Please enter vehicle number :");
        driver.setVehicleNumber(sc.next());
        driverList.add(driver);
        System.out.println("Driver added successfully!!!");
        printDriver(driverList);
        return driverList;
    }

    public List<Driver> updateDriver(List<Driver> driverList, Long id){
        boolean flag = false;
        for (Driver driver : driverList) {
            if(driver.getId().equals(id)){
                flag = true;
                int select = 0;
                System.out.println("To update Driver's name Press 1");
                System.out.println("To update Driver's mobile no. Press 2");
                System.out.println("To update Driver's age Press 3");
                System.out.println("To update Driver's location Press 4");
                System.out.println("To update Driver's vehicle name Press 5");
                System.out.println("To update Driver's vehicle number Press 6");
                System.out.println("To update Driver's location Press 7");
                select = sc.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Please enter the updated name : ");
                        driver.setName(sc.next());
                        break;
                    case 2:
                        System.out.print("Please enter the updated mobile no. : ");
                        driver.setPhone(sc.nextLong());
                        break;
                    case 3:
                        System.out.print("Please enter the updated age : ");
                        driver.setAge(sc.nextInt());
                        break;
                    case 4:
                        System.out.print("Please enter the updated location X : ");
                        driver.getLocation().setLat(sc.nextInt());
                        System.out.print("Please enter the updated location Y : ");
                        driver.getLocation().setLon(sc.nextInt());
                        break;
                    case 5:
                        System.out.print("Please enter the vehicle name : ");
                        driver.setVehicleName(sc.next());
                        break;
                    case 6:
                        System.out.print("Please enter the vehicle number : ");
                        driver.setVehicleNumber(sc.next());
                        break;
                    case 7:
                        System.out.print("Please enter the driver's status : ");
                        driver.setActive(sc.nextBoolean());
                        break;
                }
            }
            printDriver(driverList);
        }
        if(flag==false){
            System.out.println("Invalid Driver id");
            return driverList;
        }
        return driverList;
    }

    public void printDriver(List<Driver> driverList){
        System.out.println("Current Drivers");
        for (Driver driver : driverList) {
            System.out.println(driver.getId()+"   "+driver.getName()+"   "+driver.getPhone()+"   "+driver.getAge()+"   "+driver.getLocation().getLat()+"   "+driver.getLocation().getLon()+"   "+driver.getVehicleName()+"   "+driver.getVehicleNumber());
        }
    }
}
