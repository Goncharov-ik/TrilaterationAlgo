public class BeaconCoord {
    private final Coordinates coordinates;
    private final double distance;

    public BeaconCoord(Coordinates coordinates, double distance){
        this.coordinates = coordinates;
        this.distance = distance;
    }

    public Coordinates getCoordinates()     { return coordinates; }
    public double getX()                    { return coordinates.getX(); }
    public double getY()                    { return coordinates.getY(); }
    public double getDistance()             { return distance; }
}
