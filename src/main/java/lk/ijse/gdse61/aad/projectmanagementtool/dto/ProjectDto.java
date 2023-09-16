package lk.ijse.gdse61.aad.projectmanagementtool.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProjectDto {
    private String id;
    private String name;
    private String description;
    private int members;
    private TechLeadDto techLead;
}
