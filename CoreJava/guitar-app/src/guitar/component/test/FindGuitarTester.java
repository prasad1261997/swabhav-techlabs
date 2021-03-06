package guitar.component.test;

import java.util.Iterator;
import java.util.LinkedList;

import guitar.component.Builder;
import guitar.component.Guitar;
import guitar.component.Inventory;
import guitar.component.Type;
import guitar.component.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		int count = 0;
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);

		LinkedList<Guitar> matchingGuitar = inventory.search(whatErinLikes);

		if (!matchingGuitar.isEmpty()) {
			System.out.println("Erin you might like this");
			for (Iterator<Guitar> i = matchingGuitar.iterator(); i.hasNext();) {
				count++;
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("We have Guitar " + count + "\n"
						+ spec.getBuilder() + " " + spec.getModel() + " "
						+ spec.getType() + " guitar:\n    "
						+ spec.getBackWood() + " Wood back and sides, \n    "
						+ spec.getTopWood() + " Wood on top.\n    With  "
						+ spec.getNumStrings() + " Number of Strings in Guitar"
						+ "\nYou can have it for only ($" + guitar.getPrice()
						+ ")!\n------\n");
			}
		}

		else
			System.out.println("Sorry, Erin, we have nothing for you");

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor",
				Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V12221532", 7559.99, Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 12, Wood.CEDAR,
				Wood.INDIAN_ROSEWOOD);
		inventory.addGuitar("V1234545", 2559.99, Builder.GIBSON,
				"Stratocastor", Type.ELECTRIC, 12, Wood.CEDAR, Wood.ALDER);
		inventory.addGuitar("V12345425", 2559.99, Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 12, Wood.MAHAGANY, Wood.ALDER);
		inventory.addGuitar("V1234545", 2559.99, Builder.OLSON, "Stratocastor",
				Type.ELECTRIC, 12, Wood.CEDAR, Wood.ALDER);
		inventory.addGuitar("V12345651", 2559.99, Builder.RYAN, "Stratocastor",
				Type.ELECTRIC, 12, Wood.CEDAR, Wood.ALDER);
		inventory.addGuitar("V951245", 1559.99, Builder.FENDER, "Stratocastor",
				Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V12345", 2559.99, Builder.FENDER, "Stratocastor",
				Type.ELECTRIC, 12, Wood.CEDAR, Wood.ALDER);

	}

}
