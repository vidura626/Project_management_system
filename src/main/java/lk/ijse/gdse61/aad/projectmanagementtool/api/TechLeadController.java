package lk.ijse.gdse61.aad.projectmanagementtool.api;

import lk.ijse.gdse61.aad.projectmanagementtool.dto.TechLeadDto;
import lk.ijse.gdse61.aad.projectmanagementtool.service.TechLeadService;
import lk.ijse.gdse61.aad.projectmanagementtool.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/techLead")
public class TechLeadController {

    private TechLeadService techLeadService;

    @Autowired
    public TechLeadController(TechLeadService techLeadService) {
        this.techLeadService = techLeadService;
    }

    @GetMapping(path = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllTechLeads() {
        return new ResponseUtil(200, "Success", techLeadService.getAllTechLeads());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getTechLead(String id) {
        return new ResponseUtil(200, "found", techLeadService.getTechLead(id));
    }

    @PostMapping
    private ResponseUtil save(TechLeadDto techLeadDto) {
        techLeadService.save(techLeadDto);
        return new ResponseUtil(200, "Saved", techLeadDto);
    }

    @PutMapping
    private ResponseUtil update(TechLeadDto techLeadDto) {
        techLeadService.update(techLeadDto);
        return new ResponseUtil(200, "Updated", techLeadDto);
    }

    @DeleteMapping
    private ResponseUtil delete(String id) {
        techLeadService.delete(id);
        return new ResponseUtil(200, "Deleted", id);
    }

}
