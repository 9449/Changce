package com.fourteam.changce.opp.service.impl;

import com.fourteam.changce.dao.NewsMapper;
import com.fourteam.changce.pojo.News;
import com.fourteam.changce.opp.service.NewsService;
import com.fourteam.changce.utils.ResultUtil;
import com.fourteam.changce.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public ResultBean findNews() {
        List<News> list = newsMapper.findNews();
        return ResultUtil.setOK("OK",list);
    }
}
