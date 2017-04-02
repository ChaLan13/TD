/** Classe Plat **/

package plat;

import categorie.CategoriePlat;

public class Plat {
	private String Nom;
	private double Prix;
	private double Cout;
	private boolean Vege;
	private CategoriePlat Categorie;

	public Plat(String nom, CategoriePlat cat){
		this.setNom(nom);
		this.setCategorie(cat);
		
	}

	public Plat(String nom, CategoriePlat cat, double prix, double cout, boolean vege){
		this.setNom(nom);
		this.setCategorie(cat);
		this.setPrix(prix);
		this.setCout(cout);
		this.setVege(vege);
	}

	private void setNom (String nom){
		if(nom=="")
			System.exit(0);
		this.Nom=nom;

	}

	public void setPrix(double prix){
		if (prix<=0)
			System.exit(0);
		this.Prix=prix;
	}

	public void setCout(double cout){
		if(cout <= 0)
			System.exit(0);
		this.Cout=cout;
	}

	private void setCategorie(CategoriePlat cat){
		if (cat==null)
			System.exit(0);
		this.Categorie=cat;
		Categorie.addPlat(this);
	}

	public void setVege(boolean vege){
		this.Vege=vege;
	}

	public String getNom(){
		return this.Nom;
	}

	public double getPrix(){
		return this.Prix;
	}

	public double getCout(){
		return this.Cout;
	}

	public CategoriePlat getCat(){
		return this.Categorie;
	}

	public boolean getVege(){
		return this.Vege;

	}

	public String toString(){
		return (" Plat :" +this.getNom() + "\n Catégorie : " +this.Categorie.getNomCat()+ "\n Prix : " +this.getPrix() + 
			"\n Cout : " +this.getCout() +"\n");
	}

	public String estVege (){
		if (this.Vege == true)
			return ("Ce plat : " +this.getNom() + ", est vegetarien \n");
		else 
			return ("Ce plat : " +this.getNom() + ", n'est pas vegetarien");
	}
	
}