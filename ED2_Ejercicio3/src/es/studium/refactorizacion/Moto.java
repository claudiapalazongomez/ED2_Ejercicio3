package es.studium.refactorizacion;

public class Moto extends Vehiculo
{
	//Quitamos todo lo de matricula y numeroRuedas
	private String cilindrada;

	public Moto()
	{
		super();
		this.cilindrada = "";
	}

	public Moto(String matricula, int numeroRuedas, String cilindrada)
	{
		super(matricula, numeroRuedas);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada()
	{
		return cilindrada;
	}

	public void setCilindrada(String cilindrada)
	{
		this.cilindrada = cilindrada;
	}

}
