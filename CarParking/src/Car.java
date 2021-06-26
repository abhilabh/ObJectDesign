public class Car extends Vehicle{
    public Car(int size, String owner, String number) {
        this.sizeNeeded = size;
        this.ownerName = owner;
        this.number = number;
    }
    @Override
    public void setType() {
        this.type = VehicalType.CAR;
    }
}
