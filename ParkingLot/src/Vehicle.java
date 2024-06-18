public class Vehicle {
    private String vechicleNo;
    private VehicleSize vechicleSize;
    public Vehicle(String vechicleNo, VehicleSize vehicleSize )
    {
        vechicleNo=this.vechicleNo;
        vehicleSize=this.vechicleSize;
    }
    public VehicleSize getVechicleSize() {
        return vechicleSize;
    }
    public String getVechicleNo()
    {
        return vechicleNo;
    }
    public void setVechicleNo(String vechicleNo)
    {
        vechicleNo=this.vechicleNo;
    }
    public void setVechicleSize(VehicleSize vechicleSize) {
        this.vechicleSize = vechicleSize;
    }
}
