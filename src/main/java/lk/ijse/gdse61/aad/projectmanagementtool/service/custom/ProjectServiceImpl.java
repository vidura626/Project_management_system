package lk.ijse.gdse61.aad.projectmanagementtool.service.custom;

import lk.ijse.gdse61.aad.projectmanagementtool.dto.ProjectDto;
import lk.ijse.gdse61.aad.projectmanagementtool.entity.Project;
import lk.ijse.gdse61.aad.projectmanagementtool.repository.ProjectRepository;
import lk.ijse.gdse61.aad.projectmanagementtool.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    private ProjectRepository repository;
    private ModelMapper mapper;

    @Autowired
    public ProjectServiceImpl(ProjectRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ProjectDto getProject(String id) {
        return mapper.map(repository.findById(id).get(), ProjectDto.class);
    }

    @Override
    public List<ProjectDto> getAllProjects() {
        return mapper.map(repository.findAll(), new TypeToken<List<ProjectDto>>() {
        }.getType());
    }

    @Override
    public void save(ProjectDto projectDto) {
        if (!repository.existsById(projectDto.getId())) {
            repository.save(mapper.map(projectDto, Project.class));
        } else {
            throw new RuntimeException("Project already exists");
        }
    }

    @Override
    public void update(ProjectDto projectDto) {
        if (repository.existsById(projectDto.getId())) {
            repository.save(mapper.map(projectDto, Project.class));
        } else {
            throw new RuntimeException("Project not found");
        }
    }

    @Override
    public void delete(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Project not found");
        }
    }
}
