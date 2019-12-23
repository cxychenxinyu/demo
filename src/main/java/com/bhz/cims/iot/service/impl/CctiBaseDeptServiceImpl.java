package com.bhz.cims.iot.service.impl;

import com.bhz.cims.iot.dao.mapper.CctiBaseDeptMapper;
import com.bhz.cims.iot.entity.CctiBaseDept;
import com.bhz.cims.iot.service.iface.ICctiBaseDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "cctiBaseDeptService")
public class CctiBaseDeptServiceImpl implements ICctiBaseDeptService {

    @Autowired
    private CctiBaseDeptMapper cctiBaseDeptMapper;

    @Override
    public List<CctiBaseDept> getAll() {
        return cctiBaseDeptMapper.selectAll();
    }
}
