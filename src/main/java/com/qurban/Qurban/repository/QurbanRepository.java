/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qurban.Qurban.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qurban.Qurban.domain.Qurban;

/**
 *
 * @author Shabiq
 */
@Repository
public interface QurbanRepository extends JpaRepository<Qurban, Long> {

   
}
