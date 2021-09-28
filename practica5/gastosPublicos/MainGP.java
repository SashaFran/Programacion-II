package gastosPublicos;

public class MainGP {

	public static void main(String[] args) {
		
		Pais pp = new Pais("Argentina");
		Provincia pp1 = new Provincia("Buenos Aires", "Argentina");
		Ciudad pp2 = new Ciudad("Buenos Aires", "Argentina", "Tandil");
		
		pp.addCiudades(pp2);
		pp.addProvincias(pp1);
		
		Contribuyente cc = new ContribuyenteSimple("Juan",1111,"Argentina","Buenos Aires", "Tandil");
		Contribuyente c1 = new ContribuyenteComerciante("Pepito", 1112, "Buenos Aires", "Argentina", "Tandil", 12, 1222);
		Contribuyente c2 = new ContribuyenteProgramador("JuanPe", 1113, "Buenos Aires", "Argentina", "Tandil");
		
		pp2.addContribuyente(cc);
		pp2.addContribuyente(c1);
		pp2.addContribuyente(c2);
		
		pp2.getTotalRecaudado();
		
	}

}
