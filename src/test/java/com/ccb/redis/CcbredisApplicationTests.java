package com.ccb.redis;

import com.ccb.redis.utils.RedisTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CcbredisApplicationTests {

	@Autowired
	private RedisTools redisTools;

	@Test
	public void contextLoads() {
		redisTools.set("testKey", "123", 30);
	}

}
