package MovieBookingSystem;

public class Movie  {
	private String name;
    private String time;
    private String theaterName;
    private int ticketLimit;

    public Movie(String name, String time, int ticketLimit, String theaterName) {
        this.name = name;
        this.time = time;
        this.ticketLimit = ticketLimit;
        this.theaterName = theaterName;
    }
    public  String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public int getTicketLimit() {
        return ticketLimit;
    }
    
    public String getTheaterName() {
    	return theaterName;
    }
    
     public void setTicketLimit(int ticketLimit) {
    	 this.ticketLimit = ticketLimit ;
     }

    @Override
	public String toString() {
		return " \n \nMovie : " + name  + " \ntime : " + time +" \nTickets Available : " + ticketLimit + " \nTheater Name : " + theaterName + "\n ";
	}
	
	}
