package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Caixa;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-05-12T23:37:12")
@StaticMetamodel(MovimentoCaixa.class)
public class MovimentoCaixa_ { 

    public static volatile SingularAttribute<MovimentoCaixa, Character> flagTipoMovimento;
    public static volatile SingularAttribute<MovimentoCaixa, String> observacao;
    public static volatile SingularAttribute<MovimentoCaixa, Caixa> caixa;
    public static volatile SingularAttribute<MovimentoCaixa, Date> dataHoraMovimento;
    public static volatile SingularAttribute<MovimentoCaixa, Integer> id;
    public static volatile SingularAttribute<MovimentoCaixa, Float> valorMovimento;
    public static volatile SingularAttribute<MovimentoCaixa, Character> status;

}