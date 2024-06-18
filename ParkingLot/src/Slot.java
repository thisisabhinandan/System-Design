public class Slot {
    private int slotno;
    private boolean isEmpty;
    private Vehicle parkVehicle;

    public Slot(int slotno)
    {
        this.slotno=slotno;
        isEmpty=true;
    }
    public int getSlotno()
    {
        return slotno;
    }
    public void setSlotno(int slotno)
    {
        this.slotno=slotno;
    }
    public boolean isEmpty()
    {
        return isEmpty;
    }
    public void setEmpty(boolean isEmpty)
    {
        this.isEmpty=isEmpty;
    }
    public Vehicle getParkVehicle()
    {
        return parkVehicle;
    }
    public void setParkVehicle(Vehicle parkVehicle)
    {
        this.parkVehicle=parkVehicle;
    }
    public void vacateSlot()
    {
        parkVehicle=null;
        isEmpty=true;
    }
    public void occupySlot()
    {
        this.parkVehicle=parkVehicle;
        isEmpty=false;
    }

}
