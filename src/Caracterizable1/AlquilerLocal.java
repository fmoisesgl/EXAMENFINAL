package Caracterizable1;

public class AlquilerLocal extends Alquiler {
	
	private int MesAlquiler;
    private int metraje;

    public AlquilerLocal(int CodCliente, String  NomCliente, int DiasAlquiler, int MesAlquiler, int metraje) {
    	super(CodCliente, NomCliente, DiasAlquiler);
        this.MesAlquiler = MesAlquiler;
        this.metraje = metraje;
        
    }

    public int getMesAlquiler() {
        return MesAlquiler;
    }

    public void setMesAlquiler(int MesAlquiler) {
        this.MesAlquiler = MesAlquiler;
    }

    public int getMetraje() {
        return metraje;
    }

    public void setMetraje(int metraje) {
        this.metraje = metraje;
    }

    public double costoAlquiler() {
        int costoMensual = 0;
        switch (metraje) {
            case 100:
                costoMensual = 5000;
                break;
            case 150:
                costoMensual = 8000;
                break;
            case 200:
                costoMensual = 12000;
                break;
        }
        return MesAlquiler * costoMensual;
    }

    public String caracterizar() {
        return caracterizar() + "-" + MesAlquiler + "-" + metraje;
    }

}
