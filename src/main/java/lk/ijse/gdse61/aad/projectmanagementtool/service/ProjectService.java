package lk.ijse.gdse61.aad.projectmanagementtool.service;

import lk.ijse.gdse61.aad.projectmanagementtool.dto.ProjectDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProjectService {
    public ProjectDto getProject(String id);
    public List<ProjectDto> getAllProjects();
    public void save(ProjectDto projectDto);
    public void update(ProjectDto projectDto);
    public void delete(String id);
}
