package controller;

import static DAO.ClasseDados.listaFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Funcionario;
import utilities.Utilities;
import view.TBuscaCliente;
import view.TBuscaFuncionario;
import view.TCadastroCliente;
import view.TCadastroFuncionario;

public class ControllerCadastroFuncionario implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroFuncionario telaCadastroFuncionario;
    public static int codigo;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroFuncionario(TCadastroFuncionario telaCadastroFuncionario) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroFuncionario = telaCadastroFuncionario;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        this.telaCadastroFuncionario.getjBNovo().addActionListener(this);
        this.telaCadastroFuncionario.getjBSair().addActionListener(this);
        this.telaCadastroFuncionario.getjBCancelar().addActionListener(this);
        this.telaCadastroFuncionario.getjBGravar().addActionListener(this);
        this.telaCadastroFuncionario.getjBBuscar().addActionListener(this);

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroFuncionario.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFuncionario.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroFuncionario.getjPanDados());
        } else if (e.getSource() == this.telaCadastroFuncionario.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPanDados());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPanDados());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBBuscar()) {
            TBuscaFuncionario telaBuscaFuncionario = new TBuscaFuncionario(null, true);
            ControllerBuscaFuncionario controllerbuscafuncionario = new ControllerBuscaFuncionario(telaBuscaFuncionario);

            telaBuscaFuncionario.setVisible(true);
          
            if (codigo != 0) {
                Funcionario funcionario = new Funcionario();
                funcionario = DAO.ClasseDados.listaFuncionario.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroFuncionario.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroFuncionario.getjPanDados());

                this.telaCadastroFuncionario.getjTFId1().setText(funcionario.getId() + "");
                this.telaCadastroFuncionario.getJtextNome().setText(funcionario.getNome());
                this.telaCadastroFuncionario.getJtextRg().setText(funcionario.getRg());
                this.telaCadastroFuncionario.getJcomboBoxStatus().setSelectedItem(funcionario.getStatus());
                this.telaCadastroFuncionario.getJtextEmail().setText(funcionario.getEmail());
                this.telaCadastroFuncionario.getJtextCpf().setText(funcionario.getCpf());
                this.telaCadastroFuncionario.getJtextCep().setText(funcionario.getEndereco().getCep());
                this.telaCadastroFuncionario.getjCBCidade().setText(funcionario.getEndereco().getCidade().getDescricao());
                this.telaCadastroFuncionario.getjCBBairro().setText(funcionario.getEndereco().getBairro().getDescricao());
                this.telaCadastroFuncionario.getJtextTelefone1().setText(funcionario.getFone1());
                this.telaCadastroFuncionario.getJtextTelefone2().setText(funcionario.getFone2());
                this.telaCadastroFuncionario.getJtextComplemento().setText(funcionario.getComplementoEndereco());
                this.telaCadastroFuncionario.getJtextSenha().setText(funcionario.getSenha());
                this.telaCadastroFuncionario.getJtextUsuario().setText(funcionario.getUsuario());

                this.telaCadastroFuncionario.getjTFId1().setEnabled(false);
            }

            return;
            

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBSair()) {
            this.telaCadastroFuncionario.dispose();

        }
    }

}
