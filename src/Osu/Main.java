package Osu;

public class Main {

    public static void main(String[] args) {

    	System.out.println(introductionText());

		/*Person miko = new Person("David", "Miko", 20, new Address("Husova 1099", "Vratimov",73932));

		Person pospisil = new Person("Petr", "Popsisil", 21);

		pospisil.setAddress(new Address("Sladecek 69", "VSB", 420));



		System.out.println(miko);
		System.out.println(pospisil);*/


		// Instantiates the planets with its satellites
		Planet firstPlanet = new Planet("MikovaPlaneta", "Nejlepsi", new Satellite("MikuvMesic",69));
		Planet secondPlanet = new Planet("SpatnaPlaneta", "Nejhorsi", new Satellite("SpatnyMesic",-1));

		// Instantiates a star with planets
		Star myStar = new Star("dobra hvezda", 50, firstPlanet, secondPlanet);

		//System.out.println(firstPlanet.getMoon().getReport());
		//System.out.println(firstPlanet);

		System.out.println(myStar);
    }

    /**
	 * Gets the introduction text of the application.
	 */
    private static String introductionText() {
    	return "===============================\n\n\tALG1 - 08. 10. 2019\n\n===============================\n";
	}
}
