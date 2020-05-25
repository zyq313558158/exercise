package com.zyq.eurekaserver;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.micrometer.core.instrument.util.JsonUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DecodeToken {
    public static void main3(String[] args) {
//        List roleList = new ArrayList<>();
//        roleList.add("account");
//        roleList.add("product");
//        String subject = "zhang3" + "-" + roleList;
//
//        String token = Jwts.builder()
//                .setSubject(subject)
//                .setExpiration(new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000)) // 设置过期时间 365 * 24 * 60 * 60秒(这里为了方便测试，所以设置了1年的过期时间，实际项目需要根据自己的情况修改)
//                .signWith(SignatureAlgorithm.HS512, "hahaha") //采用什么算法是可以自己选择的，不一定非要采用HS512，这个密钥视为了解密
//                .compact();
//        System.out.println(token);
//        String parserSubject = Jwts.parser()
//                .setSigningKey("hahaha")
//                .parseClaimsJws(token.replace("Bearer ", ""))
//                .getBody()
//                .getSubject();
        //System.out.println(new DefaultJwtParser().parseClaimsJws(token.replace("Bearer ", "")));
//        System.out.println(JWT.decode(token).getSubject());

        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL2FjY2Vzcy5saW5lLm1lIiwic3ViIjoiVThmZTk3YWNlYWViYmM2MDhlNWZmMjExOTA1YzNlMWMzIiwiYXVkIjoiMTY1NDE1NTIxNiIsImV4cCI6MTU4ODU2NTY0MSwiaWF0IjoxNTg4NTYyMDQxLCJub25jZSI6IjA5ODc2eHl6IiwiYW1yIjpbImxpbmVzc28iXSwibmFtZSI6Inp5cSIsInBpY3R1cmUiOiJodHRwczovL3Byb2ZpbGUubGluZS1zY2RuLm5ldC8waFZLYzBzYUlRQ1dSZVNTR3BNUUIyTTJJTUJ3a3BadzhzSml0SFVIcEFVRkZ5ZVJ3NmFpMFNVSDlLVlFCMGZVWXdZU2NXVUM4WkExMTEiLCJlbWFpbCI6InpoYW5neWFxaWFuZy5ocHVAZ21haWwuY29tIn0.1D8tm2ATSnC6JrJ2xmTP8FwNdOoq1Eju3PQZRj1RUic";

        System.out.println(JWT.require(Algorithm.HMAC256("990f3cf7dc796a5ee67d7873418ff614")).build().verify(token).getClaim("email").asString());
        System.out.println(JWT.require(Algorithm.HMAC256("990f3cf7dc796a5ee67d7873418ff614")).build().verify(token).getClaim("picture").asString());
        System.out.println(JWT.require(Algorithm.HMAC256("990f3cf7dc796a5ee67d7873418ff614")).build().verify(token).getClaim("name").asString());
        System.out.println(JWT.require(Algorithm.HMAC256("990f3cf7dc796a5ee67d7873418ff614")).build().verify(token).getClaim("nonce").asString());
        System.out.println(JWT.require(Algorithm.HMAC256("990f3cf7dc796a5ee67d7873418ff614")).build().verify(token).getClaim("nonce").asString());


//
//        System.out.println(subject);
//        System.out.println(parserSubject);
    }


    public static void main2(String[] args) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.line.me/oauth2/v2.1/token";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("grant_type", "authorization_code");
        map.add("code", "2kVJ1B9Q5XqQSvmFXxyq");
        map.add("redirect_uri", "http://127.0.0.1/callback");
        map.add("client_id", "1654155216");
        map.add("client_secret", "990f3cf7dc796a5ee67d7873418ff614");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        ResponseEntity<String> response = restTemplate.postForEntity( url, request , String.class );

        System.out.println(JSON.parseObject(response.getBody()).get("id_token"));
    }

    public static void main1(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String access_token = "eyJhbGciOiJIUzI1NiJ9.LJO_F8XbluYgvgCnoCYUAzHUvHj5N5tg3FmC6-4MChizSr1zlm2kqtR61KCpINblbl0_3ClzKkwBL5lklU5fBzc-6NAXEseO9dq_-ewYF5JAX48l7pu9zaKzyayEHhjUjYdFrzgDn8Dc0yagbSpLXVXi_HYDaiXUWYsFjhr0W6Q.nH4i5-Jl0SIgFJKXr22ErJ9ZsIHJCRjt3PlkOGZwe0A";
        String url = "https://api.line.me/oauth2/v2.1/verify?access_token=ACCESS_TOKEN".
                replace("ACCESS_TOKEN",access_token);
        ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
        System.out.println(response.getBody());
        System.out.println(JSON.parseObject(response.getBody()).get("client_id"));
    }

    public static void main(String[] args) {
        String access_token = "eyJhbGciOiJIUzI1NiJ9.LJO_F8XbluYgvgCnoCYUAzHUvHj5N5tg3FmC6-4MChizSr1zlm2kqtR61KCpINblbl0_3ClzKkwBL5lklU5fBzc-6NAXEseO9dq_-ewYF5JAX48l7pu9zaKzyayEHhjUjYdFrzgDn8Dc0yagbSpLXVXi_HYDaiXUWYsFjhr0W6Q.nH4i5-Jl0SIgFJKXr22ErJ9ZsIHJCRjt3PlkOGZwe0A";
        String url = "https://api.line.me/v2/profile";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(access_token);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.postForEntity( url, request , String.class );
        JSONObject jsonObject = JSON.parseObject(response.getBody());
        System.out.println(jsonObject);
    }
}
