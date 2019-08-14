package capgemini.oops;

public class Equal_Test {
	public static void main(String[] args) {

		String name = "Capgemini";
		String company = new String("Capgemini");
		if (name == company) {
			System.out.println("you are an employee...");
		} else {
			System.out.println("you are not an employee...");
		}
		if (name.equals(company)) {
			System.out.println("capgemini->you are an employee...");
		} else {
			System.out.println("capgemin->you are an employee...");
		}

	}

}
