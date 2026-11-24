package com.project.my_app.repo;

import com.project.my_app.domain.PnrNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPnrNumberRepo extends JpaRepository<PnrNumber, Long> {
}
