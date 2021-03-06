package com.experiment.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;




import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sr
 * @since 2018-11-28
 */
@Data
@Accessors(chain = true)
public class RoleAuthority  {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("roleid")
    private Integer roleid;
    @TableField("authorityid")
    private Integer authorityid;


}
