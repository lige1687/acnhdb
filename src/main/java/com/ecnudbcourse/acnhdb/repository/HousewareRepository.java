package com.ecnudbcourse.acnhdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecnudbcourse.acnhdb.entity.Houseware;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HousewareRepository extends JpaRepository<Houseware, Long> {

    //List<Houseware> findAll();

    //Houseware findById(Integer id);
}
