package com.cne.veilchat.cli;

import com.cne.veilchat.common.Message;
import com.cne.veilchat.common.User;
import com.github.javafaker.Faker;

import java.security.*;
import java.util.UUID;

class MessageApp {


    private User signUp() {
        // let us consider a random user is signing up.

        Faker faker = new Faker();
        KeyPair rsaKey = generateRSAKey();
        byte [] pubKey = rsaKey.getPublic().getEncoded();

        // we will be storing the public key in a secure storage in the device.

        return new User(
                UUID.randomUUID().toString(),
                faker.funnyName().name(),
                System.currentTimeMillis(),
                faker.internet().ipV4Address(),
                pubKey
        );
    }

    private KeyPair generateRSAKey() {
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048, new SecureRandom());
            return keyGen.generateKeyPair();
        }
        catch (NoSuchAlgorithmException e) {
            // this has to be more meaningful, try using a custom exception
            throw new RuntimeException(e);
        }
    }

    private Message composeMessage() {
        User user = signUp();
        final String plainPayload = "Hi, can we go for coffee?";
        /**
         *
         * fixme: Need to complete the CLI app.
         */
        Message message = new Message();
        return message;
    }

}
