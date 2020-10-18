package com.atguigu.gulimall.product;

import com.aliyun.oss.OSSClient;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Resource
    OSSClient ossClient;
    @Autowired
    CategoryService categoryService;

    @Test
    void contextLoads() {
    }

    @Test
    void testUpload2() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\12062\\Pictures\\Saved Pictures\\mybatis.png");
        ossClient.putObject("gulimall-conan", "mybatis.png", inputStream);
        System.out.println("上传完成！");
    }

    @Test
    void test1(){
        BrandEntity brandEntity = new BrandEntity();
        /*brandEntity.setName("小米");
        brandService.save(brandEntity);*/
        /*brandEntity.setBrandId(1L);
        brandEntity.setDescript("小米");
        brandService.updateById(brandEntity);*/
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(System.out::println);
        System.out.println("执行成功。。。");
    }

    @Test
    void testUpload() throws FileNotFoundException {
        /*// Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI4GKyd5F7updSUFvwbPMp";
        String accessKeySecret = "53l5wld8XcEEgXFUCwU4lqlQGCvAbd";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);


        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\12062\\Pictures\\Saved Pictures\\mybatis.png");
        ossClient.putObject("gulimall-conan", "mybatis.png", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传完成！");
         */
    }

    @Test
    void testFindPath(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径:{}",Arrays.toString(catelogPath));
    }

}
