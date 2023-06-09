package webservice.JenaOntology.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Video {

    private String artifactName;
    private String artifactLocation;
    private String artifactFormat;
    private List<String> artifactTags;
    private String isMadeBy;
    private String hasUsedIn;
    private String hasTaggedBy;
    private String isUsedBy;

    public Video(){
        this.artifactName = "";
        this.artifactLocation = "";
        this.artifactFormat = "";
        this.artifactTags = new ArrayList<String>();
        this.isMadeBy = "";
        this.hasUsedIn = "";
        this.hasTaggedBy = "";
        this.isUsedBy = "";
    }
}
