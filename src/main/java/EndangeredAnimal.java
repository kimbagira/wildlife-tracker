import org.sql2o.Connection;
import java.util.List;
public class EndangeredAnimal{
    private String EndangeredName;
    private String Health;
    private int Age;
    private int IdEndangered;

    private int Endangered_Id;

    public <string> EndangeredAnimal(String EndengeredName, string Health, int Age, int IdEndangered){
        this.EndangeredName = EndengeredName;
        this.Health = (String) Health;
        this.Age= Age;
        this.IdEndangered =IdEndangered;
    }


    public String getRangerName() {
        return EndangeredName;
    }
    public String getHealth() {
        return Health;
    }
    public int getAge() {
        return Age;
    }

    public int getIdEndangered(){
        return IdEndangered;
    }

    public void save() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO endangered(EndangeredName, Health, Age, IdEndangered) VALUES (:EndangeredName,:Health,:Age,:IdEndangered)";
            this.Endangered_Id = (int) con.createQuery(sql, true)
                    .addParameter("EndangeredName", this.EndangeredName)
                    .addParameter("Health", this.Health)
                    .addParameter("Age", this.Age)
                    .addParameter("IdEndangered", this.IdEndangered)
                    .executeUpdate()
                    .getKey();
        }
    }

    public static List<EndangeredAnimal> all() {
        String sql = "select * from endangered";
        try (Connection con = (Connection) DB.sql2o.open()) {
            return con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(EndangeredAnimal.class);

        }
    }


    public List<Sighting> getEndengeredAnimal() {
        try (Connection con = (Connection) DB.sql2o.open()) {
            String sql = "SELECT * FROM endangered where EndangeredAnimalId=:IdEndangered";
            return ((org.sql2o.Connection) con).createQuery(sql)
                    .addParameter("EndangeredAnimalId", this.Endangered_Id)
                    .executeAndFetch(Sighting.class);

        }
    }


}
