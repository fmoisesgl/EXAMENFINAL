package Arreglo;

import java.util.ArrayList;


public class ArregloIngenieros {
	 private ArrayList<Ingeniero> ing;

	  
public double tarifaPromedio() {
	  double sumaTarifas = 0;
      int cont = 0;

      for (Ingeniero ingeniero : ing) {
          if (ingeniero.getEdad() > 40) {
              sumaTarifas += ingeniero.getTarifa();
              cont++;
          }
      }
      
      if (cont > 0) {
          return sumaTarifas / cont;
      } else {
          return 0;
      }
  }

  public String nombrePrimerIngenieroMenorQue100() {
      for (Ingeniero ingeniero : ing) {
          if (ingeniero.gethorastrabajo() < 100) {
              return ingeniero.getNombre();
          }
      }
      return null;
  }
}
