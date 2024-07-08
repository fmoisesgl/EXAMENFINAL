package Caracterizable1;

public class AlquilerAirBnB extends Alquiler {
	
	private int tarifaDiaria;

    public AlquilerAirBnB(int CodCliente, String NomCliente, int DiasAlquiler, int tarifaDiaria) {
        super(CodCliente,NomCliente, DiasAlquiler);
        this.tarifaDiaria = tarifaDiaria;
    }



	public int getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(int tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

   
    public  double costoAlquiler() {
        return getDiasAlquiler() * tarifaDiaria;
    }


    public String caracterizar() {
        return super.caracterizar() + " "+ tarifaDiaria;
    }


	public int DiasAlquiler() {
		return 0;
	}
}
