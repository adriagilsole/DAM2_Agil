
public class Municipi {

	private String nom = "";
	private String comarca = "";
	private int habitants;
	static Terreny[] terrenys=new Terreny[50];
	private double superficie;
	public static int terrenyafegit =0;
	
public Municipi (String nom, String comarca, int habitants) {
	this.nom=nom;
	this.comarca=comarca;
	this.habitants=habitants;
	
}
public Municipi (String nom, String comarca, int habitants, String[] terrenys) {
	
	
	
}

/////////////////////
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getComarca() {
	return comarca;
}
public void setComarca(String comarca) {
	this.comarca = comarca;
}
public int getHabitants() {
	return habitants;
}
public void setHabitants(int habitants) {
	this.habitants = habitants;
}

public double getSuperficie() {
	return superficie;
}
public void setSuperficie(double superficie) {
	this.superficie = superficie;
}
	
//////////////////////

public void afegirTerreny(Terreny t1) {

	Municipi.terrenys[terrenyafegit]=t1;
	terrenyafegit++;

	System.out.println("Terreny inserit dins del municipi" + nom);
	
	System.out.println("#############");
	
	
}

public static Terreny obteTerreny (String ref) {
int i=0;
System.out.println("el ref que entra" + ref);

while(terrenys[i]!=null) {
	String prova= terrenys[i].getReferencia();
	System.out.println(prova);
	
	if(prova==ref) {
		System.out.println("prova");
		terrenys[i].mostrarTerreny();
		break;
		
	}else System.out.println("No sa trobat el terreny");
	
i++;
}
	
	return null;
}











	
}
