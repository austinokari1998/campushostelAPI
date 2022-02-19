package com.hostelmanagement.hostelmanagement.hostels;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface hostelrepository extends JpaRepository<hostelmodels,String>{
    
    

    hostelmodels findByName(String hostelname);
    void deleteByName(String hostelname);

    

    
}


