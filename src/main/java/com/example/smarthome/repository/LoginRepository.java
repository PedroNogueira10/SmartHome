package com.example.smarthome.repository;

import com.example.smarthome.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Usuario, Long>{
}
