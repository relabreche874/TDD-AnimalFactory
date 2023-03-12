package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        //Given
        Dog dog = AnimalFactory.createDog("Dog", birthDate);
        //When
        DogHouse.add(dog);
        //Then
        Assert.assertEquals(1, (int)DogHouse.getNumberOfDogs());

        DogHouse.clear();
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        //Given
        Dog dog = AnimalFactory.createDog("Duke", birthDate);
        //When
        DogHouse.add(dog);
        DogHouse.remove(dog.getId());
        //Then
        Assert.assertEquals(0, (int)DogHouse.getNumberOfDogs());

        DogHouse.clear();
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        //Given
        Dog dog = AnimalFactory.createDog("Duke", birthDate);
        //When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        //Then
        Assert.assertEquals(0, (int)DogHouse.getNumberOfDogs());

        DogHouse.clear();
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        //Given
        Dog dog = AnimalFactory.createDog("Duke", birthDate);
        //When
        DogHouse.add(dog);
        DogHouse.getDogById(dog.getId());
        //Then
        Assert.assertEquals(1, (int)DogHouse.getNumberOfDogs());

        DogHouse.clear();
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberofDogsTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        //Given
        Dog dog = AnimalFactory.createDog("Duke", birthDate);
        //When
        DogHouse.add(dog);
        //Then
        Assert.assertEquals(1, (int)DogHouse.getNumberOfDogs());

        DogHouse.clear();
    }

    @Test
    public void testGetNumberOfDogs() {


        // Given (some
        String name = "Duke";
        Date birthDate = new Date(2022 - 1900, 5, 20);
        Dog animal = AnimalFactory.createDog(name, birthDate);
        // When
        DogHouse.add(animal);
        // Then
        DogHouse.getNumberOfDogs();

        DogHouse.clear();
    }
}
