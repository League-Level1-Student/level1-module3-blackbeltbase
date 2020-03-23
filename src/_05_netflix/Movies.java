package _05_netflix;

public class Movies {
public static void main(String[] args) {
	Movie coders = new Movie("Coders in Disguise", 5);
	Movie coders2 = new Movie("Coders in the City", 4);
	Movie coders3 = new Movie("Coders in my Basement", 3);
	Movie coders4 = new Movie("Coders Code", 5);
	Movie coders5 = new Movie("Coders are Bad", 1);
	System.out.println(coders.getTicketPrice());
	
	NetflixQueue netflixList = new NetflixQueue();
	netflixList.addMovie(coders);
	netflixList.addMovie(coders2);
	netflixList.addMovie(coders3);
	netflixList.addMovie(coders4);
	netflixList.addMovie(coders5);
	netflixList.getBestMovie();
netflixList.printMovies();
	System.out.println("The best movie is "+netflixList.getBestMovie());
	netflixList.sortMoviesByRating();
	System.out.println("The second best movie is "+netflixList.getMovie(2));
}
}
