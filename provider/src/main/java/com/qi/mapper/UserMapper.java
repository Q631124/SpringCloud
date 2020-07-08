package com.qi.mapper;

import com.qi.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/11/27.
 */
@Repository
public interface UserMapper {
    public User getUser(@Param("id") String id);
}
