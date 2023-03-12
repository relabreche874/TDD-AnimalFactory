package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        Cat cat = new Cat(null, null, null);
        String name = "Mia";

        cat.setName(name);

        String catName = cat.getName();
        Assert.assertEquals(catName, name);

    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthdateTest() {
        Date birthDate = new Date(2022 - 1900, 5, 20);//Given
        Cat cat = AnimalFactory.createCat("Mia", birthDate);

        //When
        cat.setBirthDate(birthDate);

        Date actual = cat.getBirthDate();


        //Then
        Assert.assertEquals(birthDate, actual);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {

    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
