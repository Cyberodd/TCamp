package intermediate;

public class VehicleINH extends Transporter {
	private int tyres;
	private String vehicleType;
	
	public VehicleINH(String m, int tyres, String VehicleType) {
		this.tyres = tyres;
		this.vehicleType = vehicleType;
		super.make = make;
		super.model = model;
		super.colour = colour;
		super.bodyType = bodyType;
		super.enginecc = enginecc;
		super.id = id;
		super.passengers = passengers;
		super.speed = 0;
		super.topSpeed = topSpeed;
	}
	public void accelerate() {
		if (speed == topSpeed) {
			speed = topSpeed;
		}
		else {
			speed++;
		}
	}
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public void decelerate() {
		if (speed == 0) {
			speed = 0;
		}
		else {
			speed--;
		}
	}
}
