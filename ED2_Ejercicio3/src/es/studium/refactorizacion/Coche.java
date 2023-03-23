package es.studium.refactorizacion;

public class Coche extends Vehiculo
{
	//seleccionamos este y el siguiente, refactor -> extract superclass -> Vehiculo -> Moto y Coche y los getters y setters de cada uno referente a matricula y nº de ruedas
	
	//seleccionamos este y el siguiente, refactor -> extract class -> Conductor, Create getters and setters y conductor
	private Conductor conductor = new Conductor();

	public Coche()
	{
		super();
		matricula = "";
		conductor.setNombreConductor("");
		conductor.setCarnetConductor("");
		setNumeroRuedas(4);
	}

	public Coche(String matricula, String nombreConductor, String carnetConductor, int numeroRuedas)
	{
		super(matricula, numeroRuedas);//añadimos matricula y numeroRuedas, y los this. que se crean solos de matricula y numeroRuedas los quitamos
		this.conductor.setNombreConductor(nombreConductor);
		this.conductor.setCarnetConductor(carnetConductor);
	}

	public String getNombreConductor()
	{
		return conductor.getNombreConductor();
	}

	public void setNombreConductor(String nombreConductor)
	{
		this.conductor.setNombreConductor(nombreConductor);
	}

	public String getCarnetConductor()
	{
		return conductor.getCarnetConductor();
	}

	public void setCarnetConductor(String carnetConductor)
	{
		this.conductor.setCarnetConductor(carnetConductor);
	}

	public String getDetalles()
	{
		return "Coche [matricula=" + matricula + ", nombreConductor=" + conductor.getNombreConductor() + ", carnetConductor="
				+ conductor.getCarnetConductor() + "]";
	}
}
