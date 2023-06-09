package webservice.JenaOntology.Repos;

import webservice.JenaOntology.Models.Programmer;

import java.util.List;

public interface ProgrammerRepository {
    List<Programmer> findProgrammers();
}
