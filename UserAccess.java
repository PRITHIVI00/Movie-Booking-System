package MovieBookingSystem;



public class UserAccess {
	
	public void ticketBooking(AdminAccess admin,String movieName, String time, String theaterName, int numberOfTickets ) {
		
		for( Movie movie : admin.getMovies()) 
		{
			if(movie.getName().equalsIgnoreCase(movieName))
			{
				if(movie.getTheaterName().equalsIgnoreCase(theaterName))
				{
					if(movie.getTicketLimit() >= numberOfTickets)
					{
						movie.setTicketLimit(movie.getTicketLimit()-numberOfTickets);
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n ");
						System.out.println( numberOfTickets + " Ticket for "+ movieName +" at " + theaterName + "as successfully Booked");
						System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}else{
					System.out.println("\n Sorry for the Inconvience tickets are already Booked" + movieName +"\n");
					}
					}else {
						System.out.println("\n Sorry for the Inconvience the " + movieName +" movie is Not available in the "+ theaterName+ " Theater \n");
					}
				return;
			}
System.out.println("\n Currently this movie not available  : " + movieName + "\n");
		}
		
	}

}

