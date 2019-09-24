import java.util.Arrays;
 import org.junit.*;
 import static org.junit.Assert.*;
 import org.sql2o.*;
// import java.sql.Timestamp;
// import java.util.Date;
// import java.text.DateFormat;

 public class AnimalTest {

//   @Rule
//   public DatabaseRule database = new DatabaseRule();

//   @Test
//   public void Animal_instantiatesCorrectly_true() {
//     Animal testAnimal = new Animal("wolf", 1);
//     assertEquals(true, testAnimal instanceof Animal);
//   }
//
//   @Test
//   public void Animal_instantiatesWithName_String() {
//     Animal testAnimal = new Animal("wolf", 1);
//     assertEquals("wolf", testAnimal.getrangername());
//   }
//
//   @Test
//   public void Animal_instantiatesWithId_int() {
//     Animal testAnimal = new Animal("wolf", 1);
//     assertEquals(1, testAnimal.getid());
//   }
//
//   @Test
//   public void equals_returnsTrueIfNameAndIdAreSame_true() {
//     Animal testAnimal = new Animal("wolf", 1);
//     Animal anotherAnimal = new Animal("wolf", 1);
//     assertTrue(testAnimal.equals(anotherAnimal));
//   }
// @Test
// public void save_savesIdIntoDB_true() {
//         testAnimal = new Animal("wolf", 1);
//         test.save();
//         Animal testAnimal = new Animal("wolf", test.getId());
//         testAnimal.save();
//         Animal savedAnimal = Animal.find(testAnimal.getid());
//         assertEquals(savedAnimal.getid(), test.getId());
//         }
//
//         }
//
//   @Test
//   public void find_returnsAnimalWithSameId_secondAnimal() {
//     Animal firstAnimal = new Animal("wolf", 1);
//     firstAnimal.save();
//     Animal secondAnimal = new Animal("tiger", 2);
//     secondAnimal.save();
//     assertEquals(Animal.find(secondAnimal.getid()), secondAnimal);
//   }
//@Test
//public void getAnimals_retrievesAllAnimalsFromDatabase_AnimalsList() {
//    Animal testAnimal = new Animal("wolf", 1);
//        testAnimal.save();
//    Sighting firstSighting = new Sighting("tiger", testAnimal.get id());
//        firstSighting.save();
//    Sighting secondSighting = new Sighting("elephent", testAnimal.getid());
//        secondSighting.save();
//    Sighting[] Sightings = new Sighting[] { firstSighting, secondSighting };
//        assertTrue(testAnimal.getSightings().containsAll(Arrays.asList(Sightings)));
//        }
 }