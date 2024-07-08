package Caracterizable1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setBounds(100, 100, 228, 115);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("PROCESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(10, 11, 192, 54);
		getContentPane().add(btnNewButton);

	}
	
	public void Resultado() {
	       
        AlquilerLocal localComercial = new AlquilerLocal(1000, "Jose Perez", 15, 2, 200);
     
       
        MostrarLocal(localComercial);

         
    }

    public void MostrarLocal(AlquilerLocal Alquiler) {
        String mensaje = "Código Cliente: " + Alquiler.getCodCliente() + "\n" +
                         "Nombre Cliente: " + Alquiler.getNomCliente() + "\n" +
                         "Días de Alquiler: " + Alquiler.getDiasAlquiler() + "\n" +
                         "Meses de Alquiler: " + Alquiler.getMesAlquiler() + "\n" +
                         "Metraje: " + Alquiler.getMetraje() + "\n" +
                         "Costo de Alquiler: S/ " + Alquiler.costoAlquiler();

        JOptionPane.showMessageDialog(this, mensaje, "Alquiler Local Comercial", JOptionPane.INFORMATION_MESSAGE);
    }


}
