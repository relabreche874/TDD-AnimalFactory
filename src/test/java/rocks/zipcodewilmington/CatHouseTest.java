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
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        Date birthDate = new Date(2022 - 1900, 5, 20);

        //Given
        Cat cat = AnimalFactory.createCat("Mia", birthDate);

        //When
        CatHouse.add(cat);

        //Then
        Assert.assertEquals(1, (int)CatHouse.getNumberOfCats());

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIntTest() {
        Date birthDate = new Date(2022 - 1900, 5, 20);

        //Given
        Cat cat = AnimalFactory.createCat("Mia", birthDate);

        //When
        CatHouse.add(cat);
        CatHouse.remove(cat.getId());

        //Then
        Assert.assertEquals(0, (int)CatHouse.getNumberOfCats());

    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCat() {
        Date birthDate = new Date(2022 - 1900, 5, 20);

        //Given
        Cat cat = AnimalFactory.createCat("Mia", birthDate);

        //When
        CatHouse.add(cat);
        CatHouse.remove(cat);

        //Then
        Assert.assertEquals(0, (int)CatHouse.getNumberOfCats());

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        Date birthDate = new Date(2022 - 1900, 5, 20);

        //Given
        Cat cat = AnimalFactory.createCat("Mia", birthDate);

        //When
        CatHouse.add(cat);
        CatHouse.getCatById(cat.getId());
        //CatHouse.remove(CatHouse.getCatById(1));


        //Then
        Assert.assertEquals(1, (int)CatHouse.getNumberOfCats());

    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        Date birthDate = new Date(2022 - 1900, 5, 20);

        //Given
        Cat cat = AnimalFactory.createCat("Mia", birthDate);

        //When
        CatHouse.add(cat);
        //CatHouse.remove(cat);

        //Then
        Assert.assertEquals(1, (int)CatHouse.getNumberOfCats());


    }

}
