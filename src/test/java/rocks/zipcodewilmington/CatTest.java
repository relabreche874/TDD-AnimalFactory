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
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        Cat cat = new Cat("Mia", birthDate, null);
        String name = "Mia";
        cat.setName(name);
        String catName = cat.getName();
        Assert.assertEquals(catName, name);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        Cat cat = AnimalFactory.createCat("Dog", birthDate);
        String expected = "bark!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();

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

        Cat cat = AnimalFactory.createCat("Mia", null);
        Integer expected = 1;
        cat.eat(new Food());
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);

        DogHouse.clear();
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void catGetIdTest() {

        Date birthDate = new Date(2022 - 1900, 5, 20);
        //Given
        Cat cat = AnimalFactory.createCat("Mia", birthDate);
        //When
        CatHouse.add(cat);
        CatHouse.getCatById(cat.getId());

        //Then
        Assert.assertEquals(1, (int)CatHouse.getNumberOfCats());

        DogHouse.clear();
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