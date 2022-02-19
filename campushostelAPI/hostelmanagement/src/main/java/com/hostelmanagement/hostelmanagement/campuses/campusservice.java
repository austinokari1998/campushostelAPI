package com.hostelmanagement.hostelmanagement.campuses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class campusservice  {
    @Autowired
    private campusrepository campusrepo;
    public List<campusmodels> getallcampuses(String hostelname) {
        List<campusmodels> campuses=new ArrayList<>();
        campusrepo.findAll()
       .forEach(campuses::add);
       return campuses;
        
    }
    public campusmodels getcampus(String campusname) {

      return  campusrepo.findByName(campusname);
    }
    public void campusadder(campusmodels campus) {
        campusrepo.save(campus);
    }
    public void deletecampus(String campusname, campusmodels campus) {
        campusrepo.deleteByName(campusname);
        
    }
    public void updatecampus(campusmodels campus, String campusname){
        campusrepo.save(campus);

    }

    
}
