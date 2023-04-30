package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.*;

@Repository
public interface detailsrepo  extends JpaRepository<moddetails,Integer>
{

}