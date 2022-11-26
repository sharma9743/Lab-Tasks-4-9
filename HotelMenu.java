Main class HotelMenu {

	public static void main(String[] args){
		scanner scan = new scanner(System.in);

		System.out.println("Welcome to the Darbar's Menu");
		System.out.println();

		while(true){
			System.out.println("To order Chicken Karahi, Enter 1");
			System.out.println("To order Mutton Karahi, Enter 2");
			System.out.println("To order Chicken Shawarma, Enter 3");
			System.out.println("To Exit, Enter 9");

			System.out.println();
			System.out.println("ENTER YOUR ORDER::");
			int  order = scan.nextInt();

			switch(Choice){
			case 1: System.out.println("Price of Chicken Karahi is RS:850");
			Chickenkarahi();
			break;
			case 2: System.out.println("Price of Mutton karahi is RS:950");
			MuttonKarahi();
			break;
			case 3: System.out.println("Price of Chicken shawarma is RS:200");
			Chickenshawarama();
			break;
			case 9: System.out.println("Thanks for ordering. Visit again");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}
	}
}	