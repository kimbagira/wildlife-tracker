import java.util.List;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;
//import spark.template.velocity.VelocityTemplateEngine;


public class App{
    public static void main(String[] args){
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }
        setPort(port);


        staticFileLocation("/public");
        String layout = "/layout.hbs";

        get("/", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("templates", "index.hbs");
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


        get("/homepage", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("templates", "home.hbs");
            return new ModelAndView(model, "home.hbs");
        }, new HandlebarsTemplateEngine ());
        get("/details", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();

            return new ModelAndView(model, "details.hbs");
        }, new HandlebarsTemplateEngine ());


        post("/details", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("Name");

            Animal newAnimal = new Animal(  name);
            newAnimal.save();
            return new ModelAndView(model, "details.hbs");
        }, new  HandlebarsTemplateEngine());

        get("/animals", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            List<Animal> animals=Animal.all();
            model.put("animals", animals);
            return new ModelAndView(model, "animals.hbs");
        }, new HandlebarsTemplateEngine ());


        post("/endangered", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String EndangeredName = request.queryParams("EndangeredName");
            String Health = request.queryParams("Health");
            int Age=Integer.parseInt(request.queryParams("Age"));
            int IdEndangered=Integer.parseInt(request.queryParams("IdEndangered"));
            model.put("EndangeredName",EndangeredName);
            model.put("Health",Health);
            model.put("Age",Age);
            model.put("IdEndangered",IdEndangered);
//            EndangeredAnimal newEndangeredAnimal = new EndangeredAnimal(EndangeredName, Health, Age, IdEndangered);
//            newEndangeredAnimal.save();
            return new ModelAndView(model, "details1.hbs");
        }, new  HandlebarsTemplateEngine());

        get("/endangered", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            List<EndangeredAnimal> endangered=EndangeredAnimal.all();
            model.put("endangered", endangered);
            return new ModelAndView(model, "endangered.hbs");
        }, new HandlebarsTemplateEngine ());


        get("/sighting", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
//            List<Sighting> sighting=Sighting.all();
//            model.put("sighting", sighting);
            return new ModelAndView(model, "sighting.hbs");
        }, new HandlebarsTemplateEngine ());

        post("/sighting", (request, respond) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String RangerName = request.queryParams("RangerName");
            String Location = request.queryParams("Location");
            int AnimalId=Integer.parseInt(request.queryParams("AnimalId"));
            model.put("RangerName",RangerName);
            model.put("Location",Location);
            model.put("AnimalId",AnimalId);
            Sighting newSighting = new Sighting( RangerName, Location,AnimalId);
            newSighting.save();


            return new ModelAndView(model, "details2.hbs");
        }, new  HandlebarsTemplateEngine());




    }
}