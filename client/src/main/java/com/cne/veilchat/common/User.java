package com.cne.veilchat.common;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * Every user is anonymous we are only keeping a track of their ip addresses and their keys
 */

@AllArgsConstructor
@Data

public class User {
    private String id;
    private String username;
    private double createdOn;
    private String ipAddress;
    private byte [] key;
}
