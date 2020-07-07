package main.repository;

import main.domain.SimpleSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleRepository extends JpaRepository<SimpleSource, Integer> {

    SimpleSource findByName(String name);
}
