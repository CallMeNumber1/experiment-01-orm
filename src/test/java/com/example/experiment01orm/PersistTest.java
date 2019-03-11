package com.example.experiment01orm;

import com.example.experiment01orm.entity.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)                // 指定运行器
@SpringBootTest                             // 声明为springboot测试类
@Slf4j
public class PersistTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void addUserAddressTest() {
        userRepository.addUserAddress();
    }

}
