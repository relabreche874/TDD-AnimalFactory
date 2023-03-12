package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        Dog dog = AnimalFactory.createDog("Dog", birthDate);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        Cat cat = AnimalFactory.createCat("Mia", birthDate);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);

    }
}
