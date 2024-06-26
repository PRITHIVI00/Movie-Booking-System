package MovieBookingSystem;

import java.util.Scanner;

public class MovieBookingSystem {
	 public static void main(String[] args) {	      
	        AdminAccess admin = new AdminAccess();
	        UserAccess user = new UserAccess();
	        Scanner input = new Scanner(System.in);
	        while (true) {
	            System.out.println("Enter 1 for Admin \nEnter 2 for User \nEnter 3 to Exit");
	            int choice = input.nextInt();
	            input.nextLine(); // for newline because of int 

	            switch (choice) {
	                case 1:
	                    System.out.println("Welcome Admin: \n1. Add Movies \n2. View Movies ");
	                    int adminChoice = input.nextInt();
	                    input.nextLine(); // already you know
	                    
	                    if(adminChoice==1) {
	                    	System.out.println("Enter Movie Name : ");
	                    	String name = input.nextLine();
	                    	System.out.println("Enter Movie Time : ");
	                    	String time = input.nextLine();
	                    	System.out.println("Enter theater Name : ");
	                    	String theaterName = input.nextLine();
	                    	System.out.println("Enter Movie Ticket Limit : ");
	                    	int ticketLimit = input.nextInt();
							admin.updateMovie(name,time,ticketLimit,theaterName);
							System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n ");
	                    	System.out.println("Movie Successfully Added \n");
	                    	System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n ");
	                    }else if(adminChoice == 2) {
	                    	for(Movie movie:admin.getMovies()) {
	                    		System.out.println(movie);
	                    	}
	                    }
	                    break;
	                case 2:
	                	System.out.println("Welcome : \n1. Book Ticket \n2. view Movies ");
	                    int userChoice = input.nextInt();
	                    input.nextLine();
	                    
	                    if(userChoice == 1) {
	                    	System.out.println("Enter Movie Name :");
	                    	String movieName = input.nextLine();
	                    	System.out.println("Enter Movie Timing : ");
	                    	String time = input.nextLine();
	                    	System.out.println("Enter theater Name : ");
	                    	String theaterName = input.nextLine();
	                    	System.out.println("Enter Number of Tickets :");
	                    	int numberOfTickets = input.nextInt();
	                    	user.ticketBooking(admin,movieName,time,theaterName,numberOfTickets);
	                    }else if( userChoice == 2) {
	                    	System.out.println("Movies:");
	                    	for(Movie movie : admin.getMovies()) {
	                    		System.out.println(movie);
	                    	}
	                    }
	                    break;
	                case 3:
	                    System.out.println("Bye Bye......!");
	                    input.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	    
}
