package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author alimani
 * @project sfg-pet-clinic
 * 2/4/2022, 8:28 AM
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
