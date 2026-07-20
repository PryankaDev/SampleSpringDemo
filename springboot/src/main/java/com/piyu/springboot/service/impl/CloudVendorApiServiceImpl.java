package com.piyu.springboot.service.impl;

import com.piyu.springboot.model.CloudVendorEntity;
import com.piyu.springboot.model.CloudVendorModel;
import com.piyu.springboot.repository.CloudVendorRepository;
import com.piyu.springboot.service.CloudVendorApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CloudVendorApiServiceImpl implements CloudVendorApiService {
    private final CloudVendorRepository cloudVendorRepository;
    @Override
    public String createVendorApi(CloudVendorModel cloudVendorModel) {
        CloudVendorEntity cloudVendorEntity = new CloudVendorEntity(
                cloudVendorModel.vendorId(),
                cloudVendorModel.vendorName(),
                cloudVendorModel.vendorAddress(),
                cloudVendorModel.vendorPhoneNo()
        );
        cloudVendorRepository.save(cloudVendorEntity);
        return "Successfully Created";
    }

    @Override
    public CloudVendorEntity getCloudVendorAPI(String vendorId) {
        CloudVendorEntity cloudVendorEntity = cloudVendorRepository.findById(vendorId).get();
        return cloudVendorEntity;
    }

    @Override
    public String updateCloudVendorAPI(CloudVendorModel cloudVendorModel) {
        CloudVendorEntity cloudVendorEntity = new CloudVendorEntity(
                cloudVendorModel.vendorId(),
                cloudVendorModel.vendorName(),
                cloudVendorModel.vendorAddress(),
                cloudVendorModel.vendorPhoneNo()
        );
        cloudVendorRepository.save(cloudVendorEntity);
        return "Updated successfully";
    }

    @Override
    public String deleteVendorApi(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Deleted Successfully";
    }

    @Override
    public List<CloudVendorEntity> getAllCloudVendorApi() {
        return cloudVendorRepository.findAll();
    }
}
