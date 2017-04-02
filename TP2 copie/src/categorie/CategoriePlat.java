/** Classe Catégorie Plat **/
package categorie;

import plat.Plat;

public class CategoriePlat {
	private String Nom;
	private Plat Tplat[];
	private int nb = 0;
	private static final int TAILLE = 200;
	
	public CategoriePlat (String Nom) {
		this.Nom=Nom;
		this.Tplat=new Plat[this.TAILLE];
		this.nb = 0;
	}
	
	public void setNom (String Nom){
		if (Nom == "")
			System.exit(0);
		this.Nom = Nom;
	}
	
	public void addPlat (Plat p) {
		if(p==null)
			System.exit(0);
		this.Tplat[this.nb]=p;
		this.nb++;
	}

	public void removePlat(int index) {
		if((index < 0) || (index >= this.nb))
			System.exit(0);
		this.Tplat[index]=Tplat[this.nb-1];
		this.nb--;
		Tplat[nb]=null;
	}
	
	public Plat getPlat(int index) {
		if((index < 0) || (index >= this.nb))
			System.exit(0);
		return Tplat[index];
	}

	public String getNomCat(){
		return this.Nom;
	}

	

}