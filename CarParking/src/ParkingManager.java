import java.util.ArrayList;

public class ParkingManager {
    ParkingSports parkingSports;
    public ParkingManager(ParkingSports parkingSports, ArrayList<ParkingFloor> level) {
        this.parkingSports = parkingSports;
        this.parkingSports.level = level;
    }

    public void addFloor(ParkingFloor parkingFloor) {
        parkingSports.addLevel(parkingFloor);
    }
    public void park(int level ,Vehicle vehicle) {
        if(!parkingSports.level.get(level).isFull()) {
            int id = parkingSports.park(level, vehicle);
            System.out.println("Vehicle parked at sports "+id);
        }
    }
    public void clearParking(int level, Vehicle vehicle) {
        parkingSports.clearParking(level, vehicle);
    }
}
