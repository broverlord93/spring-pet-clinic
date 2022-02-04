package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

import javax.sql.rowset.CachedRowSet;

/**
 * @author alimani
 * @project sfg-pet-clinic
 * 2/4/2022, 8:29 AM
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
