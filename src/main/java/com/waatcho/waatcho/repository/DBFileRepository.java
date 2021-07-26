package com.waatcho.waatcho.repository;


import com.waatcho.waatcho.model.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {

    @Query(value = "select id from files", nativeQuery = true)
    List<String> getAllId();

}
