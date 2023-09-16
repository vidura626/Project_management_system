package lk.ijse.gdse61.aad.projectmanagementtool.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TechLead implements Serializable {
    @Id
    private String id;
    private String name;
    private String email;
    private String mobile;
    @OneToMany(mappedBy = "techLead", targetEntity = Project.class)
    private List<Project> projects;
}
