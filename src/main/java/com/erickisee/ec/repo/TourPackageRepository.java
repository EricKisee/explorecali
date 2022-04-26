package com.erickisee.ec.repo;

import java.util.Optional;

import com.erickisee.ec.domain.*;
import org.springframework.data.repository.CrudRepository;

/**
 * Tour Package Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    Optional<TourPackage> findByName(String name);

}