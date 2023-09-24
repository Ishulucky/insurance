package com.insurance.Insurance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.Insurance.Repository.InsuranceRepository;
import com.insurance.Insurance.contracts.InsuranceDAO;
import com.insurance.Insurance.model.InsurancePackage;
import com.insurance.Insurance.model.InsuranceUser;


@RestController
@RequestMapping("/insurance")
public class InsuranceController {


    @Autowired
    private InsuranceRepository insuranceRepository;

    @GetMapping("/packages")
    public List<InsurancePackage> getAllPackages() {
        return insuranceRepository.getAllPackages();
    }
    
    @PostMapping("/addpackage")
    public ResponseEntity<Object> addPackage(@RequestBody InsurancePackage p) {
        insuranceRepository.addPackage(p);
        return new ResponseEntity<>("Package is added successfully", HttpStatus.CREATED);
    }

    @PutMapping("/updatepack/{id}")
    public ResponseEntity<Object> updatePackage(@RequestBody InsurancePackage p, @PathVariable Integer id) {
        int result = insuranceRepository.updatePackage(p);
        if (result > 0) {
            return new ResponseEntity<>("Package is updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Package update failed", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/adduser")
	public ResponseEntity<Object> createEmployee(@RequestBody InsuranceUser u) {
		insuranceRepository.addUser(u);
		return new ResponseEntity<>("Employee is created successfully", HttpStatus.CREATED);
	}
	
    @PutMapping("/updateuser")
    public ResponseEntity<Object> updateUser(@RequestBody InsuranceUser user) {
        int result = insuranceRepository.updateUser(user);
        if (result > 0) {
            return new ResponseEntity<>("User is updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User update failed", HttpStatus.NOT_FOUND);
        }
    }

}
