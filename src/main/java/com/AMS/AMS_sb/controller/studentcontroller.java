package com.AMS.AMS_sb.controller;


import com.AMS.AMS_sb.Studentinfo;
import com.AMS.AMS_sb.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class studentcontroller {

    @Autowired
    studentservice studentservice;
    @GetMapping("allstudents")
    public List<Studentinfo> getallstudents(){
        studentcontroller studenserv;
        return (List<Studentinfo>) studentservice .getallstudents();

    }
}
