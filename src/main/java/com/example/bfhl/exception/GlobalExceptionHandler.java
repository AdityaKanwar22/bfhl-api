package com.example.bfhl.exception;

import com.example.bfhl.dto.BfhlResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BfhlResponse handleBadRequest(BadRequestException ex) {
        return new BfhlResponse(
                false,
                "aditya1762.be23@chitkara.edu.in",
                ex.getMessage()
        );
    }
}
