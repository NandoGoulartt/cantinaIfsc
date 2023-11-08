package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Bairro;
import model.Cidade;
import model.Endereco;
import utilities.Utilities;
import static utilities.Utilities.getCharStatusFromString;
import view.TBuscaBairro;
import view.TBuscaCidade;
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
        this.telaCadastroEndereco.getjBBuscarCidade().addActionListener(this);
        this.telaCadastroEndereco.getjBBuscarBairro().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroEndereco.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroEndereco.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroEndereco.getjPanDados());
            this.telaCadastroEndereco.getjTFId().setEnabled(false);
            return;
        } 
        
        if (e.getSource() == this.telaCadastroEndereco.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());
            return;
        } 
        
        if (e.getSource() == this.telaCadastroEndereco.getjBGravar()) {
            Endereco endereco = new Endereco();
            
            String id = this.telaCadastroEndereco.getjTFId().getText();
            Object selectedItem = (this.telaCadastroEndereco.getjTStatus().getSelectedItem());
            String status = selectedItem instanceof String ? (String) selectedItem : "";
            String logradouro = this.telaCadastroEndereco.getjTLogradouro().getText();
            String cep = this.telaCadastroEndereco.getjFTFCep().getText();
            int bairroId = this.telaCadastroEndereco.getBairroId();
            int cidadeId = this.telaCadastroEndereco.getCidadeId();

            endereco.setStatus(status);
            endereco.setLogradouro(logradouro);
            endereco.setCep(cep);
            endereco.setBairroId(bairroId);
            endereco.setCidadeId(cidadeId);

            if(this.telaCadastroEndereco.getjTFId().getText().equalsIgnoreCase("")){
                service.EnderecoService.adicionar(endereco);
            }else{
                endereco.setId(Integer.parseInt(this.telaCadastroEndereco.getjTFId().getText()));
                service.EnderecoService.atualizar(endereco);
            }
                        
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getjPanDados());
            return;

        }
        
        if (e.getSource() == this.telaCadastroEndereco.getjBBuscar()) {
            TBuscaEndereco telaBuscaEndereco = new TBuscaEndereco(null, true);
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(telaBuscaEndereco, null);
            telaBuscaEndereco.setVisible(true);
            if (codigo != 0) {
                Endereco endereco = new Endereco();
                Bairro bairro = new Bairro();
                Cidade cidade = new Cidade();
                endereco = service.EnderecoService.carregar(codigo);
                cidade = service.CidadeService.carregar(endereco.getCidadeId());
                bairro = service.BairroService.carregar(endereco.getBairroId());
                utilities.Utilities.ativaDesativa(false, this.telaCadastroEndereco.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroEndereco.getjPanDados());
                

                this.telaCadastroEndereco.setBairroId(bairro.getId());
                this.telaCadastroEndereco.getjCBBairro().setText(bairro.getDescricao());
                this.telaCadastroEndereco.setCidadeId(cidade.getId());
                this.telaCadastroEndereco.getjCBCidade().setText(cidade.getDescricao());
                this.telaCadastroEndereco.getjTFId().setText(endereco.getId() + "");
                this.telaCadastroEndereco.getjFTFCep().setText(endereco.getCep());
                this.telaCadastroEndereco.getjTLogradouro().setText(endereco.getLogradouro());
                this.telaCadastroEndereco.getjTStatus().setSelectedItem(endereco.getStatus());

                this.telaCadastroEndereco.getjTFId().setEnabled(false);
            }
        }
        
        if (e.getSource() == this.telaCadastroEndereco.getjBBuscarCidade()) {
            TBuscaCidade telaBuscacidade = new TBuscaCidade(null, true);
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(telaBuscacidade, this);
            telaBuscacidade.setVisible(true);
            if (this.getCodigoCidadeCadastro() != 0) {
                Cidade cidade = new Cidade();
                cidade = service.CidadeService.carregar(this.getCodigoCidadeCadastro());

                this.telaCadastroEndereco.setCidadeId(cidade.getId());
                this.telaCadastroEndereco.getjCBCidade().setText(cidade.getDescricao());
                this.setCodigoCidadeCadastro(0);
            }
        }
        
        if (e.getSource() == this.telaCadastroEndereco.getjBBuscarBairro()) {
            TBuscaBairro telaBuscaBairro = new TBuscaBairro(null, true);
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(telaBuscaBairro, this);
            telaBuscaBairro.setVisible(true);
            if (this.getCodigoBairroCadastro() != 0) {
                Bairro bairro = new Bairro();
                bairro = service.BairroService.carregar(this.getCodigoBairroCadastro());

                this.telaCadastroEndereco.setBairroId(bairro.getId());
                this.telaCadastroEndereco.getjCBBairro().setText(bairro.getDescricao());
                this.setCodigoBairroCadastro(0);
            }
        }
        
        if (e.getSource() == this.telaCadastroEndereco.getjBSair()) {
            this.telaCadastroEndereco.dispose();
        }
    }

}
