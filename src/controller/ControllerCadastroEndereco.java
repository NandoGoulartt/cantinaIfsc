package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import utilities.Utilities;
import view.TBuscaEndereco;
import view.TCadastroEndereco;

public class ControllerCadastroEndereco extends ControllerCadastro implements ActionListener {

    TCadastroEndereco telaCadastroEndereco;
    public static int codigo;

    public ControllerCadastroEndereco(TCadastroEndereco telaCadastroEndereco) {
        this.telaCadastroEndereco = telaCadastroEndereco;

        this.telaCadastroEndereco.getjBNovo().addActionListener(this);
        this.telaCadastroEndereco.getjBSair().addActionListener(this);
        this.telaCadastroEndereco.getjBCancelar().addActionListener(this);
        this.telaCadastroEndereco.getjBGravar().addActionListener(this);
        this.telaCadastroEndereco.getjBBuscar().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroEndereco.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroEndereco.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroEndereco.getjPanDados());

            this.telaCadastroEndereco.getjTFId().setEnabled(false);
        } else if (e.getSource() == this.telaCadastroEndereco.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());

        } else if (e.getSource() == this.telaCadastroEndereco.getjBGravar()) {
            Endereco endereco = new Endereco();
            String id = this.telaCadastroEndereco.getjTFId().getText();
            Object selectedItem = (this.telaCadastroEndereco.getjTStatus().getSelectedItem());
            String status = selectedItem instanceof String ? (String) selectedItem : "";
            String logradouro = this.telaCadastroEndereco.getjTLogradouro().getText();
            String cep = this.telaCadastroEndereco.getjFTFCep().getText();

            ArrayList<String> fields = new ArrayList<>(List.of(status, logradouro, cep));

            if (!Utilities.validateFields(id, fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());
                return;
            }

            endereco.setId(DAO.ClasseDados.listaEndereco.size() + 1);
            endereco.setStatus(status);
            endereco.setLogradouro(logradouro);
            endereco.setCep(cep);

            DAO.ClasseDados.listaEndereco.add(endereco);
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());
            return;

        } else if (e.getSource() == this.telaCadastroEndereco.getjBBuscar()) {
            TBuscaEndereco telaBuscaEndereco = new TBuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco, null);

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
