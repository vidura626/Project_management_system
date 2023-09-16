package lk.ijse.gdse61.aad.projectmanagementtool.service.custom;

import lk.ijse.gdse61.aad.projectmanagementtool.dto.TechLeadDto;
import lk.ijse.gdse61.aad.projectmanagementtool.entity.TechLead;
import lk.ijse.gdse61.aad.projectmanagementtool.repository.TechLeadRepository;
import lk.ijse.gdse61.aad.projectmanagementtool.service.TechLeadService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TechLeadServiceImpl implements TechLeadService {

    private TechLeadRepository repository;
    private ModelMapper mapper;

    @Autowired
    public TechLeadServiceImpl(TechLeadRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void save(TechLeadDto techLeadDto) {
        if (repository.existsById(techLeadDto.getId())) {
            repository.save(mapper.map(techLeadDto, TechLead.class));
        } else {
            throw new RuntimeException("TechLead already exists");
        }
    }

    @Override
    public TechLeadDto getTechLead(String id) {
        if (repository.existsById(id)) {
            return mapper.map(repository.findById(id).get(), TechLeadDto.class);
        } else {
            throw new RuntimeException("TechLead not found");
        }
    }

    @Override
    public void update(TechLeadDto techLeadDto) {
        if (repository.existsById(techLeadDto.getId())) {
            repository.save(mapper.map(techLeadDto, TechLead.class));
        } else {
            throw new RuntimeException("TechLead not found");
        }
    }

    @Override
    public void delete(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("TechLead not found");
        }
    }

    @Override
    public List<TechLeadDto> getAllTechLeads() {
        return mapper.map(repository.findAll(), new TypeToken<List<TechLeadDto>>() {
        }.getType());
    }
}
