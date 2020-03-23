public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed, int placeInRace){
        this.name = name;
        this.speed = speed;
        this.bibNumber = placeInRace-nextBibNumber;
    }

    int getBibNumber() {
    	return bibNumber;
    }
    String getName() {
    	return name;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete bob = new Athlete("Bob", 6,2);

    	System.out.println(bob.getBibNumber());
    	Athlete joe = new Athlete("Joe", 5,1);
    	System.out.println(joe.getBibNumber());
    	System.out.println(raceLocation);
    }
}