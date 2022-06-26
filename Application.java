public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int seatsLeft = 69;
			double groceryCost = 23.64;
			char middleInitial = 'B';
			boolean isHotOutside = true;
			String firstName = "Jimmy";
			String address = "1337 Elite Street";
			System.out.println("Seats left on the plane: " + seatsLeft);
			System.out.println("Cost of groceries: " + groceryCost);
			System.out.println("Middle initial: " + middleInitial);
			System.out.println("Is it hot outside? True or false: " + isHotOutside);
			System.out.println("First name: " + firstName);
			System.out.println("Address: " + address);
			
			seatsLeft -= 2;
			System.out.println("Two plane seats were purchased. Remaining seats are: " + seatsLeft);
			groceryCost += 2.15;
			System.out.println("Your impulse candy purchase has brought the grocery cost total to " + groceryCost);
			middleInitial = 'D';
			System.out.println("Error detected in database. Your middle name is actually 'Deeznutz', so your middle initial is " + middleInitial);
			System.out.println("Wow, Arkansas weather, am I right? " + !isHotOutside);
			String fullName = firstName + " " + middleInitial + " " + "Jimmothy";
			
			System.out.println("The customer is " + fullName + " and they live at " + address + ".");
	}

}
