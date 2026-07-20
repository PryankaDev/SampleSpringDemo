package com.piyu.springboot.controller;

import com.piyu.springboot.model.CloudVendorEntity;
import com.piyu.springboot.model.CloudVendorModel;
import com.piyu.springboot.service.CloudVendorApiService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cloudVendorApi")
public class CloudVendorController {

    private final CloudVendorApiService cloudVendorApiService;

    @GetMapping(value = "{vendorId}")
    public CloudVendorEntity getCloudVendorAPI(@PathVariable("vendorId") String vendorId){
        return cloudVendorApiService.getCloudVendorAPI(vendorId) ;
    }

    @GetMapping()
    public List<CloudVendorEntity> getAllCloudVendorAPI(){
        return cloudVendorApiService.getAllCloudVendorApi();
    }

    @PostMapping
    public  String createVendorApi(@Valid @RequestBody CloudVendorModel cloudVendorModel){
       cloudVendorApiService.createVendorApi(cloudVendorModel);
        return "Api is created successfully";
    }

    @PutMapping
    public  String updateVendorApi(@Valid @RequestBody CloudVendorModel cloudVendorModel){
        cloudVendorApiService.updateCloudVendorAPI(cloudVendorModel);
        return "Api is updated successfully";
    }

    @DeleteMapping(value = "{vendorId}")
    public String deleteVendorApi(@PathVariable("vendorId") String vendorId){
        cloudVendorApiService.deleteVendorApi(vendorId);
        return "Deleted successfully";
    }

}
