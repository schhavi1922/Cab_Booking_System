package Service;

import Entity.Location;
import Entity.User;
import java.util.Scanner;
import java.util.List;

public class UserService {

    public static Scanner sc = new Scanner(System.in);

    public List<User> addUser(List<User> userList){
        User user = new User();
        Location location = new Location();
        user.setId((long) (userList.size()+1));
        System.out.print("Please enter user's name :");
        user.setName(sc.next());
        System.out.print("Please enter user's mobile no. :");
        user.setPhone(sc.nextLong());
        System.out.print("Please enter user's age :");
        user.setAge(sc.nextInt());
        System.out.print("Please enter user's location X :");
        location.setLat(sc.nextInt());
        System.out.print("Please enter user's location Y :");
        location.setLon(sc.nextInt());
        user.setLocation(location);
        userList.add(user);
        System.out.println("User added successfully!!!");
        printUser(userList);
        return userList;
    }

    public List<User> updateUser(List<User> userList, Long id){
        boolean flag = false;
        for (User user : userList) {
            if(user.getId().equals(id)){
                flag = true;
                int select = 0;
                System.out.println("To update user's name Press 1");
                System.out.println("To update user's mobile no. Press 2");
                System.out.println("To update user's age Press 3");
                System.out.println("To update user's location Press 4");
                select = sc.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Please enter the updated name : ");
                        user.setName(sc.next());
                        break;
                    case 2:
                        System.out.print("Please enter the updated mobile no. : ");
                        user.setPhone(sc.nextLong());
                        break;
                    case 3:
                        System.out.print("Please enter the updated age : ");
                        user.setAge(sc.nextInt());
                        break;
                    case 4:
                        System.out.print("Please enter the updated location X : ");
                        user.getLocation().setLat(sc.nextInt());
                        System.out.print("Please enter the updated location Y : ");
                        user.getLocation().setLon(sc.nextInt());
                        break;
                }
            }
            printUser(userList);
        }
        if(flag==false){
            System.out.println("Invalid user id");
            return userList;
        }
        return userList;
    }

    public void printUser(List<User> userList){
        System.out.println("Current Users");
        for (User user : userList) {
            System.out.println(user.getId()+"   "+user.getName()+"   "+user.getPhone()+"   "+user.getAge()+"   "+user.getLocation().getLat()+"   "+user.getLocation().getLon());
        }
    }

}
