package com.wsoft.ptest1.repositories;

import com.wsoft.ptest1.model.entities.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author b.walid
 */
public interface OrganisationRepository extends JpaRepository<Organisation, Long> {

}
