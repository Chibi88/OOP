package com.company;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String tildeString= "zacar%C3%ADas-samaniego-65287ba9";
        System.out.println(tildeString);
        //String sintildeString = "zacar%C3%ADas-samaniego-65287ba9";
        //System.out.println(sintildeString);


        byte[] germanBytes = tildeString.getBytes();
        String asciiEncodedString = new String(germanBytes, StandardCharsets.US_ASCII);
        System.out.println(asciiEncodedString);

        byte[] bytes = tildeString.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(utf8EncodedString);

        ByteBuffer buffer = StandardCharsets.UTF_8.encode(tildeString);
        String utf8EncodedString2 = StandardCharsets.UTF_8.decode(buffer).toString();
        System.out.println(utf8EncodedString2);

        ByteBuffer buffer2 = StandardCharsets.UTF_8.encode(tildeString);
        String utf8EncodedString3 = StandardCharsets.UTF_8.decode(buffer).toString();
        System.out.println(utf8EncodedString3);






    }

    }

