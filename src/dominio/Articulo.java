package dominio;

public class Articulo extends Merito {
 protected double impacto;
	 public Articulo(String titulo, double impacto) {
    super(titulo);
    this.impacto = impacto;   
    }
	public double valorar() {
        return impacto; 
    }
	public double getImpacto() {
        return impacto;
    }
	public void setImpacto(double impacto) {
        this.impacto = impacto;
    }

}
