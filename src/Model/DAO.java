package Model;

import java.util.List;

public interface DAO<T> {

	List<T> WypiszWszystkie();

	/**
	 * 
	 * @param id
	 */
	T ZnajdzPojazd(int id);

	/**
	 * 
	 * @param obj
	 */
	void Wstaw(T obj);

	/**
	 * 
	 * @param obj
	 */
	void Zaktualizuj(T obj);

	/**
	 * 
	 * @param obj
	 */
	void Usun(T obj);

}