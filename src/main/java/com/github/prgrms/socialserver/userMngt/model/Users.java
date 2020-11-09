package com.github.prgrms.socialserver.userMngt.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigInteger;
import java.util.Date;

@EntityScan
public class Users {
    private final long seq;
    private final String email;
    private String passwd;
    private int login_count;
    private Date last_login_at;
    private Date create_at;
}
