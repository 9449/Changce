package com.fourteam.changce.opp.controller;

import com.fourteam.changce.opp.service.HonorService;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HonorController {
    @Autowired
    private HonorService honorService;
    @RequestMapping("/findhonors")
    public ResultBean findhonors() {
        return honorService.findHonors();
    }
}
