public class Truck extends Vehicle{
    public Truck(int size, String owner, String number) {
        this.sizeNeeded = size;
        this.ownerName = owner;
        this.number = number;
    }

    @Override
    public void setType() {
        this.type = VehicalType.TRUCK;
    }
}
