package Entity;

public class Location {

    private int Lat;

    private int Lon;

    public Location() {
    }

    public Location(int lat, int lon) {
        Lat = lat;
        Lon = lon;
    }

    public int getLat() {
        return Lat;
    }

    public void setLat(int lat) {
        Lat = lat;
    }

    public int getLon() {
        return Lon;
    }

    public void setLon(int lon) {
        Lon = lon;
    }
}
