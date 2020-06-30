package guru.sfg.beer.order.service.domain;

import javax.persistence.*;

//@Entity
@Table(name = "project", schema = "test")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "budget")
    private int budget;

    @JoinColumn(name = "personid", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private PersonEntity personid;

    public void setPersonid(PersonEntity personid) {
        this.personid = personid;
    }
}
