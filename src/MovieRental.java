
public class MovieRental {

	public static void main(String[] args) {
		Movie movie1 = new Movie("The Marksman", Movie.NEW_RELEASE);
		Movie movie2 = new Movie("Star Trek Beyond", Movie.REGULAR);
		Movie movie3 = new Movie("Trolls", Movie.CHILDRENS);

		Rental rental1 = new Rental(movie1, 4);
		Rental rental2 = new Rental(movie2, 2);
		Rental rental3 = new Rental(movie3, 7);

		Customer cust1 = new Customer("James Smith");
		cust1.addRental(rental1);
		cust1.addRental(rental3);

		Customer cust2 = new Customer("Maria Davis");
		cust2.addRental(rental1);
		cust2.addRental(rental2);

		Customer cust3 = new Customer("Patricia Brown");
		cust3.addRental(rental2);
		cust3.addRental(rental3);

		System.out.println(cust1.statement());
		System.out.println("===============================\n");
		System.out.println(cust2.statement());
		System.out.println("===============================\n");
		System.out.println(cust3.statement());

	}

}
