package tp.appliSpring.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tp.appliSpring.core.entity.Emprunt;

public interface EmpruntDao extends JpaRepository<Emprunt, Long>{

}
