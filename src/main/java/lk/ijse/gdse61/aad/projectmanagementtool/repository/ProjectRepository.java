package lk.ijse.gdse61.aad.projectmanagementtool.repository;

import lk.ijse.gdse61.aad.projectmanagementtool.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {
}
