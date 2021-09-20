package com.example.wttech.basicrestapi.repo;

import com.example.wttech.basicrestapi.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {

    Unit findByName(String name);
    Unit findById(long id);
}
