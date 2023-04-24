/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {

    // Create in-memory list of composers
    private List<Composer> composers = new ArrayList<>();

    @Override
    /**
     * This method returns list of all the composers available in the memory
     */
    public List<Composer> findAll() {
        return composers;
    }

    @Override
    /**
     * This method returns a Composer by id, it retuns if no match found
     * @return composer {@link Composer}
     */
    public Composer findBy(Integer key) {
        // Find a composer with the key
        for(Composer composer: composers) {
            if(composer.getId() == key) {
                return composer;
            }
        }

        return null;
    }

    @Override
    /**
     * Method to add a new Composer
     * @param composer {@link Composer}
     */
    public void insert(Composer entry) {
        composers.add(entry);
    }    
}
