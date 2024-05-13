package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Funcionario;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-05-12T23:37:12")
@StaticMetamodel(MovimentacaoEstoque.class)
public class MovimentacaoEstoque_ { 

    public static volatile SingularAttribute<MovimentacaoEstoque, Character> flagTipoMovimento;
    public static volatile SingularAttribute<MovimentacaoEstoque, String> observacaoMovimento;
    public static volatile SingularAttribute<MovimentacaoEstoque, Produto> produto;
    public static volatile SingularAttribute<MovimentacaoEstoque, String> datahoraMovimento;
    public static volatile SingularAttribute<MovimentacaoEstoque, Integer> id;
    public static volatile SingularAttribute<MovimentacaoEstoque, Funcionario> funcionario;
    public static volatile SingularAttribute<MovimentacaoEstoque, Float> qtdMovimentada;
    public static volatile SingularAttribute<MovimentacaoEstoque, Character> status;

}