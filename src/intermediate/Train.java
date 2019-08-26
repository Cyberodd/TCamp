package intermediate;

public class Train{
	private String load,type;
	private int weight, enginecc, speed, topSpeed;
	public Train(String load, String type, int weight, int enginecc, int topSpeed) {
		super();
		this.load = load;
		this.type = type;
		this.weight = weight;
		this.enginecc = enginecc;
		this.speed = 0;
		this.topSpeed = topSpeed;
	}
	Train(){
		this.speed= 0;
	}
	
	public String getLoad() {
		return load;
	}
	public void setLoad(String load) {
		this.load = load;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getEnginecc() {
		return enginecc;
	}
	public void setEnginecc(int enginecc) {
		this.enginecc = enginecc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = 0;
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

