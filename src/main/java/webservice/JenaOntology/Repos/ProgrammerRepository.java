package webservice.JenaOntology.Repos;

import org.springframework.stereotype.Repository;
import webservice.JenaOntology.Models.Programmer;

import java.util.List;

@Repository
public interface ProgrammerRepository {
    List<Programmer> findProgrammers();
    void createProgrammer(Programmer programmer);
}
