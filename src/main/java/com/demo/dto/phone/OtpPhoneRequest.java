package com.demo.dto.phone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtpPhoneRequest {
    private String phoneNumber;
}

