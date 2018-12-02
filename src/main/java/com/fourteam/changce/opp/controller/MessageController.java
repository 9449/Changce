package com.fourteam.changce.opp.controller;

import com.fourteam.changce.pojo.Tmessage;
import com.fourteam.changce.opp.service.TmessageService;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MessageController {
    @Autowired
    private TmessageService tmessageService;
    @RequestMapping("/addmessage")
    public ResultBean addmessage(Tmessage tmessage) {
        return tmessageService.addmessage(tmessage);
    }
}
