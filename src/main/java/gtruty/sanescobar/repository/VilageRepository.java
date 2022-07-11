package gtruty.sanescobar.repository;

import gtruty.sanescobar.entities.VilageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilageRepository extends JpaRepository<VilageEntity,Integer> {
}
