import Entity.Driver;
import Entity.Location;
import Entity.Ride;
import Entity.User;
import Service.DriverService;
import Service.RideService;
import Service.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CabBooking {

    public static Scanner sc = new Scanner(System.in);
    private final UserService userService;

    public CabBooking(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        List<Driver> driverList = new ArrayList<>();
        List<Ride> rideList = new ArrayList<>();
        UserService userService = new UserService();
        DriverService driverService = new DriverService();
        RideService rideService = new RideService();
        System.out.println("");
        System.out.println("--------WELCOME TO ONLINE CAB BOOKING PORTAL--------");
        System.out.println("");
        int i=1;
        while(i==1){
            int select = select();
            switch (select){
                case 0:
                    i=2;
                    break;
                case 1:
                    userList = userService.addUser(userList);
                    continue;
                case 2:
                    System.out.print("Please enter user id : ");
                    Long userId = sc.nextLong();
                    userList = userService.updateUser(userList, userId);
                    continue;
                case 3:
                    driverList = driverService.addDriver(driverList);
                    continue;
                case 4:
                    System.out.print("Please enter driver's id : ");
                    Long driverId = sc.nextLong();
                    driverList = driverService.updateDriver(driverList, driverId);
                    continue;
                case 5:
                    System.out.print("Please enter user Id : ");
                    Long id = sc.nextLong();
                    for (User user : userList) {
                        if(user.getId().equals(id)){
                            System.out.println("Please enter source X ");
                            int lat1 = sc.nextInt();
                            System.out.println("Please enter source Y ");
                            int lon1 = sc.nextInt();
                            System.out.println("Please enter destination X ");
                            int lat2 = sc.nextInt();
                            System.out.println("Please enter destination Y ");
                            int lon2 = sc.nextInt();
                            Location source = new Location(lat1, lon1);
                            Location destination = new Location(lat2, lon2);
                            rideList = rideService.searchRide(user, driverList, source, destination);
                        }
                    }
                    System.out.println("Select one ride by entering ride id : ");
                    Long rideId = sc.nextLong();
                    for (Ride ride: rideList) {
                        if(ride.getId().equals(rideId)){
                            System.out.println("Amount Payable : "+ride.getBilling());
                        }
                    }
                    continue;
            }
        }


    }

    private static int select() {
        System.out.println("------->   To register as User Press 1");
        System.out.println("------->   To update User Press 2");
        System.out.println("------->   To register as Driver Press 3");
        System.out.println("------->   To update Driver Press 4");
        System.out.println("------->   To book a ride Press 5");
        System.out.println("------->   To exit Press 0");
        return CabBooking.sc.nextInt();
    }



}
