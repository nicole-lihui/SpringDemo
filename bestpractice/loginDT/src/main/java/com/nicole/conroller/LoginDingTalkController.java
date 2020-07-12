package com.nicole.conroller;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkConstants;
import com.dingtalk.api.request.OapiSnsGetuserinfoBycodeRequest;
import com.dingtalk.api.response.OapiChatUpdateResponse;
import com.dingtalk.api.response.OapiSnsGetuserinfoBycodeResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taobao.api.ApiException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginDingTalkController {

    @RequestMapping("/dingtalkLogin")
    public Object dlogin() {
        String time = String.valueOf(System.currentTimeMillis());
        StringBuilder stringBuilder = new StringBuilder();
        String result = "";
        String url = "http://localhost:8080/ding/info";
//        https://oapi.dingtalk.com/connect/oauth2/sns_authorize?
        stringBuilder
                .append("https://oapi.dingtalk.com/connect/qrconnect?appid=")
                .append("dingoajetw4y5rtg6qf9qt")//APP_ID
                .append("&response_type=")
                .append("code")//code
                .append("&scope=")
                .append("snsapi_login")//snsapi_login
                .append("&state=")
                .append(time)
                .append("&redirect_uri=")
                .append(url);//回调地址
        try {
            result = stringBuilder.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @GetMapping("/ding/login")
    public String test() {
        return "Hello, login";
    }

    @GetMapping("/ding/info")
    public String info(String code) throws ApiException {
        DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/sns/getuserinfo_bycode");
        OapiSnsGetuserinfoBycodeRequest req = new OapiSnsGetuserinfoBycodeRequest();
        req.setTmpAuthCode(code);
        OapiSnsGetuserinfoBycodeResponse response = null;
        try {
            response = client.execute(req,"dingoajetw4y5rtg6qf9qt","7EBCkEhd4YNsbZr2oyin-i7UxNBNJr0a6y6EpHf46JC2qD0x0WHXDzIhj6a1yi3U");
        } catch (ApiException e) {
            e.printStackTrace();
        }

        return response.getBody();
    }
}
