package com.gf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author gf
 * @since 2018-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_employee")
public class Employee extends Model<Employee> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("lastName")
    private String lastName;

    private String email;

    private Integer gender;
   // @TableField("d_id")
    private Integer dId;
   // @TableField("user_name")
    private String userName;
    //@TableField("in_erp_account")
    private String inErpAccount;
    //@TableField("out_erp_account")
    private String outErpAccount;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
