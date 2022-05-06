package com.SofkaU.BackToDoAPP.controller;

import com.SofkaU.BackToDoAPP.entity.DoList;
import com.SofkaU.BackToDoAPP.service.DoListServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class DoListController {
    @Autowired
    private DoListServiceInterface doListServiceInterface;
    @GetMapping("get/doLists")
    public List<DoList> getAllDoList(){
        return doListServiceInterface.getAllDoList();
    }

    @PostMapping("save/doList")
    public DoList saveDoList(@RequestBody DoList doList){
        return doListServiceInterface.saveDoList(doList);
    }
    @PutMapping("update/doList")
    public DoList updateDoList(@RequestBody DoList doList){
        return doListServiceInterface.updateDoList(doList);
    }
    @DeleteMapping("delete/doList/{id}")
    public void deleteDoList(@PathVariable Long id){
        doListServiceInterface.deleteList(id);
    }
}
