package com.piyu.springboot.repository;

import com.piyu.springboot.model.CloudVendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CloudVendorRepository extends JpaRepository<CloudVendorEntity,String>  {

}
