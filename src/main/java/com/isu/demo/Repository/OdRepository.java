package com.isu.demo.Repository;

import com.isu.demo.Model.OverdraftAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OdRepository extends JpaRepository<Long, OverdraftAccount> {
}
