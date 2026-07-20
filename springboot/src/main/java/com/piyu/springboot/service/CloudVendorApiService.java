package com.piyu.springboot.service;

import com.piyu.springboot.model.CloudVendorEntity;
import com.piyu.springboot.model.CloudVendorModel;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface CloudVendorApiService {

    public String createVendorApi(CloudVendorModel cloudVendorModel);
    public CloudVendorEntity getCloudVendorAPI(String vendorId);
    public String updateCloudVendorAPI(CloudVendorModel cloudVendorModel);
    public String deleteVendorApi(String vendorId);
    public List<CloudVendorEntity> getAllCloudVendorApi();

    }
