package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.Carteirinha;
import model.Funcionario;
import model.Venda;
import utilities.Utilities;
import view.TBuscaCarteirinha;
import view.TBuscaFuncionario;
import view.TBuscaVenda;
import view.TCadastroVenda;

public class ControllerCadastroVenda extends ControllerCadastro implements ActionListener {

    TCadastroVenda telaCadastroVenda;
    public static int codigo;

    public ControllerCadastroVenda(TCadastroVenda telaCadastroVenda) {
        this.telaCadastroVenda = telaCadastroVenda;

        this.telaCadastroVenda.getjBNovo().addActionListener(this);
        this.telaCadastroVenda.getjBSair().addActionListener(this);
        this.telaCadastroVenda.getjBCancelar().addActionListener(this);
        this.telaCadastroVenda.getjBGravar().addActionListener(this);
        this.telaCadastroVenda.getjBBuscar().addActionListener(this);
        this.telaCadastroVenda.getjBBuscarCarteirinha().addActionListener(this);
        this.telaCadastroVenda.getjBBuscarFuncionario().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanBotoes());
        Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados());

        utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanDados1());
        Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados1());

        this.telaCadastroVenda.getjTFValor().setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroVenda.getjBNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroVenda.getjPanBotoes());
            Utilities.limpaComponentes(true, this.telaCadastroVenda.getjPanDados());

            utilities.Utilities.ativaDesativa(false, this.telaCadastroVenda.getjPanDados1());
            Utilities.limpaComponentes(true, this.telaCadastroVenda.getjPanDados1());

            this.telaCadastroVenda.getjTFId().setEnabled(false);
            this.telaCadastroVenda.getjTFValor().setEnabled(false);

            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados());

            utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanDados1());
            Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados1());

            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBGravar()) {
            Venda venda = new Venda();
            Calendar calendario = Calendar.getInstance();

            String id = this.telaCadastroVenda.getjTFId().getText();
            String observacao = this.telaCadastroVenda.getjTFObservacao().getText();
            String status = this.telaCadastroVenda.getjCBStatus().getSelectedItem().toString();
            String flagStatusDesconto = this.telaCadastroVenda.getjTFFlagTipoDesconto().getText();
            int carteirinhaID = this.telaCadastroVenda.getCarteirinhaID();
            int funcionarioID = this.telaCadastroVenda.getFuncionarioID();

            ArrayList<String> fields = new ArrayList<>(List.of(observacao, status, flagStatusDesconto));

            if (!Utilities.validateFields(id, fields)) {
                utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanBotoes());
                Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados());

                utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanDados1());
                Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados1());
                return;
            }

            venda.setObservacao(observacao);
            venda.setDataHoraVenda(calendario.getTime());
            venda.setStatus(Utilities.getCharStatusFromString(status));
            venda.setFlagTipoDesconto(flagStatusDesconto);
            venda.setCarteirinha(carteirinhaID);
            venda.setFuncionario(funcionarioID);

            if (this.telaCadastroVenda.getjTFId().getText().equalsIgnoreCase("")) {
                service.VendaService.adicionar(venda);
            } else {
                venda.setId(Integer.parseInt(this.telaCadastroVenda.getjTFId().getText()));
                System.out.print(venda);
                service.VendaService.atualizar(venda);
            }

            utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanBotoes());
            Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados());

            utilities.Utilities.ativaDesativa(true, this.telaCadastroVenda.getjPanDados1());
            Utilities.limpaComponentes(false, this.telaCadastroVenda.getjPanDados1());

            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBBuscar()) {
         TBuscaVenda telaBuscaVenda = new TBuscaVenda(null, true);

         new ControllerBuscaVenda(telaBuscaVenda);

         telaBuscaVenda.setVisible(true);

         if (codigo != 0) {
         Venda venda = new Venda();
         venda = service.VendaService.carregar(codigo);
         utilities.Utilities.ativaDesativa(false,
         this.telaCadastroVenda.getjPanBotoes());
         Utilities.limpaComponentes(true, this.telaCadastroVenda.getjPanDados());

         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         String dataFormatada = formatter.format(venda.getDataHoraVenda()); 
         
         this.telaCadastroVenda.getjTFId().setText(venda.getId() + "");
         this.telaCadastroVenda.getjTFObservacao().setText(venda.getObservacao());
         this.telaCadastroVenda.getjTFValor().setText(Double.toString(venda.getVlrVenda()));
         this.telaCadastroVenda.getjTFFlagTipoDesconto().setText(venda.getFlagTipoDesconto());
         this.telaCadastroVenda.getjTCarteirinha().setText(venda.getCarteirinha().getCodBarra());
         this.telaCadastroVenda.getjTFuncionario().setText(venda.getFuncionario().getNome());       
         this.telaCadastroVenda.getTxtdateGeracao().setText(dataFormatada);

         this.telaCadastroVenda.getjCBStatus().setSelectedItem(venda.getStatus());

         }

         return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBBuscarCarteirinha()) {
            TBuscaCarteirinha telaBuscaCarteirinha = new TBuscaCarteirinha(null, true);
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(telaBuscaCarteirinha,
                    this);
            telaBuscaCarteirinha.setVisible(true);
            if (this.getCodigoCarteirinhaCadastro() != 0) {
                Carteirinha carteirinha = new Carteirinha();
                carteirinha = service.CarteirinhaService.carregar(this.getCodigoCarteirinhaCadastro());

                this.telaCadastroVenda.setCarteirinhaID(carteirinha.getId());
                this.telaCadastroVenda.getjTCarteirinha().setText(carteirinha.getCodBarra());
                this.setCodigoCarteirinhaCadastro(0);
            }

            return;
        }

        if (e.getSource() == this.telaCadastroVenda.getjBBuscarFuncionario()) {
            TBuscaFuncionario telaBuscaFuncionario = new TBuscaFuncionario(null, true);
            ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(telaBuscaFuncionario,
                    this);
            telaBuscaFuncionario.setVisible(true);
            if (this.getCodigoFuncionarioCadastro() != 0) {
                Funcionario carteirinha = new Funcionario();
                carteirinha = service.FuncionarioService.carregar(this.getCodigoFuncionarioCadastro());

                this.telaCadastroVenda.setFuncionarioID(carteirinha.getId());
                this.telaCadastroVenda.getjTFuncionario().setText(carteirinha.getNome());
                this.setCodigoFuncionarioCadastro(0);
            }

            return;
        }

        this.telaCadastroVenda.dispose();
    }
}