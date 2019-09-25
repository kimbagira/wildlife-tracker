import java.util.ArrayList;
import java.util.List;


import org.sql2o.*;
import java.util.List;

public class Sighting{
    private String rangername;
    private String location;

private int id;
//    private int Animal_Id;

    public Sighting ( String Location,String RangerName){
        this.rangername = RangerName;
        this.location = Location;

    }

    public String getRanger(){
        return rangername;
    }

    public String getLocation(){
        return location;
    }




    public void save() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO sighting (location,rangername) VALUES (:location, :rangername)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("rangername", this.rangername)
                    .addParameter("location", this.location)
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
//                    .addParameter("Id", this.Animal_Id)
                    .executeAndFetch(Sighting.class);

        }
    }

}