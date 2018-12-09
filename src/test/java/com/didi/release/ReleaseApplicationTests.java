package com.didi.release;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReleaseApplicationTests {

    public Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    public void contextLoads() {
    }

    @Test
    public void jsonArrayTest(){
        JSONArray array1 = JSON.parseArray("");
        JSONArray array2 = JSON.parseArray("[]");

        log.info(array1.toJSONString());
        log.info(array2.toJSONString());

    }

}
