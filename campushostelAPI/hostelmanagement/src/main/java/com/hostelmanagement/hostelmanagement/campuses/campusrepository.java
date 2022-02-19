package com.hostelmanagement.hostelmanagement.campuses;




import org.springframework.data.jpa.repository.JpaRepository;

public interface campusrepository extends JpaRepository<campusmodels,String>{
    

  campusmodels findByName(String campusname);
    void deleteByName(String campusname);
    

    
}


