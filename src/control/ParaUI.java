package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.UI;

public class ParaUI extends UI {
	private Control control;

	public ParaUI() {
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean alquiler = true;
				if (txtAlquiler.getText().charAt(0) == 'n' || txtAlquiler.getText().charAt(0) == 's') {
					lblMensaje.setText("");
					alquiler = txtAlquiler.getText().charAt(0) != 'n';
					if(control.darAltaCoche(txtMatricula.getText(),txtDatos.getText(),txtCantidad.getText(),alquiler)) {
						lblMensaje.setText("coche dado de alta");
					}else {
						lblMensaje.setText("error al dar de alta");
					}
				} else {
					lblMensaje.setText("valor no valido en alquler");
				}
			}
		});
	}
}
