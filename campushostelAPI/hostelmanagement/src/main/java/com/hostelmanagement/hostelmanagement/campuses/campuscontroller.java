package com.hostelmanagement.hostelmanagement.campuses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class campuscontroller {
    @Autowired
    private campusservice campuseserve;

    @GetMapping(value = "/hostels/{hostelname}/campuses")
    public List<campusmodels> totalcampuses(@PathVariable String hostelname){
       return campuseserve.getallcampuses(hostelname);


    }
    @RequestMapping(value = "/hostels/{hostelname}/campuses/{campusname}", method = RequestMethod.GET)
    public campusmodels getcampus(@PathVariable String campusname){
        return campuseserve.getcampus(campusname);

    }
    
    @RequestMapping(value = "/hostels/{hostelname}/campuses", method = RequestMethod.POST)
    public void hosteladder(@RequestBody campusmodels campus){
        campuseserve.campusadder(campus);
    }
    
    @RequestMapping(value ="/hostels/{hostelname}/campuses/{campusname}" , method = RequestMethod.DELETE)
    public void hostelremover(@RequestBody campusmodels campus, @PathVariable  String campusname){

    campuseserve.deletecampus(campusname, campus);


    }
    @RequestMapping(value = "/hostels/{hostelname}/campuses/{campusname}", method = RequestMethod.PUT)
    public void updatehostel(@PathVariable String campusname, @RequestBody campusmodels campus){

    campuseserve.updatecampus(campus, campusname);

    }

}



