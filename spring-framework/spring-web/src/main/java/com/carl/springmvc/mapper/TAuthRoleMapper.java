package com.carl.springmvc.mapper;

import com.carl.springmvc.model.TAuthRole;
import java.util.List;

public interface TAuthRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth_role
     *
     * @mbggenerated
     */
    int insert(TAuthRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth_role
     *
     * @mbggenerated
     */
    List<TAuthRole> selectAll();
}