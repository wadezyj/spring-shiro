package com.liantuo.publish.approve.controller.util;

import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;

public class UTF8StringHttpMessageConverter extends StringHttpMessageConverter{

    public UTF8StringHttpMessageConverter() {
        super(Charset.forName("UTF-8"));
    }
}
