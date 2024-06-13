package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ButtonActionHandler implements ActionListener {
    private JLabel operacion;
    
    
    public ButtonActionHandler(JLabel operacion, JLabel resultado) {
        this.operacion = operacion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	
    	
        /**
         *  Obtiene el texto actual del JLabel "operacion"
         */
        String currentText = operacion.getText();
        /**
         *  Si el texto tiene al menos un carácter, elimina el último carácter
         */
        if (currentText.length() > 0) {
            operacion.setText(currentText.substring(0, currentText.length() - 1));
        }
    }
}
