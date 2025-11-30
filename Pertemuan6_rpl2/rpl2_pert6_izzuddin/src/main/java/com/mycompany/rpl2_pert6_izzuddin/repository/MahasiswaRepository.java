/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.rpl2_pert6_izzuddin.repository;

import com.mycompany.rpl2_pert6_izzuddin.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Izza
 */
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Integer> {
    
}
