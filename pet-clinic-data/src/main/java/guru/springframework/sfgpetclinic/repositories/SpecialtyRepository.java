package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * @author alimani
 * @project sfg-pet-clinic
 * 2/4/2022, 8:29 AM
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
