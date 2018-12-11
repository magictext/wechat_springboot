package com.wechat_springboot.standand.entity;

import org.springframework.beans.factory.annotation.Value;

public class Arrayqueue {
    @Value("${Arraylength}")
    int length;
    Chat array[]=new Chat[100];
    int low=0,high=1;
    public void add(Chat chat){
        if (low==high){
            if(high!=length-1){
                array[high]=chat;
                low++;
                high++;
            }else {
                array[high]=chat;
                low=0;
                high=0;
            }
        }else {
            if(high==length-1){
                array[high]=chat;
                high=0;
            }else {
                array[high]=chat;
                high++;
            }
        }
    }

}
