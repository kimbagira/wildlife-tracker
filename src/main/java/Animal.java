import org.sql2o.Connection;
import java.util.List;


public class Animal{
    private String Name;
    private int id;


    public Animal(String Name){
        this.Name = Name;

    }


    public String getName() {
        return Name;
    }
    public int getid(){
        return id;
    }

    public void save() {
            try(Connection con = DB.sql2o.open()) {
                String sql = "INSERT INTO animals (name) VALUES (:name)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.Name)
                    .executeUpdate()
                    .getKey();
        }
    }

    public static List<Animal> all() {
        String sql = "select * from animals";
        try (Connection con = (Connection) DB.sql2o.open()) {
            return con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Animal.class);

        }
    }

//    public List<Animal> getAnimal() {
//        try (Connection con = (Connection) DB.sql2o.open()) {
//            String sql = "SELECT * FROM Animals where animalid=:id";
//            return ((org.sql2o.Connection) con).createQuery(sql)
//                    .addParameter("id", this.id)
//                    .executeAndFetch(Animal.class);
//
//        }
//    }


}
