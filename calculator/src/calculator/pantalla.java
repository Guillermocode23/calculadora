package calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class pantalla implements ActionListener {
    private JLabel operacion;
  

    public pantalla(JLabel operacion, JLabel resultado) {
        this.operacion = operacion;
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtiene el texto actual del JLabel "operacion"
        String ct = operacion.getText();

        // Si el texto tiene al menos un carácter, elimina el último carácter
        if (ct.length() > 0) {
            operacion.setText(ct.substring(0, ct.length() - 1));
        }

       
    }
}
