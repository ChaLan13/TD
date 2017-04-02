/** Main **/

package main;

import categorie.CategoriePlat;
import plat.Plat;
import menu.Menu;

public class Main {
	public static void main (String arg[]){

		CategoriePlat Salade, Viandes, Desserts, Poissons;
		Menu Menu1;

		Salade = new CategoriePlat("Salade");
		Viandes = new CategoriePlat("Viandes");
		Desserts = new CategoriePlat("Desserts");
		Poissons = new CategoriePlat("Poissons");

		Plat Vosgienne, Rossini, IleFlottante;

		Vosgienne = new Plat("Vosgienne", Salade, 5.50, 2.25, false);
		Rossini = new Plat("Tournedos Rossini", Viandes, 17.40, 11.0, false);
		IleFlottante = new Plat("Iles Flottantes", Desserts);
		IleFlottante.setPrix(6.0);

		Menu1 = new Menu("Miam miam", 25, Vosgienne, Rossini, IleFlottante);

		System.out.println(Vosgienne.toString());
		System.out.println(Rossini.toString());
		System.out.println(IleFlottante.toString());

		System.out.println(Vosgienne.estVege());
		System.out.println(Rossini.estVege());
		System.out.println(IleFlottante.estVege());

		System.out.println(Menu1.toString());
		
	}
}