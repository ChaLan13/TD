/** Classe Menu **/

package menu;

import categorie.CategoriePlat;
import plat.Plat;

public class Menu {
	private String Nom; 
	private double Prix;
	private Plat TMenu[]= new Plat[3];

	public Menu (String name, double price, Plat entree, Plat princ, Plat dessert){
		setNom(name);
		setPrix(price);
		TMenu[0].setEntree(entree); 
		TMenu[1].setPrincipal(princ);
		TMenu[2].setDessert(dessert);

	}

	public void setNom (String nom){
		if (nom=="")
			System.exit(1);
		this.Nom = nom;
	}

	public void setPrix(double price){
		if (price <= 0)
			System.exit(1);
		this.Prix = price;
	}

	public void setEntree(Plat entree){
		if (entree==null)
			System.exit(1);
		this.TMenu[0]=entree;
	}

	public void setPrincipal(Plat princ){
		if (princ==null)
			System.exit(1);
		this.TMenu[1]=princ;
	}

	public void setDessert(Plat dessert){
		if (dessert==null)
			System.exit(1);
		this.TMenu[2]=dessert;
	}

	public String getNom(){
		return this.Nom;
	}

	public double getPrix(){
		return this.Prix;
	}

	public Plat getEntree(){
		return this.TMenu[0];
	}

	public Plat getPrincipal(){
		return this.TMenu[1];
	}

	public Plat getDessert(){
		return this.TMenu[2];
	}
	
	public String toString(){
		return ("Menu : " + this.getNom() + "\nPrix : " +this.getPrix() + "€ \nEntree : " +this.getEntree()
			+ "\nPlat principal : " +this.getPrincipal() + "\nDessert : " +this.getDessert());
	}
	
}