package com.carl.springmvc.mapper;

import com.carl.springmvc.model.TAuthPermission;
import java.util.List;

public interface TAuthPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth_permission
     *
     * @mbggenerated
     */
    int insert(TAuthPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth_permission
     *
     * @mbggenerated
     */
    List<TAuthPermission> selectAll();
}