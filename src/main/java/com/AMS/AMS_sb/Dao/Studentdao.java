package com.AMS.AMS_sb.Dao;

import com.AMS.AMS_sb.Studentinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Studentdao extends JpaRepository<Studentinfo,Integer> {


}
