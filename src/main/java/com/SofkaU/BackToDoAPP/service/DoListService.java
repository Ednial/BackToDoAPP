package com.SofkaU.BackToDoAPP.service;

import com.SofkaU.BackToDoAPP.entity.DoList;
import com.SofkaU.BackToDoAPP.repository.DoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoListService implements DoListServiceInterface{

    @Autowired
    private DoListRepository doListRepository;
    @Override
    public List<DoList> getAllDoList() {
        return doListRepository.findAll();
    }

    @Override
    public DoList saveDoList(DoList doList) {
        return doListRepository.save(doList);
    }

    @Override
    public DoList updateDoList(DoList doList) {
        return doListRepository.save(doList);
    }

    @Override
    public void deleteList(Long id) {
        doListRepository.deleteById(id);
    }

}
