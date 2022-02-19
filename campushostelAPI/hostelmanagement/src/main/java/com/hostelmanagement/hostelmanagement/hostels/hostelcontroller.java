package com.hostelmanagement.hostelmanagement.hostels;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hostelcontroller {
    @Autowired
    private hostelservice hostelserve;

    @RequestMapping(value = "/hostels", method = RequestMethod.GET)
    public List<hostelmodels> totalhostels(){
       return hostelserve.getallhostels();


    }
    @RequestMapping(value = "/hostels/{hostelname}", method = RequestMethod.GET)
    public hostelmodels gethostel(@PathVariable String hostelname){
        return hostelserve.gethostel(hostelname);

    }
    
    @GetMapping(value = "/hostel")
    public void hosteladder(@RequestBody hostelmodels hostel){
        hostelserve.hosteladder(hostel);
    }
    
    @RequestMapping(value ="/hostels/{hostelname}" , method = RequestMethod.DELETE)
    public void hostelremover(@RequestBody hostelmodels hostel, @PathVariable  String hostelname){

    hostelserve.deletehostel(hostelname, hostel);


    }
    @RequestMapping(value = "/hostels/{hostelname}", method = RequestMethod.PUT)
    public void updatehostel(@PathVariable String hostelname, @RequestBody hostelmodels hostel){

    hostelserve.updatehostel(hostel, hostelname);

    }

}



