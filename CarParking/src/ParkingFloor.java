import java.util.ArrayList;

public class ParkingFloor {
    private  int freeSpace;
    private int size;
    private ArrayList<Vehicle> sport;

    public ParkingFloor(int size, ArrayList<Vehicle> sport) {
        this.size = size;
        this.sport = sport;
        this.freeSpace = this.size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int add(Vehicle vehicle) {
        if(this.freeSpace > vehicle.getSizeNeeded()) {
            this.sport.add(vehicle);
            this.freeSpace = this.freeSpace - vehicle.getSizeNeeded();
            return this.sport.size();
        }
        else System.out.println("Vehicle required "+ vehicle.getSizeNeeded() + "But free sports is "+ this.freeSpace);
        return 0;
    }
    public void freeSpace(Vehicle vehicle) {
        this.sport.remove(vehicle);
        this.freeSpace = this.freeSpace + vehicle.getSizeNeeded();
    }
    public boolean isFull() {
        return this.freeSpace == 0;
    }
}
