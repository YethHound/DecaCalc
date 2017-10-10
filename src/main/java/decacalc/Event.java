package main.java.decacalc;

public class Event {
	
	private String name;
	private boolean isTrack;
	private double constA;
	private double constB;
	private double constC;
	
	public Event(String name, boolean isTrack, double a, double b, double c) {
		this.name = name;
		this.isTrack = isTrack;
		this.constA = a;
		this.constB = b;
		this.constC = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTrack() {
		return isTrack;
	}

	public void setTrack(boolean isTrack) {
		this.isTrack = isTrack;
	}

	public double getConstA() {
		return constA;
	}

	public void setConstA(double constA) {
		this.constA = constA;
	}

	public double getConstB() {
		return constB;
	}

	public void setConstB(double constB) {
		this.constB = constB;
	}

	public double getConstC() {
		return constC;
	}

	public void setConstC(double constC) {
		this.constC = constC;
	}
	
}

