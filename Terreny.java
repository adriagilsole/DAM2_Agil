
public class Terreny {

	
	private String referencia;
	private double llargada;
	private double altura;
	private String categoria = "rustic";
	private double taxaR = 50;
	private double taxaU = 100;
	private String[] propietaris=new String[] {"Consistori"};
	private String poblacio;
	
	
	
	public Terreny (double llargada,double altura,String poblacio) {
		this.setLlargada(llargada);
		this.setAltura(altura);
		this.setPoblacio(poblacio);
		
	}
	public Terreny (double llargada,double altura,String poblacio,String categoria) {
		this.setLlargada(llargada);
		this.setAltura(altura);
		this.setPoblacio(poblacio);
		this.setCategoria(categoria);
	}
	
	public Terreny (double llargada,double altura,String categoria,double taxaR,double taxaU,String[] propietaris,String poblacio) {
		this.setLlargada(llargada);
		this.setAltura(altura);
		this.setCategoria(categoria);
		this.setTaxaR(taxaR);
		this.setTaxaU(taxaU);
		this.setPropietaris(propietaris);
		this.setPoblacio(poblacio);
	}
	
	////////////////////////////////////////////////
	public String getReferencia() {
		String referencia=RefUnica.fetRef(this.poblacio);
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public double getLlargada() {
		return llargada;
	}
	public void setLlargada(double llargada) {
		this.llargada = llargada;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getTaxaR() {
		return taxaR;
	}
	public void setTaxaR(double taxaR) {
		this.taxaR = taxaR;
	}
	public double getTaxaU() {
		return taxaU;
	}
	public void setTaxaU(double taxaU) {
		this.taxaU = taxaU;
	}
	public String[] getPropietaris() {
		return propietaris;
	}
	public void setPropietaris(String[] propietaris) {
		this.propietaris = propietaris;
	}
	public String getPoblacio() {
		return poblacio;
	}
	public void setPoblacio(String poblacio) {
		this.poblacio = poblacio;
	}
	
	
	//////////////////////////////////////////////////
	
	
	public void mostrarTerreny() {
		String referencia = getReferencia();
		System.out.println("Referencia = " + referencia);
		Double llargada= getLlargada();
		System.out.println("Llargada = " + llargada);
		Double altura = getAltura();
		System.out.println("Altura = " + altura);
		String categoria = getCategoria();
		System.out.println("Categoria = " + categoria);
		double taxaR = getTaxaR();
		System.out.println("TaxaR = " + taxaR);
		double taxaU = getTaxaU();
		System.out.println("TaxaU = " + taxaU);
		
		System.out.println("Propietaris = " + mostraPropietaris());
    }
	
	
	public double obtenirSup() {
		
		double metresquadrats = getAltura() * getLlargada();
		double superficie=metresquadrats/10000;
		return superficie;
	}
	
	public double impostBase() {
			
		double metresquadrats= obtenirSup()*10000;
		
		double impostbase=metresquadrats*taxaR;
		double impostbase2=metresquadrats*taxaU;
		
		double operacio;
		double euros=0;
		
		if(categoria=="urba") {
			euros=impostbase2;
			if(metresquadrats>5) {
				operacio= taxaU+(taxaU*15)/100;
				euros=metresquadrats*operacio;
				return euros;
			}
			
		}else if(categoria=="rustic") {
			euros=impostbase;
			
			if(metresquadrats>25) {
				operacio= taxaR+(taxaR*5)/100;
				euros=metresquadrats*operacio;
				return euros;
			}
		}else System.out.println("Categoria no definida");
		return euros;
		
	}
	
	
	public String mostraPropietaris() {
		
		int i=0;
		String props = "";
		
		while (i<propietaris.length) {
			props+=propietaris[i] + " ";
			i++;
		}

		return props;
		
	}
	
	public String compara(Terreny t) {
		
		String compara="";
		
		if(t.categoria!=this.categoria) {
			compara="correcte";
			System.out.println("Els terrenys son de diferent categoria");
		}else {
			System.out.println("Els terrenys son de mateixa categoria");
		
			
		if(t.obtenirSup()>this.obtenirSup()) {
			System.out.println("El terreny 2 es més gran");
		}else if(t.obtenirSup()==this.obtenirSup()){
			System.out.println("Els terrenys son de igual mida");
		}else
			System.out.println("Els terreny 1 es més gran");
			}
		
		if(t.impostBase()>this.impostBase()) {
			System.out.println("El terreny 2 paga més impostos = " + t.impostBase() + "€");
		}else if(t.impostBase()==this.impostBase()){
			System.out.println("Els terrenys pagen els mateixos impostos = " + t.impostBase()+ "€");
		}else
			System.out.println("El terreny 1 paga més impostos = " + this.impostBase()+ "€");
		
		
			
		
		return compara;
		
	}
	
	
	////////////////777
	
//	public void afegirTerreny(Terreny t1) {
//		
//		String referenciaTerreny=t1.getReferencia();
//		Municipi.terrenys[Municipi.terrenyafegit]=referenciaTerreny;
//		Municipi.terrenyafegit++;
//		int j=0;
//		Municipi.nom=t1.getPoblacio();
//		while(Municipi.terrenys[j]!=null) {
//			System.out.println("Terrenys dins del municipi " + Municipi.nom + " = " + Municipi.terrenys[j]);
//			j++;
//		}
//		System.out.println("#############");
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
