import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaidaStock extends JFrame {
    private JPanel jp1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton registarButton;
    private JButton cancelarButton;

    public SaidaStock (){
        setContentPane(jp1);

        cancelarButton.addActionListener(this::btnCancelarPerformed);

        pack();
        setVisible(true);
    }

    private void btnCancelarPerformed(ActionEvent e) {System.exit(0);}


}
