package Entity;

public class Ride {

    private Long id;

    private Location source;

    private Location destination;

    private User user;

    private Driver driver;

    private Double billing;

    public Ride(Long id, Location source, Location destination, User user, Driver driver, Double billing) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.user = user;
        this.driver = driver;
        this.billing = billing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        destination = destination;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Double getBilling() {
        return billing;
    }

    public void setBilling(Double billing) {
        this.billing = billing;
    }
}
