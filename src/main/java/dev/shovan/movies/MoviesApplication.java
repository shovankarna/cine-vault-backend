package dev.shovan.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {

		////Load the .env file
		Dotenv dotenv = Dotenv.configure()
            .directory(".env") // The directory where your .env file is located
            .load();

        // Set properties from .env values
        System.setProperty("mongo.databse", dotenv.get("MONGO_DATABASE"));
        System.setProperty("mongo.user", dotenv.get("MONGO_USER"));
		System.setProperty("mongo.password", dotenv.get("MONGO_PASSWORD"));
		System.setProperty("mongo.cluster", dotenv.get("MONGO_CLUSTER"));

		SpringApplication.run(MoviesApplication.class, args);
	}

}
