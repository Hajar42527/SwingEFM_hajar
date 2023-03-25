package com.efm.crjj.ismo.metier;

import java.util.List;

public interface IMetier<T> {
	
	List<T> getAll();
	T getOne(int id);
	boolean save(T obj);
	boolean delete(T obj);

}
