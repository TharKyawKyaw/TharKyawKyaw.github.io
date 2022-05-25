package day4;

import java.util.Scanner;

public class ArrayAssignment {


	public static void main(String[] args) {
		String[] brand = {"lenovo", "hp", "samsung", "acer", "dell", "asus"};
		String[] core = {"i3", "i5", "i7", "i9"};
		String[] core1 = {"corei3", "corei5", "corei7", "corei9"};
		float[][] amount = {
				{(float) 230.21, (float) 400.21, (float) 294.2, (float) 693.33, (float) 340.44, (float) 691.99},
				{(float) 529.483, (float) 920.483, (float) 676.66, (float) 1594.659, (float)783.012, (float)1591.577},
				{(float) 552.504, (float) 960.504, (float) 706.08, (float) 1663.992, (float)817.056, (float)1660.776},
				{(float) 690.63, (float) 1200.63, (float) 882.6, (float) 2079.99, (float) 1021.32, (float) 2075.97}
		};


		for(int i = 0; i < brand.length;i++) {
			System.out.print("\t\t"+brand[i] + "\t");
		}
	
		for(int j = 0; j < amount.length; j++) {
			System.out.print("\n"+core1[j]+"\t");
			for(int k = 0; k < amount[0].length; k++) {
				System.out.print("\t"+amount[j][k]+"\t\t");
			}
		}
	
		String tryAgain = "Y";
		Scanner sc = new Scanner(System.in);

		boolean isBrand = false;
		boolean isCore = false;

		while(tryAgain.equalsIgnoreCase("y")) {
			
			System.out.println("\nYou can choose 'lenovo' 'hp' 'samsung' 'acer' 'dell' 'asus'");
			System.out.print("Choose you want to buy: ");
			String brandName = sc.nextLine();
			
			for(int b = 0; b < brand.length; b++) {
				if(brandName.equalsIgnoreCase(brand[b])) {
					isBrand = true;
					System.out.println("You can choose 'i3' 'i5' 'i7' 'i9'");
					System.out.print("Enter computer cores: ");
					String coreName = sc.nextLine();
					for(int c = 0 ; c < core.length; c++) {
						if(coreName.equalsIgnoreCase(core[c]) || coreName.equalsIgnoreCase(core1[c])) {
							isCore = true;
							System.out.println("Brand\t" + "Core\t" + "price\t" );
							System.out.println(brand[b] + "\t" + core[c] + "\t" + amount[c][b]+"$");
							System.out.print("To change MMK: ");
							float mmk = Float.parseFloat(sc.nextLine());
							System.out.println("Brand\t" + "Core\t" + "price\t" + "\tpriceMMK" );
							System.out.println(brand[b] + "\t" + core[c] + "\t" + amount[c][b]+"$" + "\t" + amount[c][b] * mmk +"ks");
							break;
						}
					}
					if(!isCore) {
						System.out.println(coreName + " does not exist!");
					}
				}
			}
			if(!isBrand) {
				System.out.println(brandName + " does not exist!");
			}

			System.out.print("Do you want to continue press 'y': ");
			tryAgain = sc.nextLine();
			isBrand = false;
			isCore = false;
		
		}
		sc.close();
	};
	
}