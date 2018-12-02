package com.fourteam.changce.opp.controller;

import com.fourteam.changce.opp.service.DynamicService;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DynamicsController {
    @Autowired
    private DynamicService dynamicService;
    @RequestMapping("/finddynamics")
    public ResultBean finddynamics() {
        return dynamicService.findDynamics();
    }
}
