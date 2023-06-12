package webservice.JenaOntology.Controllers;


import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservice.JenaOntology.Models.Video;
import webservice.JenaOntology.Services.VideoService;

import java.util.List;

@RestController
@RequestMapping("/videotagger")
public class VideoController {

    @Autowired
    private VideoService videoService;


    @GetMapping("/videos")
    public ResponseEntity<List<Video>> getVideos() {

        List<Video> videos = videoService.getVideosList();

        return ResponseEntity.ok(videos);
    }

    @PostMapping("/videos/save")
    public ResponseEntity<Video> saveVideo(@RequestBody Video video){
        videoService.insertVideo(video);
        return ResponseEntity.status(HttpStatus.CREATED).body(video);
    }


}
