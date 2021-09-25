
public class MovieRental {

	public static void main(String[] args) {
		Movie movie1 = new Movie("The Marksman", Movie.NEW_RELEASE);
		
		Rental rental1 = new Rental(movie1, 4);
		
		Customer cust1 = new Customer("James Smith");
	    cust1.addRental(rental1);
	    
	    System.out.println(cust1.statement());

	}

}
