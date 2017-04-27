package ua.inf.sviat.springsecurityapp.model;

import javax.persistence.*;


/**
 * Created by Sviatoslav on 24.04.2017.
 */

@Entity
@Table(name = "producerGpu")
public class ProducerGpu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    @OneToMany(mappedBy = "producerGpu")
//    private List<SpecificationGpu> specificationGpus = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<SpecificationGpu> getSpecificationGpus() {
//        return specificationGpus;
//    }
//
//    public void setSpecificationGpus(List<SpecificationGpu> specificationGpus) {
//        this.specificationGpus = specificationGpus;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
