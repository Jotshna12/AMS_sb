package com.AMS.AMS_sb.service;

import com.AMS.AMS_sb.Dao.Studentdao;
import com.AMS.AMS_sb.Studentinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Service
public class studentservice {

    @Autowired
    Studentdao studentdao;

    public List<Studentinfo> getallstudents() {

        return studentdao.findAll() ;
    }
}
