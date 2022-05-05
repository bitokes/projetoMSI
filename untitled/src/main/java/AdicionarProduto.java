import javax.swing.*;
import java.awt.event.ActionEvent;

public class AdicionarProduto extends  JFrame{
    private JPanel jp1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JComboBox comboBox2;
    private JButton registarButton;
    private JButton cancelarButton;

    public AdicionarProduto (){
        setContentPane(jp1);

        cancelarButton.addActionListener(this::btnCancelarPerformed);

        pack();
        setVisible(true);
    }

    private void btnCancelarPerformed(ActionEvent e) {System.exit(0);}
}
