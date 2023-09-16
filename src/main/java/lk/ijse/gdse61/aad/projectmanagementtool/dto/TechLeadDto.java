package lk.ijse.gdse61.aad.projectmanagementtool.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TechLeadDto {
    private String id;
    private String name;
    private String email;
    private String mobile;
    private List<ProjectDto> projects;
}
