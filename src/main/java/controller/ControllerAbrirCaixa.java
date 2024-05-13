/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static jdk.javadoc.internal.doclets.toolkit.util.DocPath.parent;
import model.Caixa;
import model.Carteirinha;
import service.CaixaService;
import service.FuncionarioService;
import view.AberturaCaixa;
import view.TCadastroVenda;
public class ControllerAbrirCaixa implements ActionListener {

    AberturaCaixa abreCaixaView;

    public ControllerAbrirCaixa(AberturaCaixa abreCaixaView) {
        this.abreCaixaView = abreCaixaView;
        
        this.abreCaixaView.getBotaoAbrirCaixa().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.abreCaixaView.getBotaoAbrirCaixa()) {
            TCadastroVenda pontoDeVendaView = new TCadastroVenda(null, true);
            ControllerCadastroVenda controllerPontoDeVenda = new ControllerCadastroVenda(pontoDeVendaView);
            pontoDeVendaView.setFuncionarioID(Integer.valueOf(this.abreCaixaView.getIdFuncionario().getText().toString().trim()));
            pontoDeVendaView.getjTFuncionario().setText(FuncionarioService.carregar(Integer.valueOf(this.abreCaixaView.getIdFuncionario().getText().toString().trim())).getNome());
            
            Carteirinha carteirinha = new Carteirinha();
            Calendar calendario = Calendar.getInstance();
            
            Caixa caixa = new Caixa();
            
            caixa.setFuncionario(FuncionarioService.carregar(Integer.valueOf(abreCaixaView.getIdFuncionario().getText())));
            caixa.setDataHoraAbertura(calendario.getTime());
            caixa.setStatus('A');
            caixa.setValorAbertura(0);
            caixa.setValorFechamento(0);
            
            CaixaService.adicionar(caixa);
            
            abreCaixaView.dispose();
            pontoDeVendaView.setVisible(true);
            
        }

    }

}
