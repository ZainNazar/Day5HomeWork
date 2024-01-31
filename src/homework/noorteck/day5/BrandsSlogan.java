package homework.noorteck.day5;

public class BrandsSlogan {

	public static void main(String[] args) {

		String brand = "Nike";
		String slogan = "";
		boolean isSloganFound = false;

		if (brand == "Nike") {

			slogan = "Just Do It";
			isSloganFound = true;
		}

		else if (brand == "Adidas") {
			slogan = "Impossuble is Nothing";
			isSloganFound = true;

		} else if (brand == "Puma") {
			slogan = "Forever Faster";
			isSloganFound = true;

		} else if (brand == "Reebok") {
			slogan = "I am what I am ";
			isSloganFound = true;

		} else {
			slogan = "Not Found";
			isSloganFound = false;
		}

		if (isSloganFound == true) {
			System.out.println(brand + "'s slogan is " + slogan);

		} else {
			System.out.println(brand + "'s slogan " + slogan + ".This message supposes to give me hard time....");
		}
	}

}
