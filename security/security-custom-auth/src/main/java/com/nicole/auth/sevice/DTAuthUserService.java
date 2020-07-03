package com.nicole.auth.sevice;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.request.OapiSnsGetuserinfoBycodeRequest;
import com.dingtalk.api.response.OapiSnsGetuserinfoBycodeResponse;
import com.taobao.api.ApiException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DTAuthUserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/sns/getuserinfo_bycode");
        OapiSnsGetuserinfoBycodeRequest req = new OapiSnsGetuserinfoBycodeRequest();
        req.setTmpAuthCode(s);
        OapiSnsGetuserinfoBycodeResponse response = new OapiSnsGetuserinfoBycodeResponse();
        User u = null;
        try {
            response = client.execute(req,"dingoa3rtiiyglkdz1vtru","XMxOPBWnLwuc_z_nTyvzyTXEx0cNysPAPXyenZPvNXknsmdPZeU4DMP8eiVc-AQE");
            u = new User(s, "{noop}maxwit", new ArrayList<>());
        } catch (ApiException e) {
            e.printStackTrace();
        }

        System.out.println(response.getBody());

        return u;
    }
}