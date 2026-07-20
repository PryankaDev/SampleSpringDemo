package com.piyu.springboot.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String,String> error
) {
}
