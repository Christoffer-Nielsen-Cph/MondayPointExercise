package entity;

import javax.persistence.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Open a database connection
        // (create a new database if it doesn't exist yet):
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        Facade facade = new Facade(emf,em);
        // Store 1000 Point objects in the database:
        facade.addPointsToDatabase();
        // Find the number of Point objects in the database:
        facade.amountOfPoints();

        // Find the average X value:


        // Retrieve all the Point objects from the database:


        // Close the database connection:


    }
}
