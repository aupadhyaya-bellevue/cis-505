import java.util.List;

/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */


public interface GenericDao<E, K> {
    // Declare all the DAO methods
    List<E> findAll();
    E findBy(K key);
    void insert(E entry);
}
