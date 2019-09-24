import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;
import java.util.List;

public class Sighting{
    private String RangerName;
    private String Location;
    private int AnimalId;

    private int Animal_Id;

    public Sighting (String RangerName, String Location, int AnimalId){
        this.RangerName = RangerName;
        this.Location = Location;
        this.AnimalId = AnimalId;
    }

    public String getRanger(){
        return RangerName;
    }

    public String getLocation(){
        return Location;
    }

    public int getAnimalId(){
        return AnimalId;
    }


    public void save() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO sighting (RangerName, Location, AnimalId) VALUES (:RangerName, :Location, :AnimalId)";
            this.AnimalId = (int) con.createQuery(sql, true)
                    .addParameter("RangerName", this.RangerName)
                    .addParameter("Location", this.Location)
                    .addParameter("AnimalId", this.AnimalId)
                    .executeUpdate()
                    .getKey();
        }
    }

    public static List<Sighting> all() {
        String sql = "select * from sighting";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql)
                    .executeAndFetch(Sighting.class);
        }
    }

    public List<Sighting> getSighting() {
        try (Connection con = (Connection) DB.sql2o.open()) {
            String sql = "SELECT * FROM EndengeredAnimal where EndengeredAnimalId=:IdEndengered";
            return ((org.sql2o.Connection) con).createQuery(sql)
                    .addParameter("Id", this.Animal_Id)
                    .executeAndFetch(Sighting.class);

        }
    }

}