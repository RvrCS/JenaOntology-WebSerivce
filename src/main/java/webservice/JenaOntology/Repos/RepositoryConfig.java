package webservice.JenaOntology.Repos;

import lombok.Getter;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class RepositoryConfig {

    private static RepositoryConfig instance;
    private OntModel ontModel;

    private RepositoryConfig() {
        ontModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
    }

    public static  RepositoryConfig getInstance() {
        if (instance == null) {
            instance = new RepositoryConfig();
        }
        return instance;
    }

    public OntModel getOntModel() {
        return ontModel;
    }


}
