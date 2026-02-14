package com.example.bfhl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    private boolean is_success;
    private String official_email;
    private Object data;
    private String error;

    public static ApiResponse success(Object data){
        return new ApiResponse(true,"aditya1762.be23@chitkara.edu.in",data,null);
    }

    public static ApiResponse failure(String error){
        return new ApiResponse(false,"aditya1762.be23@chitkara.edu.in",null,error);
    }
}
