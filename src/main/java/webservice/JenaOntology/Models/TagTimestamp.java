package webservice.JenaOntology.Models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class TagTimestamp {


    private String tag;

    private String timestamp;

    public TagTimestamp(){
        this.tag = "";
        this.timestamp = "";
    }

}
