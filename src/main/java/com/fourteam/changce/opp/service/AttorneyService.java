package com.fourteam.changce.opp.service;

import com.fourteam.changce.vo.ResultBean;


public interface AttorneyService {
    ResultBean findAll();

    ResultBean findAttById(Integer aid);
}
