package webservice.JenaOntology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import webservice.JenaOntology.Models.Programmer;
import webservice.JenaOntology.Models.Video;
import webservice.JenaOntology.Services.ProgrammerService;
import webservice.JenaOntology.Services.VideoService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WebserviceOntologyApplication {



	public static void main(String[] args) {
		SpringApplication.run(WebserviceOntologyApplication.class, args);

		/*ProgrammerService programmerService = new ProgrammerService();

		List<Programmer> programmers = programmerService.getProgrammers();

		for (Programmer programmer: programmers) {
			System.out.println(programmer.getName() + " mail: " + programmer.getEmail());
		}*/

        VideoService videosService = new VideoService();
        ArrayList<Video> videosList = videosService.getVideosList();
        System.out.println("Videos list: ");
        for (Video video: videosList) {
            System.out.println("ArtifactLocation: "+video.getArtifactLocation() + " ArtifactFormat: "+video.getArtifactFormat() + " IsMadeBy: "+video.getIsMadeBy() + " HasUsedIn: "+video.getHasUsedIn() + " HasTaggedBy: "+video.getHasTaggedBy() + " IsUsedBy: "+video.getIsUsedBy());
        }

//        Video video1 = new Video();
//        video1.setArtifactName("videoJena01");
//        video1.setArtifactLocation("C:\\Users\\jose\\Desktop\\video1.mp4");
//        video1.setArtifactFormat("mp4");
//        video1.setIsMadeBy("River");
//        video1.setHasUsedIn("Project_One");
//        video1.setHasTaggedBy("River");
//        video1.setIsUsedBy("River");
//        videosService.insertVideo(video1);

	}

}
