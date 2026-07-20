package com.piyu.springboot.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class CloudVendorApiNotFoundException extends RuntimeException{
    private final String message;
}
