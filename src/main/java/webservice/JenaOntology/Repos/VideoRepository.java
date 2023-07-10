package webservice.JenaOntology.Repos;

import org.springframework.stereotype.Repository;
import webservice.JenaOntology.DTOs.VideoTaggedDTO;
import webservice.JenaOntology.Models.Tag;
import webservice.JenaOntology.Models.Video;

import java.util.List;

@Repository
public interface VideoRepository {

    List<VideoTaggedDTO> findVideos();

    void createVideo(Video video);

    void insertTag(Tag tag);

    List<VideoTaggedDTO> findVideosByTag(String tag);

}
