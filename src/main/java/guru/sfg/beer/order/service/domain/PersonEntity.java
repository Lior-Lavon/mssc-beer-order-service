package guru.sfg.beer.order.service.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


//@Entity
@Table(name = "person", schema = "test")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "age")
    private int age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personid")
    private List<ProjectEntity> projects = new ArrayList<ProjectEntity>();

    public void addToProjects(ProjectEntity project) {
        project.setPersonid(this);
        this.projects.add(project);
    }}
