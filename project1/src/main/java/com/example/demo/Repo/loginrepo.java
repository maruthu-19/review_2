package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.modlogin;

@Repository
public interface loginrepo extends JpaRepository<modlogin,String> 
{
    modlogin findByuname(String uname);
}