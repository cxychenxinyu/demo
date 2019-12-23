package com.bhz.cims.iot.dao.mapper;

import com.bhz.cims.iot.dao.BaseDao;
import com.bhz.cims.iot.entity.CctiBaseDept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CctiBaseDeptMapper extends BaseDao<CctiBaseDept> {
    int deleteByPrimaryKey(String bosUuid);

    int insert(CctiBaseDept record);

    int insertSelective(CctiBaseDept record);

    CctiBaseDept selectByPrimaryKey(String bosUuid);

    int updateByPrimaryKeySelective(CctiBaseDept record);

    int updateByPrimaryKey(CctiBaseDept record);

    List<CctiBaseDept> selectAll();
}