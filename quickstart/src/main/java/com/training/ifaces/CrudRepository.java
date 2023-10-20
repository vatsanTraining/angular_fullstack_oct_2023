package com.training.ifaces;
import java.util.*;
public interface CrudRepository<T> {

	boolean add(T t);
    List<T> findAll();
    
}
