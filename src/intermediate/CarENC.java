package intermediate;

public class CarENC {
	private String make, model, colour, bodyType;
	private int enginecc, id, passengers, speed, topSpeed;
	public CarENC(String make, String model, String colour, String bodyType, int enginecc, int id, int passengers,
			int speed, int topSpeed) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.bodyType = bodyType;
		this.enginecc = enginecc;
		this.id = id;
		this.passengers = passengers;
		this.speed = 0;
		this.topSpeed = topSpeed;
	}
	public CarENC() {
		
	}
		
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public int getEnginecc() {
		return enginecc;
	}
	public void setEnginecc(int enginecc) {
		this.enginecc = enginecc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public void accelerate() {
		if (speed == topSpeed) {
			speed = topSpeed;
		}
		else {
			speed++;
		}
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
