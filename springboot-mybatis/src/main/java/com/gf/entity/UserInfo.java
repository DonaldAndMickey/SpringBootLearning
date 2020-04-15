package com.gf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Donald
 * @create 2020-04-12 23:28
 */
@Data
@TableName("user_info")
public class UserInfo implements Serializable {


    private static final long serialVersionUID = 832717765682507789L;

    @TableId(type = IdType.AUTO)
    private long id;

    @TableField(value = "SN")
    private String sN;

    private String itemNo;

}
