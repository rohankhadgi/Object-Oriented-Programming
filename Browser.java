package com.LearnToCode;

public class Browser {
    public void navigate (String address) {
        String ipAddress = findIpAddress(address);
        String html = sendHttpRequest(ipAddress, true);

        System.out.println(html);
    }

    private String sendHttpRequest(String ipAddress,boolean isTrue) {
        if (isTrue = true)
            return "<html>...</html>";
        return "";
    }

    private String findIpAddress(String address) {
        return "192.168.0.1";
    }
}
