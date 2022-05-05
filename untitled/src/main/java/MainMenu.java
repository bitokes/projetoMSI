import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenu extends JFrame{
    private JButton consultarProdutoEStockButton;
    private JButton editarProdutoButton;
    private JButton removerProdutoButton;
    private JButton entradaStockButton;
    private JButton saidaStockButton;
    private JButton quebraStockButton;
    private JButton sairButton;
    private JTextField textField1;
    private JPanel jp1;
    private JPanel jpTextIn;
    private JPanel jpTopImg;
    private JPanel jpImg;
    private JPanel jpBtn;
    private JList list1;
    private JButton btnAdicionarProduto;

    public MainMenu(String title) {
        super(title);

        setContentPane(jp1);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        saidaStockButton.addActionListener(this::btnSaidaStockPerformed);

        entradaStockButton.addActionListener(this::btnEntradaStockPerformed);

        sairButton.addActionListener(this::btnSairPerformed);

        btnAdicionarProduto.addActionListener(this::btnAdiconarProdutoPerformed);

        pack();
    }

    private void btnSaidaStockPerformed(ActionEvent e) {new SaidaStock();}

    private void btnEntradaStockPerformed(ActionEvent e) {
        new EntradaStock();
    }

    private void btnSairPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void btnAdiconarProdutoPerformed(ActionEvent e) {
        new AdicionarProduto();
    }

    public static void main(String[] args) {
        new MainMenu("Home").setVisible(true);
    }
}
