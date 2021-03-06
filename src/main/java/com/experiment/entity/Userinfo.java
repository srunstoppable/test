package com.experiment.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sr
 * @since 2018-11-21
 */
@Data
@Accessors(chain = true)
public class Userinfo  {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;
    @TableField("password")
    private String password;
    @TableField("name")
    private String name;



}
