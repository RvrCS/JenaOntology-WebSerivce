package webservice.JenaOntology.Services;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.FileManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webservice.JenaOntology.DTOs.VideoTaggedDTO;
import webservice.JenaOntology.Models.Tag;
import webservice.JenaOntology.Models.Video;
import webservice.JenaOntology.Repos.JenaVideoRepository;
import webservice.JenaOntology.Utils.Constants;
import webservice.JenaOntology.Utils.FormatOntologyString;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {



    private JenaVideoRepository jenaVideoRepository;

    public VideoService(){
        jenaVideoRepository = new JenaVideoRepository();
    }

    public List<VideoTaggedDTO> getVideosList(){

        return jenaVideoRepository.findVideos();
    }

    public void insertVideo(Video video) {

        jenaVideoRepository.createVideo(video);
    }

    public List<Video> getVideosListByTag(String tag){
       return jenaVideoRepository.findVideosByTag(tag);
    }

    public void insertTag(Tag tag){
        jenaVideoRepository.insertTag(tag);
    }

}
