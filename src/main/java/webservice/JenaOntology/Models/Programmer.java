package webservice.JenaOntology.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Programmer {

    private String name;
    private String email;

    public Programmer(){
        this.name = "";
        this.email = "";
    }
}
