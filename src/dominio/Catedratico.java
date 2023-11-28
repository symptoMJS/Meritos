package dominio;

public class Catedratico extends Profesor{

	public Catedratico(String nombre)
	{
		super(nombre);
	}

	public double calcularValoracion()
	{
		float suma = 0;
		for(Merito m : merito)
		{
			suma += Math.pow(m.valorar(),2);
		}
		return Math.pow(suma/4,0.5)
	}

}
