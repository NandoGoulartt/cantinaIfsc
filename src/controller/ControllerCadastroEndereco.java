package controller;

import static controller.ControllerCadastroBairro.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Bairro;
import model.Endereco;
import utilities.Utilities;
import view.TBuscaEndereco;
import view.TCadastroEndereco;

public class ControllerCadastroEndereco implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroEndereco telaCadastroEndereco;
    public static int codigo;

    //Passando a tela que iremos controlar como parametro de invoca��o
    public ControllerCadastroEndereco(TCadastroEndereco telaCadastroEndereco) {
        //Repassando o valor(tela) do par�metro para o objeto global
        this.telaCadastroEndereco = telaCadastroEndereco;

        //Adicionando ouvintes(Listeners) para escutar a��es nos bot�es da tela
        this.telaCadastroEndereco.getjBNovo().addActionListener(this);
        this.telaCadastroEndereco.getjBSair().addActionListener(this);
        this.telaCadastroEndereco.getjBCancelar().addActionListener(this);
        this.telaCadastroEndereco.getjBGravar().addActionListener(this);
        this.telaCadastroEndereco.getjBBuscar().addActionListener(this);

        //Executando os m�todos da classe de utilit�rios
        //para ativar/desativar/limpar bot�es e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroEndereco.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroEndereco.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroEndereco.getjPanDados());

        } else if (e.getSource() == this.telaCadastroEndereco.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());

        } else if (e.getSource() == this.telaCadastroEndereco.getjBGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());

        } else if (e.getSource() == this.telaCadastroEndereco.getjBBuscar()) {
            TBuscaEndereco telaBuscaEndereco = new TBuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco);

            //Inserir o controller da busca d Enderecos
            telaBuscaEndereco.setVisible(true);

            if (codigo != 0) {
                Endereco endereco = new Endereco();
                endereco = DAO.ClasseDados.listaEndereco.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroEndereco.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroEndereco.getjPanDados());

                this.telaCadastroEndereco.getjTFId().setText(endereco.getId() + "");
                this.telaCadastroEndereco.getjFTFCep().setText(endereco.getCep());
                this.telaCadastroEndereco.getjTLogradouro().setText(endereco.getLogradouro());
                this.telaCadastroEndereco.getjTStatus().setSelectedItem(endereco.getStatus());

                this.telaCadastroEndereco.getjTFId().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroEndereco.getjBSair()) {
            this.telaCadastroEndereco.dispose();

        }
    }

}
