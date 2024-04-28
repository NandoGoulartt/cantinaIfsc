package DAO;

import java.util.List;

public interface InterfaceDAO<T> {
    
   public abstract void create(T objeto);
   public abstract List<T> retrieve();
   public abstract T retrieve(int parPK);
   public abstract T retrieve(String parString, String column);
   public abstract void update(T objeto);
   public abstract void delete(T objeto);
   
}