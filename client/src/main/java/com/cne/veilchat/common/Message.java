package com.cne.veilchat.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Message {
    private String id;
    private String sender;
    private byte[] payload;
    private double sentOn;
    private String receiver;
}
