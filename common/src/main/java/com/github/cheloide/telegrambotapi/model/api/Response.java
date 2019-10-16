package com.github.cheloide.telegrambotapi.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response<T> {

    @JsonProperty("ok")
    private Boolean ok;
    @JsonProperty("result")
    private T       result;
    @JsonProperty("error_code")
    private Integer errorCode;
    @JsonProperty("description")
    private String  description;

    /**
     * @return the ok
     */
    public Boolean getOk() {
        return ok;
    }

    /**
     * @param ok the ok to set
     */
    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    /**
     * @return the result
     */
    public T getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(T result) {
        this.result = result;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
