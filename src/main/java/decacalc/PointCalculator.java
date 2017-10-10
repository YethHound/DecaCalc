package main.java.decacalc;

import java.util.HashMap;

public class PointCalculator{
	
	private static HashMap<String, Event> events = new HashMap<>();
	
	private static Event hundredMeterDash = new Event("100m",true,25.4347,18,1.81);
	private static Event longJump = new Event("Long jump",false,0.14354,220,1.4);
	private static Event shotPut = new Event("Shot put",false,51.39,1.5,1.05);
	private static Event highJump = new Event("High jump",false,0.8465,75,1.42);
	private static Event fourHundredMeterDash = new Event("400m",true,1.53775,82,1.81);
	private static Event hurdles = new Event("110m hurdles",true,5.74352,28.5,1.52);
	private static Event discus = new Event("Discus throw",false,12.91,4,1.1);
	private static Event poleVault = new Event("Pole vault",false,0.2797,100,1.35);
	private static Event javelin = new Event("Javelin throw",false,10.14,7,1.08);
	private static Event thousandFiveHundredMeterRun = new Event("1500m",true,0.03768,480,1.85);
	
	private static void populateEvents() {
		events.put(hundredMeterDash.getName(), hundredMeterDash);
		events.put(longJump.getName(), longJump);
		events.put(shotPut.getName(), shotPut);
		events.put(highJump.getName(), highJump);
		events.put(fourHundredMeterDash.getName(), fourHundredMeterDash);
		events.put(hurdles.getName(), hurdles);
		events.put(discus.getName(), discus);
		events.put(poleVault.getName(), poleVault);
		events.put(javelin.getName(), javelin);
		events.put(thousandFiveHundredMeterRun.getName(), thousandFiveHundredMeterRun);
		
	}
	
	public static double points(String eventName, Double result){
		
		populateEvents();

		if(events.get(eventName)==null){
			throw new IllegalArgumentException("Valid parameters are: '100m', 'long jump','shot put','high jump','400m','110m hurdles','discus throw','pole vault','javelin throw' and '1500m'");
		}
		
		Event event = events.get(eventName);
		//For track events the formula is A*(B-P)^C for field events it is A*(P-B)^C where A,B and C are constants and P is the result
		if(event.isTrack()){
         	Double points = event.getConstA()*Math.pow((event.getConstB()-result),event.getConstC());
         	return Math.floor(points);
         }
         else{
         	Double points = event.getConstA()*Math.pow((result-event.getConstB()),event.getConstC());
         	return Math.floor(points);
         }
		
	}
	
}