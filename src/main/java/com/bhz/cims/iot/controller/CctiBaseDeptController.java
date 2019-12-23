package com.bhz.cims.iot.controller;

import com.bhz.cims.iot.entity.CctiBaseDept;
import com.bhz.cims.iot.service.iface.ICctiBaseDeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "cctiBaseDept")
@Slf4j
public class CctiBaseDeptController {
    @Autowired
    private ICctiBaseDeptService cctiBaseDeptService;
    private static final Logger logger = LoggerFactory.getLogger(CctiBaseDeptController.class);

    @ResponseBody
    @RequestMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    public List<CctiBaseDept> getAllUsers(){
        logger.info("日志打印成功");
        return cctiBaseDeptService.getAll();
    }


}
