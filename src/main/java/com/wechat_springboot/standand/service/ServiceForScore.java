package com.wechat_springboot.standand.service;

import javafx.util.Pair;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ServiceForScore extends ServiceParent{
    public List<Pair> getScore(String stuid) {
        return scoreDao.getScore(stuid);
    }
}
