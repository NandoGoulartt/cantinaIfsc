package controller;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import model.Carteirinha;
import utilities.Utilities;
import view.TBuscaCarteirinha;
import view.TCadastroCarteirinha;

public class ControllerCadastroCarteirinha implements ActionListener {

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
            String idCliente = this.telaCadastroCarteirinha.getjTFIdCliente().getText();
            String codBarra = this.telaCadastroCarteirinha.getjTFCodBarra().getText();

            ArrayList<String> fields = new ArrayList<>(List.of(codBarra, idCliente));

            if (!Utilities.validateFields(id, fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPanDados());
                return;
            }

            carteirinha.setId(DAO.ClasseDados.listaCarteirinha.size() + 1);
            carteirinha.setDataGeracao(calendario.getTime());
            carteirinha.setDataCancelamento("");
            carteirinha.setIdcliente(Integer.parseInt(idCliente));
            carteirinha.setCodBarra(codBarra);

            if (this.telaCadastroCarteirinha.getjTFId().getText().equalsIgnoreCase("")) {
                service.CarteirinhaService.adicionar(carteirinha);
            } else {
                carteirinha.setId(Integer.parseInt(this.telaCadastroCarteirinha.getjTFId().getText()));
                service.CarteirinhaService.atualizar(carteirinha);
            }

            DAO.ClasseDados.listaCarteirinha.add(carteirinha);
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCarteirinha.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroCarteirinha.getjPanDados());

            return;
        }

        if (e.getSource() == this.telaCadastroCarteirinha.getjBBuscar()) {
            TBuscaCarteirinha telaBuscaCarteirinha = new TBuscaCarteirinha(null, true);
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(
                    telaBuscaCarteirinha);
            telaBuscaCarteirinha.setVisible(true);
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            if (codigo != 0) {
                Carteirinha carteirinha = new Carteirinha();
                carteirinha = DAO.ClasseDados.listaCarteirinha.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCarteirinha.getjPanBotoes());
                Utilities.limpaComponentes(true, this.telaCadastroCarteirinha.getjPanDados());

                this.telaCadastroCarteirinha.getjTFId().setText(carteirinha.getId() + "");
                this.telaCadastroCarteirinha.getjTFCodBarra().setText(carteirinha.getCodBarra());
                this.telaCadastroCarteirinha.getjTFIdCliente().setText(carteirinha.getIdcliente() + "");
                this.telaCadastroCarteirinha.getjTFDataGeracao()
                        .setText(formatoData.format(carteirinha.getDataGeracao()));
                this.telaCadastroCarteirinha.getjTFDataCancelamento().setText(carteirinha.getDataCancelamento());

                this.telaCadastroCarteirinha.getjTFId().setEnabled(false);
                this.telaCadastroCarteirinha.getjTFDataCancelamento().setEnabled(false);
                this.telaCadastroCarteirinha.getjTFDataGeracao().setEnabled(false);
            }

            return;
        }

        this.telaCadastroCarteirinha.dispose();
    }
}
