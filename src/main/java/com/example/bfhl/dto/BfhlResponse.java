package com.example.bfhl.dto;

public class BfhlResponse {

    private boolean is_success;
    private String official_email;
    private Object data;

    // Constructor
    public BfhlResponse(boolean is_success, String official_email, Object data) {
        this.is_success = is_success;
        this.official_email = official_email;
        this.data = data;
    }

    // Getter for is_success (important naming fix)
    public boolean getIs_success() {
        return is_success;
    }

    public String getOfficial_email() {
        return official_email;
    }

    public Object getData() {
        return data;
    }

    // Optional setters (good practice)
    public void setIs_success(boolean is_success) {
        this.is_success = is_success;
    }

    public void setOfficial_email(String official_email) {
        this.official_email = official_email;
    }

    public void setData(Object data) {
        this.data = data;
    }
}