package com.gf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gf.entity.Employee;
import com.gf.mapper.EmployeeMapper;
import com.gf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author gf
 * @since 2018-11-25
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int insertOnlyOne(Employee employee) {

        int i = employeeMapper.insertOnlyOne(employee);
        return i;
    }

    @Override
    public int updateOnlyOne(Employee employee) {
        return employeeMapper.updateOnlyOne(employee);
    }


}
