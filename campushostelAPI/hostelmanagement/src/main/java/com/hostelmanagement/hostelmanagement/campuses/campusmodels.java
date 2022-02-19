package com.hostelmanagement.hostelmanagement.campuses;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hostelmanagement.hostelmanagement.hostels.hostelmodels;



@Entity
@Table(name = "campuses_available")

public class campusmodels  {
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    @Id

    private Integer campusid;


    @Column(name = "campusname")
    

    private String campusname;
    @Column(name = "campuscustodian")
    private String campuscustodian;
    @OneToMany(cascade = CascadeType.ALL)

    
    private List<hostelmodels> hostels=new ArrayList<>();
    
    public campusmodels(){

    }
    public campusmodels(Integer campusid, String hostelname, String hostelcustodian,List<hostelmodels> hostels) {
        this.campusid=campusid;
        this.campusname = hostelname;
        this.campuscustodian = hostelcustodian;
        this.hostels=hostels;

    }
    public Integer getCampusid() {
        return campusid;
    }
    public void setCampusid(Integer campusid) {
        this.campusid = campusid;
    }
    public String getCampusname() {
        return campusname;
    }
    public void setCampusname(String campusname) {
        this.campusname = campusname;
    }
    public String getCampuscustodian() {
        return campuscustodian;
    }
    public void setCampuscustodian(String campuscustodian) {
        this.campuscustodian = campuscustodian;
    }
    public List<hostelmodels> getHostels() {
        return hostels;
    }
    public void setHostels(List<hostelmodels> hostels) {
        this.hostels = hostels;
    }
  
}
    