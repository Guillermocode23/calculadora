package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ButtonActionHandler implements ActionListener {
    private JLabel operacion;
    private JLabel resultado;

    public ButtonActionHandler(JLabel operacion, JLabel resultado) {
        this.operacion = operacion;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String currentText = operacion.getText();
        if (currentText.length() > 0) {
            operacion.setText(currentText.substring(0, currentText.length() - 1));
        }
    }
}
