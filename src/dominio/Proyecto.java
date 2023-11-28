package dominio;

public class Proyecto extends Merito {

	protected double financiacion;
	
	public Proyecto(String titulo, float financiacion)
	{
		super(titulo);
		this.financiacion = financiacion;
	}

	public double valorar()
	{
		return financiacion/1000000;
	}
}
