public class Vehicle {
    private String vehicleNo;
    private VehicleSize vehicleSize;
    public Vehicle(String vehicleNo, VehicleSize vehicleSize )
    {
        this.vehicleNo=vehicleNo;
        this.vehicleSize=vehicleSize;
    }
    public VehicleSize getVechicleSize() {
        return vehicleSize;
    }
    public String getVechicleNo()
    {
        return vehicleNo;
    }
    public void setVehicleNo(String vehicleNo)
    {
        vehicleNo=this.vehicleNo;
    }
    public void setVehicleSize(VehicleSize vehicleSize) {
        this.vehicleSize = vehicleSize;
    }
}
