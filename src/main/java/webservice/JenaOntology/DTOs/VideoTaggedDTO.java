package webservice.JenaOntology.DTOs;

import lombok.*;
import webservice.JenaOntology.Models.TagTimestamp;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class VideoTaggedDTO {


    private String artifactLocation;

    private List<TagTimestamp> artifactTagsTimestamp;

    public VideoTaggedDTO(){
        this.artifactTagsTimestamp = new ArrayList<>();
    }

    public void setArtifactTagsTimestamp(TagTimestamp tagsTiemstamp){
        this.artifactTagsTimestamp.add(tagsTiemstamp);
    }

}
