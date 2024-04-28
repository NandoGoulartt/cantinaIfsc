package DAO;

import java.util.ArrayList;
import model.Bairro;
import model.Carteirinha;
import model.Cidade;
import model.Cliente;
import model.Endereco;
import model.Fornecedor;
import model.Funcionario;
import model.Produto;

public class ClasseDados {

    private static ClasseDados instance;
    public static ArrayList<Bairro> listaBairro;
    public static ArrayList<Cidade> listaCidade;
    public static ArrayList<Endereco> listaEndereco;
    public static ArrayList<Fornecedor> listaFornecedor;
    public static ArrayList<Funcionario> listaFuncionario;
    public static ArrayList<Produto> listaProduto;
    public static ArrayList<Carteirinha> listaCarteirinha;
    public static ArrayList<Cliente> listaCliente;

    public static synchronized ClasseDados getInstance() {

        if (instance == null) {
            instance = new ClasseDados();
        }
        return instance;
    }

    private ClasseDados() {
        listaBairro = new ArrayList<>();
        listaCidade = new ArrayList<>();
        listaEndereco = new ArrayList<>();
        listaFornecedor = new ArrayList<>();
        listaFuncionario = new ArrayList<>();
        listaProduto = new ArrayList<>();
        listaCarteirinha = new ArrayList<>();
        listaCliente = new ArrayList<>();

        Bairro bairro1 = new Bairro(1, "Centro");
        Bairro bairro2 = new Bairro(2, "Santa B�rbara");
        Bairro bairro3 = new Bairro(3, "Humait�");

        listaBairro.add(bairro1);
        listaBairro.add(bairro2);
        listaBairro.add(bairro3);

        Cidade cidade1 = new Cidade(1, "Tubarao", "SC");
        Cidade cidade2 = new Cidade(2, "Laguna", "SC");
        Cidade cidade3 = new Cidade(3, "Sao Paulo", "SP");

        listaCidade.add(cidade1);
        listaCidade.add(cidade2);
        listaCidade.add(cidade3);

        Endereco endereco1 = new Endereco(1, "88705871", "Rua joao pessoa", 'a', cidade1, bairro1);
        Endereco endereco2 = new Endereco(2, "88708740", "Rua manoel antonio mateus", 'a', cidade2, bairro2);
        Endereco endereco3 = new Endereco(3, "88700144", "Ruao sao paulo", 'i', cidade3, bairro3);
        Endereco endereco4 = new Endereco(4, "88705872", "Rua pessoa", 'a', cidade1, bairro1);

        listaEndereco.add(endereco1);
        listaEndereco.add(endereco2);
        listaEndereco.add(endereco3);
        listaEndereco.add(endereco4);
       
        Fornecedor fornecedor1 = new Fornecedor("26604538000107", "123456789", "Empresa 1", 1, "EmpresaNome1", "4899999999", "4899999999", "email@email.com", 'a', "complementoEndereco1", endereco1);
        Fornecedor fornecedor2 = new Fornecedor("86894923000150", "123456788", "Empresa 2", 2, "EmpresaNome1", "4899299999", "4829999999", "email2@email.com", 'a', "complementoEndereco2", endereco2);

        listaFornecedor.add(fornecedor1);
        listaFornecedor.add(fornecedor2);

        Funcionario funcionario1 = new Funcionario("47315477098", "384518151", "user1", "senha", 1, "nomeUser1","4899999999", "4899999999", "emailuser@email.com", 'a', "complemento 1", endereco3);
        Funcionario funcionario2 = new Funcionario("15497785018", "487817059", "user2", "senha", 2, "nomeUser2","4899999999", "4899999999", "emailuser2@email.com", 'a', "complemento 2", endereco1);

        listaFuncionario.add(funcionario1);
        listaFuncionario.add(funcionario2);
    }
}
