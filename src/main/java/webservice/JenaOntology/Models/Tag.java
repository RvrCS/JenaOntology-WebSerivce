package webservice.JenaOntology.Models;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tag {

    public Tag(String artifactTag) {
        this.artifactTag = artifactTag;
    }

    private String artifactTag;

    private String timestamp;

    private String url;

}
