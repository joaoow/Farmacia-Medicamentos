package farmaciaprojeto;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Medicamento {

    public int codigo;
    private String nome;
    private String laboratorio;
    private int quantidade;
    private double preco;

    public Medicamento() {
    }

    public Medicamento(int codigo, String nome, String laboratorio, int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Método avulso
    public void exibirMedicamento() {
        DecimalFormat df = new DecimalFormat("#.00");
        String text = "";
        text = text + "\nCodigo: " + codigo;
        text = text + "\nNome: " + nome;
        text = text + "\nLaboratorio: " + laboratorio;
        text = text + "\nQuantidade: " + quantidade;
        text = text + "\nPreço: R$" + df.format(preco);
        JOptionPane.showMessageDialog(null, text);

    }
}
