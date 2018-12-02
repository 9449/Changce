package com.fourteam.changce.opp.controller;

import com.fourteam.changce.opp.service.PersonalhonserService;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PersonalhonserController {
    @Autowired
    private PersonalhonserService personalhonserService;
    @RequestMapping("/findperhons")
    public ResultBean findserhons(Integer aid) {
        return personalhonserService.findperhons(aid);
    }
}
