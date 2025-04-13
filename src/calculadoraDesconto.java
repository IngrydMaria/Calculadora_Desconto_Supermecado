import javax.swing.*;
import java.text.DecimalFormat;

public class calculadoraDesconto {
    public static void main (String [] args){
        double produto1;
        double  produto2;
        double  produto3;
        double  produto4;
        double  produto5;
        double  produto6;
        DecimalFormat casas = new DecimalFormat("0.00");

        String lerproduto1 = JOptionPane.showInputDialog("Informe o preço do primeiro produto: ");
        produto1 = Double.parseDouble(lerproduto1);
        double desconto1 = produto1 + (produto1 * 0.03);
        JOptionPane.showMessageDialog(null, "O preço do PRIMEIRO produto é: R$ "+ casas.format(produto1)+ ". Após o desconto de 3%, o preço a ser pago será: R$ "+ casas.format(desconto1));

        String lerproduto2 = JOptionPane.showInputDialog("Informe o preço do segundo produto: ");
        produto2 = Double.parseDouble(lerproduto2);
        double desconto2 = produto2 + (produto2 * 0.035);
        JOptionPane.showMessageDialog(null, "O preço do SEGUNDO produto é: R$ "+casas.format(produto2) + ". Após o desconto de 3,5%, o preço a ser pago será: R$ "+ casas.format(desconto2));

        String lerproduto3 = JOptionPane.showInputDialog("Informe o preço do terceiro produto: ");
        produto3 = Double.parseDouble(lerproduto3);
        double desconto3 = produto3+(produto3 * 0.042);
        JOptionPane.showMessageDialog(null, "O preço do TERCEIRO produto é: R$ "+ casas.format(produto3)+ ". Após o desconto de 4,2% o preço a ser pago será: R$ "+casas.format(desconto3));

        String lerproduto4 = JOptionPane.showInputDialog("Informe o preço do quarto produto: ");
        produto4 = Double.parseDouble(lerproduto4);
        double desconto4 = produto4 + (produto4 * 0.0475);
        JOptionPane.showMessageDialog(null, "O preço do QUARTO produto é: R$ "+casas.format(produto4)+ ". Após o desconto de 4,75% o preço a ser pago será: R$ "+casas.format(desconto4));

        String lerproduto5 = JOptionPane.showInputDialog("Informe o preço do quinto produto: ");
        produto5 = Double.parseDouble(lerproduto5);
        double desconto5 = produto5 + (produto5 * 0.0512);
        JOptionPane.showMessageDialog(null, "O preço do QUARTO produto é: R$ "+casas.format(produto5)+ ". Após o desconto de 5,12% o preço a ser pago será: R$ "+casas.format(desconto5));

        String lerproduto6 = JOptionPane.showInputDialog("Informe o preço do sexto produto: ");
        produto6 = Double.parseDouble(lerproduto6);
        double desconto6 =produto6 + (produto6*0.0523);
        JOptionPane.showMessageDialog(null, "O preço do QUARTO produto é: R$"+casas.format(produto6)+ ". Após o desconto de 5,12% o preço a ser pago será: R$ "+casas.format(desconto6));



    }
}
