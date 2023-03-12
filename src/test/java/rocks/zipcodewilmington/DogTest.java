package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test void newDogTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        Dog dog = AnimalFactory.createDog("Dog", birthDate);
        String expected = "ruff";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }

    // TODO - Create tests for `speak`
    @Test void dogSpeakTest() {



    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test void dogSetBirthDateTest() {

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test void dogEatTest() {

    }

    // TODO - Create tests for `Integer getId()`
    @Test void dogGetIdTest() {

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test void dogAnimalInheritanceTest() {

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test void dogMammalInheritanceTest() {

    }

}
