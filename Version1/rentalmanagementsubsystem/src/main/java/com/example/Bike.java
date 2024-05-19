public class Bike {
    private int bikeId;
    private String bikeType;
    private boolean availability;
    private String location;

    public Bike(int bikeId, String bikeType, boolean availability, String location) {
        this.bikeId = bikeId;
        this.bikeType = bikeType;
        this.availability = availability;
        this.location = location;
    }

    public boolean checkAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    public int getBikeId() {
        return bikeId;
    }

    // Other getters and setters
}
