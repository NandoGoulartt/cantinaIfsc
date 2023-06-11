package controller;

import static controller.ControllerCadastroBairro.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Bairro;
import model.Produto;
import utilities.Utilities;
import view.TBuscaProduto;
import view.TCadastroProduto;

public class ControllerCadastroProduto implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroProduto telaCadastroProduto;
    public static int codigo;

    //Passando a tela que iremos controlar como parametro de invoca��o
    public ControllerCadastroProduto(TCadastroProduto telaCadastroProduto) {
        //Repassando o valor(tela) do par�metro para o objeto global
        this.telaCadastroProduto = telaCadastroProduto;

        //Adicionando ouvintes(Listeners) para escutar a��es nos bot�es da tela
        this.telaCadastroProduto.getjBNovo().addActionListener(this);
        this.telaCadastroProduto.getjBSair().addActionListener(this);
        this.telaCadastroProduto.getjBCancelar().addActionListener(this);
        this.telaCadastroProduto.getjBGravar().addActionListener(this);
        this.telaCadastroProduto.getjBBuscar().addActionListener(this);

        //Executando os m�todos da classe de utilit�rios
        //para ativar/desativar/limpar bot�es e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroProduto.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroProduto.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroProduto.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroProduto.getjPanDados());

        } else if (e.getSource() == this.telaCadastroProduto.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroProduto.getjPanDados());

        } else if (e.getSource() == this.telaCadastroProduto.getjBGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroProduto.getjPanDados());

        } else if (e.getSource() == this.telaCadastroProduto.getjBBuscar()) {
            TBuscaProduto telaBuscaProduto = new TBuscaProduto(null, true);

            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(telaBuscaProduto);

            //Inserir o controller da busca d Produtos
            telaBuscaProduto.setVisible(true);

            if (codigo != 0) {
                Produto produto = new Produto();
                produto = DAO.ClasseDados.listaProduto.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroProduto.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroProduto.getjPanDados());

                this.telaCadastroProduto.getjTFId().setText(produto.getId() + "");
                this.telaCadastroProduto.getjTFDescricao().setText(produto.getDescricao());
                this.telaCadastroProduto.getjTFCodBarras().setText(produto.getCodigoBarra());
                this.telaCadastroProduto.getjCBStatus().setSelectedItem(produto.getStatus());

                this.telaCadastroProduto.getjTFId().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroProduto.getjBSair()) {
            this.telaCadastroProduto.dispose();

        }
    }

}
