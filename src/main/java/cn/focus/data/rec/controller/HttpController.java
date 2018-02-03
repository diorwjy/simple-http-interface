package cn.focus.data.rec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jianyingwang on 2018/2/3.
 */
@Controller
@RequestMapping("api")
public class HttpController {

    @RequestMapping(value = "test", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test(){
        /*JSONObject json = new JSONObject();
        json.put("sample", new Date());
        return json.toString();*/
        return "haah";
    }
}
