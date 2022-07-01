package main.com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.com.company.model.Equipment;
import main.com.company.view.IOView;
import org.json.JSONObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		SpringApplication.run(DemoApplication.class, args);
		IOView.mainLoopView();

	}


}
