
import org.junit.*;
        import static org.junit.Assert.*;
        import org.sql2o.*;

import java.sql.SQLException;

public class SightingTest {

//    @Rule
//    public DatabaseRule database = new DatabaseRule();
//
//    @Test
//    public void Sighting_instantiatesCorrectly_true() {
//        Sighting testSighting = new Sighting("panter", "kibuye",1);
//        assertEquals(true, testSighting instanceof Sighting);
//    }
//
//    @Test
//    public void Sighting_instantiatesWithName_String() {
//        Sighting testSighting = new Sighting("elephent", "kigali",2);
//        assertEquals("elephent", testSighting.getrangername());
//    }
//
//    @Override
//    public boolean equals(Object otherSighting) {
//        if (!(otherSighting instanceof Sighting)) {
//            return false;
//        } else {
//            Sighting newSighting = (Sighting) otherSighting;
//            return this.getrangername().equals(newSighting.getrangername()) &&
//                    this.getAnimalid() == newSighting.getAnimalid();
//
//        }
//    }
//
//    @Test
//    public void save_returnsTrueIfDescriptionsAretheSame() {
//        Sighting testSighting = new Sighting("elephent", "kigali", 3);
//        testSighting.save();
//        assertTrue(Sighting.all().get(0).equals(testSighting));
//    }
//
//    @Test
//    public void save_assignsIdToSighting() {
//        Sighting testSighting = new Sighting("elephant", "musanze", 4);
//        testSighting.save();
//        Sighting savedSighting = Sighting.all().get(0);
//        assertEquals(savedSighting.getAnimalid(), testSighting.getAnimalid());
//    }
//
//    @Test
//    public void all_returnsAllInstancesOfSighting_true() {
//        Sighting firstSighting = new Sighting("elephant", "kibuye", 5);
//        firstSighting.save();
//        Sighting secondSighting = new Sighting("elephant", "mutara", 6);
//        secondSighting.save();
//        assertEquals(true, Sighting.all().get(0).equals(firstSighting));
//        assertEquals(true, Sighting.all().get(1).equals(secondSighting));
//    }
//
//    @Test
//    public void find_returnsSightingWithSameId_secondSighting() {
//        Sighting firstSighting = new Sighting("elephent", "kigali", 7);
//        firstSighting.save();
//        Sighting secondSighting = new Sighting("panter", "kigsli", 8);
//        secondSighting.save();
//        assertEquals(Sighting.find(secondSighting.getid()), secondSighting);
//    }
//
//    @Test
//    public void save_savesAnimalIdIntoDB_true() {
//        Animal testAnimal = new Animal("wolf", 1);
//        try {
//            testAnimal.save();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        Sighting testSighting = new Sighting("wolf", "kigali", 1 testAnimal.getid());
//        testSighting.save();
//        Sighting savedSighting = Sighting.find(testSighting.getid());
//        assertEquals(savedSighting.getAnimalid(), testAnimal.getid());
//    }

}