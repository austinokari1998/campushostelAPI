package com.hostelmanagement.hostelmanagement.hostels;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hostelmanagement.hostelmanagement.campuses.campusmodels;

@Entity
@Table(name = "hostels_available")

public class hostelmodels {
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Id

    private Integer hostelid;


    @Column(name="hostelname")
    private String hostelname;
    @Column(name="hostelcustodian")
    private String hostelcustodian;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="campus_id")
    private campusmodels campus_id;
  
    public hostelmodels(){

    }
    public hostelmodels(Integer hostelid, String hostelname, String hostelcustodian) {
        this.hostelid = hostelid;
        this.hostelname = hostelname;
        this.hostelcustodian = hostelcustodian;
    }
    public Integer getHostelid() {
        return hostelid;
    }
    public void setHostelid(Integer hostelid) {
        this.hostelid = hostelid;
    }
    public String getHostelname() {
        return hostelname;
    }
    public void setHostelname(String hostelname) {
        this.hostelname = hostelname;
    }
    public String getHostelcustodian() {
        return hostelcustodian;
    }
    public void setHostelcustodian(String hostelcustodian) {
        this.hostelcustodian = hostelcustodian;
    }

    
    
}
