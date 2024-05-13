package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Carteirinha;
import model.Funcionario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-05-12T23:37:12")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Date> dataHoraVenda;
    public static volatile SingularAttribute<Venda, String> observacao;
    public static volatile SingularAttribute<Venda, String> flagTipoDesconto;
    public static volatile SingularAttribute<Venda, Integer> id;
    public static volatile SingularAttribute<Venda, Funcionario> funcionario;
    public static volatile SingularAttribute<Venda, Carteirinha> carteirinha;
    public static volatile SingularAttribute<Venda, Character> status;
    public static volatile SingularAttribute<Venda, Double> vlrVenda;

}