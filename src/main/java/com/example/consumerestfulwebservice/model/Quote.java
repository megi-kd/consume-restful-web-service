package com.example.consumerestfulwebservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    @JsonProperty(value="id")
    private Long id;

    @JsonProperty(value="message")
    private String message;

    @JsonProperty(value = "data")
    private Data data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
