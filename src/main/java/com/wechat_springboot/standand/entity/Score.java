package com.wechat_springboot.standand.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Map;
import java.util.Objects;

@Entity
public class Score {

    @Id
    private StuClassCardPK stuClassCardPK;

    private int score;

    public Score() {

    }

    public StuClassCardPK getStuClassCardPK() {
        return stuClassCardPK;
    }

    public void setStuClassCardPK(StuClassCardPK stuClassCardPK) {
        this.stuClassCardPK = stuClassCardPK;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
