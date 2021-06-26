import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        ParkingFloor floor1 = new ParkingFloor(5, new ArrayList<>());
        ParkingManager parkingManager = new ParkingManager(new ParkingSports(), new ArrayList<>());
        parkingManager.addFloor(floor1);
        parkingManager.park(0, new Car(2, "abhishek", "1234"));
        parkingManager.park(0, new Car(2, "abhishek", "1234"));
        parkingManager.park(0, new Car(2, "abhishek", "1234"));
    }
}
