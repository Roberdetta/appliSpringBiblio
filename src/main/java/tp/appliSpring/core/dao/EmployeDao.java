package tp.appliSpring.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tp.appliSpring.core.entity.Abonne;

public interface EmployeDao extends JpaRepository<Abonne,String> {

}
