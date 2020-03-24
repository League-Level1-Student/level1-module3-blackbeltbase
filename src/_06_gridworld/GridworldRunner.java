package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
public static void main(String[] args) {
	World world = new World();
//	 1. Figure out how to get a World to show.
// 
	world.show();
//     2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
//
	Bug bug = new Bug();
	Location bugLocation = new Location(5,5);
	world.add(bugLocation, bug);
//     3. Add another bug at a random location in the world.
//
	Random randomNum1 = new Random();
	Random randomNum2 = new Random();
	int random1 = randomNum1.nextInt(5+1);
	int random2 =  randomNum2.nextInt(5+1);
	
	Bug bug2 = new Bug();
	Location bug2Location = new Location(random1,random2);
	world.add(bug2Location, bug2);
	bug2.setColor(Color.blue);
	bug2.turn();
	bug2.turn();
	Location flower1Location = new Location(random1,random2-1);
	Flower flower1 = new Flower();
	world.add(flower1Location, flower1);
	Location flower2Location = new Location(random1,random2+1);
	Flower flower2 = new Flower();
	world.add(flower2Location, flower2);
	for(int i = 0; i<=9;i++) {
		for(int x = 0; x<=9;x++) {
			Location flowerxLocationi = new Location(i,x);
			Flower flowerx = new Flower();
			world.add(flowerxLocationi, flowerx);
		}
	}
//     4. Change the color of that bug to blue.
//
//    5. Make the bug face to the right.
//
//    6. Add flowers to the left and right of the bug.
//
//    7. Fill the whole world with flowers!
}
}
