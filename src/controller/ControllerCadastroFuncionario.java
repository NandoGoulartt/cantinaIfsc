package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Fornecedor;
import model.Funcionario;
import utilities.Utilities;
import view.TBuscaEndereco;
import view.TBuscaFuncionario;
import view.TCadastroFuncionario;

public class ControllerCadastroFuncionario extends ControllerCadastro implements ActionListener {

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
        this.telaCadastroFuncionario.getjBBuscarCep().addActionListener(this);

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

            this.telaCadastroFuncionario.getjTFId1().setEnabled(false);
            this.telaCadastroFuncionario.getJtextCep().setEnabled(false);
            this.telaCadastroFuncionario.getjCBCidade().setEnabled(false);
            this.telaCadastroFuncionario.getjCBBairro().setEnabled(false);
        } else if (e.getSource() == this.telaCadastroFuncionario.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPanDados());

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBGravar()) {
            Funcionario funcionario = new Funcionario();

            String id = this.telaCadastroFuncionario.getjTFId1().getText();
            String nome = this.telaCadastroFuncionario.getJtextNome().getText();
            String rg = this.telaCadastroFuncionario.getJtextRg().getText();
            Object selectedItem = this.telaCadastroFuncionario.getJcomboBoxStatus().getSelectedItem();
            String status = selectedItem instanceof String ? (String) selectedItem : "";
            String email = this.telaCadastroFuncionario.getJtextEmail().getText();
            String cpf = this.telaCadastroFuncionario.getJtextCpf().getText();
            String telefone1 = this.telaCadastroFuncionario.getJtextTelefone1().getText();
            String telefone2 = this.telaCadastroFuncionario.getJtextTelefone2().getText();
            String complemento = this.telaCadastroFuncionario.getJtextComplemento().getText();
            String usuario = this.telaCadastroFuncionario.getJtextUsuario().getText();
            String senha = this.telaCadastroFuncionario.getJtextSenha().getText();

            ArrayList<String> fields = new ArrayList<>(List.of(nome, status, email, rg, cpf, telefone1, telefone2, complemento, usuario, senha));

            if (!Utilities.validateFields(id, fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getjPanDados());
                return;
            }

            Endereco endereco = DAO.ClasseDados.listaEndereco.get(this.getCodigoEnderecoCadastro() - 1);

            funcionario.setId(DAO.ClasseDados.listaFuncionario.size() + 1);
            funcionario.setNome(nome);
            funcionario.setRg(rg);
            funcionario.setStatus(Utilities.getCharStatusFromString(status));
            funcionario.setEmail(email);
            funcionario.setEndereco(endereco);
            funcionario.setCpf(cpf);
            funcionario.setFone1(telefone1);
            funcionario.setFone2(telefone2);
            funcionario.setComplementoEndereco(complemento);
            funcionario.setUsuario(usuario);
            funcionario.setSenha(senha);

            DAO.ClasseDados.listaFuncionario.add(funcionario);
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
                this.telaCadastroFuncionario.getJtextCep().setEnabled(false);
                this.telaCadastroFuncionario.getjCBCidade().setEnabled(false);
                this.telaCadastroFuncionario.getjCBBairro().setEnabled(false);
            }

            return;

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBSair()) {
            this.telaCadastroFuncionario.dispose();

        } else if (e.getSource() == this.telaCadastroFuncionario.getjBBuscarCep()) {
            TBuscaEndereco telaBuscaEndereco = new TBuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco, this);

            telaBuscaEndereco.setVisible(true);

            if (this.getCodigoEnderecoCadastro() != 0) {
                Endereco endereco = new Endereco();
                endereco = DAO.ClasseDados.listaEndereco.get(this.getCodigoEnderecoCadastro() - 1);

                this.telaCadastroFuncionario.getJtextCep().setText(endereco.getCep());
                this.telaCadastroFuncionario.getjCBCidade().setText(endereco.getCidade().getDescricao());
                this.telaCadastroFuncionario.getjCBBairro().setText(endereco.getBairro().getDescricao());
            }

            return;
        }
    }

}
