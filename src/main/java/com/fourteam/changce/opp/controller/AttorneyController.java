package com.fourteam.changce.opp.controller;

import com.fourteam.changce.opp.service.AttorneyService;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AttorneyController {
    @Autowired
    private AttorneyService attorneyService;
    @RequestMapping("/findAllAtt")
    public ResultBean findAll() {
        return attorneyService.findAll();
    }

    @RequestMapping("/findAttById")
    public ResultBean findAttById(Integer aid) {
        return attorneyService.findAttById(aid);
    }
}
