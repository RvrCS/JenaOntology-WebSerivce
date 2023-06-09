package webservice.JenaOntology.Repos;

import org.springframework.stereotype.Repository;
import webservice.JenaOntology.Models.Video;

import java.util.List;

@Repository
public interface VideoRepository {

    List<Video> findVideos();
    void createVideo(Video video);
}
