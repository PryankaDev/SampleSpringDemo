package com.piyu.springboot.model;

import jakarta.persistence.Id;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public record CloudVendorModel(
        @NotNull(message = "Vendor Id should not be empty")
        String vendorId,
        @NotEmpty(message = "Vendor name should not be empty")
        String vendorName,
        @NotEmpty(message = "Address should not be empty")
        String vendorAddress,
        @Size(message = "phone number should be 10 digit only", min = 10,max = 10)
        String vendorPhoneNo
) {
}
