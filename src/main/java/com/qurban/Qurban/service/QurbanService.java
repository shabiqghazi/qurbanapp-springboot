/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qurban.Qurban.service;

import com.qurban.Qurban.domain.Qurban;
import com.qurban.Qurban.repository.QurbanRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Shabiq
 */
@Service
public class QurbanService {
    @Autowired
    private QurbanRepository repo;
	
    public List<Qurban> listAll() {
        System.out.println("List All");
        return repo.findAll();
    }
     
    public void save(Qurban std) {
        System.out.println("Save");
        repo.save(std);
    }
     
    public Qurban get(long id) {
        System.out.println("Get");
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        System.out.println("Delete");
        repo.deleteById(id);
    }
}
