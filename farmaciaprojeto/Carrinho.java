package farmaciaprojeto;

import javax.swing.JOptionPane;

public class Carrinho {

    public Medicamento[] med = new Medicamento[10];
    int quant = 0;

    public Carrinho() {
    }

    public void inserirMedicamento(Medicamento m) {
        if (quant < 10) { //verificar se o meu carrinho é menor que 10.
            med[quant] = m; //se não tiver lotado...
            quant++;//ele insere o meu medicamento no carrinho.
            JOptionPane.showMessageDialog(null, "Medicamento inserido");
        } else {
            JOptionPane.showMessageDialog(null, "Carrinho cheio");
        }
    }

    public void alterarMedicamento() {
        //capturar o nome
        Medicamento m = new Medicamento();
        m.setNome(JOptionPane.showInputDialog("Digite o nome"));
        //pesquisar
        int i;
        i = pesquisarMedicamento(m.getNome());
        //alterar medicamento
        if (i < quant) {
            m.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código")));
            m.setLaboratorio(JOptionPane.showInputDialog("Digite o laboratorio"));
            m.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")));
            m.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço")));
            med[i] = m;
            JOptionPane.showMessageDialog(null, "Medicamento Alterado");
        } else {
            JOptionPane.showMessageDialog(null, "Medicamento não cadastrado");
        }
    }

    public int pesquisarMedicamento(String n) {
        Medicamento m = new Medicamento();
        //m = null;
        int i = 0;
        if (quant > 0) {
            for (i = 0; i < quant; i++) {
                if (med[i].getNome().equals(n)) {
                    //m = med[i];
                    return i;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Carrinho vazio");
        }
        return i;
    }

    public void excluirMedicamento() {
        //capturar o nome
        String nome = JOptionPane.showInputDialog("Digite o nome");
        //pesquisar
        int i;
        i = pesquisarMedicamento(nome);
        //excluir
        if (i < quant) {
            quant--; //Diminuir quant -1
            med[i] = med[quant]; //Substituir
            JOptionPane.showMessageDialog(null, "Exclusão realizada");
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão não realizada");
        }
    }
}
