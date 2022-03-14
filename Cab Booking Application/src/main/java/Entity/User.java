package Entity;

public class User {

    private Long id;

    private String name;

    private int age;

    private Long phone;

    private Location location;

    public User() {
    }

    public User(Long id, String name, int age, Long phone, Location location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.location = location;
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
}
