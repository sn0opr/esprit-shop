package tn.esprit.cs.g2.services.interfaces;

import java.util.List;

public interface DaoGenericInterface <T>{
	void add(T obj);
	void delete(int id);
	void update(T obj);
	T findById(int id);
	List<T> findAll();
}