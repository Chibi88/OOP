package com.company;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Encode{

    public static void main(String[] args) throws UnsupportedEncodingException
    {
        String s = "zacarías";
        System.out.println("URLEncoder.encode returns "
                + URLEncoder.encode(s, "UTF-8"));

        System.out.println("getBytes returns "
                + new String(s.getBytes("UTF-8"), "ISO-8859-1"));
    }

}
