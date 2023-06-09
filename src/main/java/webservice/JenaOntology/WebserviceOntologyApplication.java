package webservice.JenaOntology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import webservice.JenaOntology.Models.Programmer;
import webservice.JenaOntology.Models.Video;
import webservice.JenaOntology.Repos.RepositoryConfig;
import webservice.JenaOntology.Services.ProgrammerService;
import webservice.JenaOntology.Services.VideoService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WebserviceOntologyApplication {



	public static void main(String[] args) {
		SpringApplication.run(WebserviceOntologyApplication.class, args);

	}



}
