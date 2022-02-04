package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author alimani
 * @project sfg-pet-clinic
 * 2/4/2022, 8:30 AM
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
