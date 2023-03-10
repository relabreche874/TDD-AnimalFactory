package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIntTest() {

    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {

    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {

    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberofDogsTest() {

    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
