import java.util.ArrayList;

public class ParkingSports {
    public ArrayList<ParkingFloor> level;
    public void addLevel(ParkingFloor parkingFloor) {
        level.add(parkingFloor);
    }
    public void removeLevel(int floor) {
        level.remove(floor);
    }
    public int park(int floorNumber, Vehicle vehicle) {
        return level.get(floorNumber).add(vehicle);
    }
    public void clearParking(int floorNumber, Vehicle vehicle) {
        level.get(floorNumber).freeSpace(vehicle);
    }
}
