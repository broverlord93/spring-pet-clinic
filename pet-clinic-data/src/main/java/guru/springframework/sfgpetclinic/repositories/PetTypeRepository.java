package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author alimani
 * @project sfg-pet-clinic
 * 2/4/2022, 8:29 AM
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
