package Model;

public interface DAO {

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