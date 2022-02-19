package com.hostelmanagement.hostelmanagement.hostels;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class hostelservice {
    @Autowired
    private hostelrepository hostelrepo;
    public List<hostelmodels> getallhostels() {
        List<hostelmodels> hostels=new ArrayList<>();
        hostelrepo.findAll()
       .forEach(hostels::add);
       return hostels;
        
    }
    public hostelmodels gethostel(String hostelname) {

      return  hostelrepo.findById(hostelname).get();
    }
    public void hosteladder(hostelmodels hostel) {
        hostelrepo.save(hostel);
    }
    public void deletehostel(String hostelname, hostelmodels hostel) {
        hostelrepo.deleteById(hostelname);
        
    }
    public void updatehostel(hostelmodels hostel, String hostelname){
        hostelrepo.save(hostel);

    }

    
}
