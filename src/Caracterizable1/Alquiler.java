package Caracterizable1;

public abstract class Alquiler {
	private int CodCliente;
    private String NomCliente;
    private int DiasAlquiler;
	
	public Alquiler(int CodCliente, String NomCliente, int DiasAlquiler) {
		super();
		this.CodCliente = CodCliente;
		this.NomCliente = NomCliente;
		this.DiasAlquiler = DiasAlquiler;
	}
	public int getDiasAlquiler() {
		return DiasAlquiler;
	}
	public void setDiasAlquiler(int DiasAlquiler) {
		this.DiasAlquiler = DiasAlquiler;
	}
	public int getCodCliente() {
		return CodCliente;
	}
	public void setCodCliente(int CodCliente) {
		this.CodCliente = CodCliente;
	}
	public String getNomCliente() {
		return NomCliente;
	}
	public void setNomCliente(String NomCliente) {
		this.NomCliente = NomCliente;
	}
	
	public abstract double costoAlquiler();
    
	public String caracterizar() {
		return CodCliente + "-" + NomCliente + "-" + DiasAlquiler;
    }
	
	

}
