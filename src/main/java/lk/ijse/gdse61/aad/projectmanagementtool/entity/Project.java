package lk.ijse.gdse61.aad.projectmanagementtool.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Project implements Serializable {
    @Id
    private String id;
    private String name;
    @Column(name = "`description`")
    private String description;
    private int members;
    @ManyToOne
    private TechLead techLead;
}
