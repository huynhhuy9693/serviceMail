package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MailModel {

    private String to_address;
    private String subject;
    private String body;

}
