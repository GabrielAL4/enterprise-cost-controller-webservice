package br.com.cisbrasil.found.exceptions;

import org.springframework.http.HttpStatus;

public class ErrorBody {
    private HttpStatus status;
    private String message;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorBody(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }
}
