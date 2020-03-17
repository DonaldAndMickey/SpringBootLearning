package com.gf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gf.entity.Employee;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gf
 * @since 2018-11-25
 */
public interface EmployeeService extends IService<Employee> {

    Employee updateEmployeeById(Employee entity);

}
