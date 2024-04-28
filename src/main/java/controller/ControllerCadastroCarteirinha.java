package controller;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import model.Carteirinha;
import model.Cliente;
import utilities.Utilities;
import view.TBuscaCarteirinha;
import view.TBuscaCliente;
import view.TCadastroCarteirinha;

public class ControllerCadastroCarteirinha extends ControllerCadastro implements ActionListener {

    // Criando um objeto Global do tipo da tela que iremos controllar
    TCadastroCarteirinha telaCadastroCarteirinha;
    public static int codigo;

    // Passando a tela que iremos controlar como parametro de invoca��o
    public ControllerCadastroCarteirinha(TCadastroCarteirinha telaCadastroCarteirinha) {
        // Repassando o valor(tela) do par�metro para o objeto global
        this.telaCadastroCarteirinha = telaCadastroCarteirinha;

        // Adicionando ouvintes(Listeners) para escutar a��es nos bot�es da tela
        this.telaCadastroCarteirinha.getjBNovo().addActionListener(this);
        this.telaCadastroCarteirinha.getjBSair().addActionListener(this);
        this.telaCadastroCarteirinha.getjBCancelar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBGravar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBBuscar().addActionListener(this);
        this.telaCadastroCarteirinha.getjBBuscarCliente().addActionListener(this);

        // Executando os m�todos da classe de utilit�rios
        // para ativar/desativar/limpar bot�es e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPanDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadastroCarteirinha.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCarteirinha.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroCarteirinha.getjPanDados());

            this.telaCadastroCarteirinha.getjTFId().setEnabled(false);
            this.telaCadastroCarteirinha.getjTFDataCancelamento().setEnabled(false);
            this.telaCadastroCarteirinha.getjTFDataGeracao().setEnabled(false);

            return;
        }

        if (e.getSource() == this.telaCadastroCarteirinha.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPanDados());

            return;
        }

        if (e.getSource() == this.telaCadastroCarteirinha.getjBGravar()) {
            Carteirinha carteirinha = new Carteirinha();
            Calendar calendario = Calendar.getInstance();

            String id = this.telaCadastroCarteirinha.getjTFId().getText();
            int idCliente = this.telaCadastroCarteirinha.getClienteId();
            String codBarra = this.telaCadastroCarteirinha.getjTFCodBarra().getText();

            ArrayList<String> fields = new ArrayList<>(List.of(codBarra));

            if (!Utilities.validateFields(id, fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPanDados());
                return;
            }

            carteirinha.setDataGeracao(calendario.getTime());
            carteirinha.setDataCancelamento("");
            carteirinha.setIdcliente(idCliente);
            carteirinha.setCodBarra(codBarra);

            if (this.telaCadastroCarteirinha.getjTFId().getText().equalsIgnoreCase("")) {
                service.CarteirinhaService.adicionar(carteirinha);
            } else {
                carteirinha.setId(Integer.parseInt(this.telaCadastroCarteirinha.getjTFId().getText()));
                service.CarteirinhaService.atualizar(carteirinha);
            }

            utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPanDados());

            return;
        }

        if (e.getSource() == this.telaCadastroCarteirinha.getjBBuscar()) {
            TBuscaCarteirinha telaBuscaCarteirinha = new TBuscaCarteirinha(null, true);
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(
                    telaBuscaCarteirinha, this);
            telaBuscaCarteirinha.setVisible(true);
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            if (this.getCodigoCarteirinhaCadastro() != 0) {
                Carteirinha carteirinha = new Carteirinha();
                Cliente cliente = new Cliente();
                carteirinha = service.CarteirinhaService.carregar(this.getCodigoCarteirinhaCadastro());
                cliente = service.ClienteService.carregar(carteirinha.getIdcliente());
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCarteirinha.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroCarteirinha.getjPanDados());

                this.telaCadastroCarteirinha.getjTFId().setText(carteirinha.getId() + "");
                this.telaCadastroCarteirinha.getjTFCodBarra().setText(carteirinha.getCodBarra());
                this.telaCadastroCarteirinha.setClienteId(cliente.getId());
                this.telaCadastroCarteirinha.getjTFIdCliente().setText(cliente.getNome());
                this.telaCadastroCarteirinha.getjTFDataGeracao()
                        .setText(formatoData.format(carteirinha.getDataGeracao()));
                this.telaCadastroCarteirinha.getjTFDataCancelamento().setText(carteirinha.getDataCancelamento());
                this.telaCadastroCarteirinha.getjTFCodBarra().setText(carteirinha.getCodBarra());

                this.telaCadastroCarteirinha.getjTFId().setEnabled(false);
                this.telaCadastroCarteirinha.getjTFDataCancelamento().setEnabled(false);
                this.telaCadastroCarteirinha.getjTFDataGeracao().setEnabled(false);
            }

            return;
        }

        if (e.getSource() == this.telaCadastroCarteirinha.getjBBuscarCliente()) {
            TBuscaCliente telaBuscaCliente = new TBuscaCliente(null, true);
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(telaBuscaCliente, this);
            telaBuscaCliente.setVisible(true);
            if (this.getCodigoClienteCadastro() != 0) {
                Cliente cliente = new Cliente();
                cliente = service.ClienteService.carregar(this.getCodigoClienteCadastro());

                this.telaCadastroCarteirinha.setClienteId(cliente.getId());
                this.telaCadastroCarteirinha.getjTFIdCliente().setText(cliente.getNome());
                this.setCodigoClienteCadastro(0);
            }

            return;
        }

        this.telaCadastroCarteirinha.dispose();
    }
}
