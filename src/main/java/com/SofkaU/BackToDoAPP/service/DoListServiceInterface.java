package com.SofkaU.BackToDoAPP.service;

import com.SofkaU.BackToDoAPP.entity.DoList;

import java.util.List;

public interface DoListServiceInterface {
    List<DoList> getAllDoList();
    DoList saveDoList(DoList doList);
    DoList updateDoList(DoList doList);
    void deleteList(Long id);
}
