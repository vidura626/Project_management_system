package lk.ijse.gdse61.aad.projectmanagementtool.api;

import lk.ijse.gdse61.aad.projectmanagementtool.dto.ProjectDto;
import lk.ijse.gdse61.aad.projectmanagementtool.service.ProjectService;
import lk.ijse.gdse61.aad.projectmanagementtool.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/project")
@CrossOrigin
public class ProjectController {
    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping(path = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAll() {
        ResponseUtil responseUtil = new ResponseUtil(200, "Success", projectService.getAllProjects());
        return responseUtil;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil search(@PathVariable String id) {
        ResponseUtil responseUtil = new ResponseUtil(200, "found", projectService.getProject(id));
        return responseUtil;
    }

    @PostMapping
    private ResponseUtil save(@RequestBody ProjectDto projectDto) {
        projectService.save(projectDto);
        ResponseUtil responseUtil = new ResponseUtil(200, "Saved", null);
        return responseUtil;
    }

    @PutMapping
    private ResponseUtil update(@RequestBody ProjectDto projectDto) {
        projectService.update(projectDto);
        ResponseUtil responseUtil = new ResponseUtil(200, "Updated", null);
        return responseUtil;
    }

    @DeleteMapping(path = "/{id}")
    private ResponseUtil delete(@PathVariable String id) {
        projectService.delete(id);
        ResponseUtil responseUtil = new ResponseUtil(200, "Deleted", null);
        return responseUtil;
    }
}

