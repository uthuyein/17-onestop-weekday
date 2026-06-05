package com.jdc.mkt;

public class Main {

	public static void main(String[] args) {
		HomeTheater theater = new HomeTheater(
				new DVDPlayer(),
				new Projector(), 
				new Amplifier(), 
				new Lights());
		
		theater.watchMovie("Ghost town");
		theater.endMovie();
	}
}

class HomeTheater{
	private DVDPlayer dvd;
	private Projector projector;
	private Amplifier amp;
	private Lights lights;
	
	public HomeTheater(DVDPlayer dvd, Projector projector, Amplifier amp, Lights lights) {
		super();
		this.dvd = dvd;
		this.projector = projector;
		this.amp = amp;
		this.lights = lights;
	}
	
	void watchMovie(String name) {
		lights.dim();
		projector.on();
		amp.setVolume(10);
		dvd.play(name);
	}
	
	void endMovie() {
		dvd.stop();
		amp.off();
		projector.off();
		lights.on();
	}
	
}

class DVDPlayer{
	void play(String name) {
		System.out.println("Play movie of "+name);
	}
	void stop() {
		System.out.println("Stop movie.");
	}
}
class Projector{
	void off() {
		System.out.println("Projector is off.");
	}
	void on() {
		System.out.println("Projector is on.");
	}
}
class Amplifier{
	void off() {
		System.out.println("Amp is off.");
	}
	
	void setVolume(int value) {
		System.out.println("Volume level is "+value);
	}
}
class Lights{
	
	void dim() {
		System.out.println("All lighting will dim.");
	}
	void on() {
		System.out.println("All lighting are on.");
	}
}
