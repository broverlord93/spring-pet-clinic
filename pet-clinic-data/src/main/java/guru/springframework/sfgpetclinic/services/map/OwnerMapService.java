package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService{

    // Inject PetType and Pet Services to establish relationships between owner and pet(s)
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        // Return `null` if we try to save a null-object

        if (object != null){

            // If owner has a pet(s), persist each pet
            if (object.getPets() != null){

                object.getPets().forEach(pet ->{

                    if (pet.getPetType() != null){

                        // If the pet hasn't been saved yet...
                        if (pet.getPetType().getId() == null){

                            // Set the pet-type-id by using the petTypeService to auto-generate a pet-type-id
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {

                        throw new RuntimeException("Pet Type is required");
                    }


                    // Similarly, make sure the pet-id is set
                    if (pet.getId() == null){

                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }

            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
