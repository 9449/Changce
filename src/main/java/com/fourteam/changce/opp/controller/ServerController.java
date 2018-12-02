package com.fourteam.changce.opp.controller;

import com.fourteam.changce.opp.service.ServerService;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ServerController {
    @Autowired
    private ServerService serverService;
    @RequestMapping("/findservers")
    public ResultBean findServers() {
        return serverService.findservers();
    }
}
