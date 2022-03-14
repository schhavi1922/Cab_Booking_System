package Entity;

public class Driver {

    private Long id;

    private String name;

    private int age;

    private Long phone;

    private Location location;

    private String vehicleNumber;

    private String vehicleName;

    private boolean active;

    public Driver() {
    }

    public Driver(Long id, String name, int age, Long phone, Location location, String vehicleNumber, String vehicleName, boolean active) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.location = location;
        this.vehicleNumber = vehicleNumber;
        this.vehicleName = vehicleName;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
