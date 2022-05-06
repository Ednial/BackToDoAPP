package com.SofkaU.BackToDoAPP.repository;

import com.SofkaU.BackToDoAPP.entity.DoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoListRepository  extends JpaRepository<DoList, Long> {
}
