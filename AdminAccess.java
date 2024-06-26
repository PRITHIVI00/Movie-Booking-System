package MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class AdminAccess {
	
	private List<Movie> movies = new ArrayList<>();
	
	public void updateMovie( String name, String time, int ticketLimit, String theaterName) {
		
		Movie movie = new Movie(name,time,ticketLimit, theaterName);
		movies.add(movie);
		System.out.println(" \n Movie added Successfully  " + movie + " \n " );
	}
	
	public List<Movie> getMovies(){
		return movies;
		
	}	
	
}

