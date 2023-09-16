package lk.ijse.gdse61.aad.projectmanagementtool.service;

import lk.ijse.gdse61.aad.projectmanagementtool.dto.TechLeadDto;
import lk.ijse.gdse61.aad.projectmanagementtool.entity.TechLead;

import java.util.List;

public interface TechLeadService {
    public void save(TechLeadDto techLeadDto);
    public TechLeadDto getTechLead(String id);
    public void update(TechLeadDto techLeadDto);
    public void delete(String id);
    public List<TechLeadDto> getAllTechLeads();

}
