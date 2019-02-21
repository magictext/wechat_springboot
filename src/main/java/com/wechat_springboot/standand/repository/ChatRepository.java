package com.wechat_springboot.standand.repository;

import com.wechat_springboot.standand.entity.Chat;
import org.springframework.data.repository.CrudRepository;

public interface ChatRepository extends CrudRepository<Chat,String> {

}
