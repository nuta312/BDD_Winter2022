package com.spacex.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TextBoxModel {

    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;
}
