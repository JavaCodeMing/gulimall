package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    void contextLoads() {
    }

    @Test
    void testUpload() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\12062\\Pictures\\Saved Pictures\\mybatis.png");
        ossClient.putObject("gulimall-conan", "mybatis.png", inputStream);
        System.out.println("上传完成！");
    }
}
