package webservice.JenaOntology.Controllers;


import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import webservice.JenaOntology.Services.VideoService;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;


    @GetMapping("/videos")
    public String getVideos() {
        return videoService.getVideosList().toString();
    }
}
