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
    @Test
    public void newDogTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        Dog dog = AnimalFactory.createDog("Dog", birthDate);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }

    // TODO - Create tests for `speak`
    @Test
    public void dogSpeakTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        Dog dog = AnimalFactory.createDog("Duke", birthDate);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void dogSetBirthDateTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        Dog dog = AnimalFactory.createDog("Dog", birthDate);
        Date actual = dog.getBirthDate();
        dog.setBirthDate(birthDate);
        Assert.assertEquals(birthDate, actual);

        DogHouse.clear();
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void dogEatTest() {

        Dog dog = AnimalFactory.createDog("Dog", null);
        Integer expected = 1;
        dog.eat(new Food());
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void dogGetIdTest() {

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void dogAnimalInheritanceTest() {

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void dogMammalInheritanceTest() {

    }
}