package com.github.jtrinity.world.boot;

import lombok.Data;

import java.time.Duration;

@Data
public class LoginRestProperties {
    private int loginResTPort;
    private String externalAddress;
    private String localAddress;
    private Duration ticketDuration;
}

