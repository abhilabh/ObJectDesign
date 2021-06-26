public abstract class Vehicle {
    protected String number;
    protected VehicalType type;
    protected String ownerName;
    protected int sizeNeeded;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicalType getType() {
        return type;
    }

    public abstract void setType();

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getSizeNeeded() {
        return sizeNeeded;
    }

    public void setSizeNeeded(int sizeNeeded) {
        this.sizeNeeded = sizeNeeded;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", type=" + type +
                ", ownerName='" + ownerName + '\'' +
                ", sizeNeeded=" + sizeNeeded +
                '}';
    }
}
