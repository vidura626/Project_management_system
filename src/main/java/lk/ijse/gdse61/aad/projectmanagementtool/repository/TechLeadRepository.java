package lk.ijse.gdse61.aad.projectmanagementtool.repository;

import lk.ijse.gdse61.aad.projectmanagementtool.entity.TechLead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechLeadRepository extends JpaRepository<TechLead, String> {
}
