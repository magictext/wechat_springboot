package com.wechat_springboot.standand.repository;

import com.wechat_springboot.standand.entity.StuClassCard;
import com.wechat_springboot.standand.entity.StuClassCardPK;
import org.springframework.data.repository.CrudRepository;

public interface StuClassCardRepository extends CrudRepository<StuClassCard, StuClassCardPK> {
}
