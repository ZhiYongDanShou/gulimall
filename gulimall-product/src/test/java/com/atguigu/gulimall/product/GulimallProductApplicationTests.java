package com.atguigu.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.service.BrandService;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Autowired
    OSSClient ossClient;

//    @Test
//    public void contextLoads() {
//    }

    @Test
    public void testload() throws FileNotFoundException {

//        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//        String endpoint = "https://oss-cn-beijing.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tPDrgKHRB1Ve1CXky44";
//        String accessKeySecret = "gV6KbdoLARQ2nh8tvEpotvrFrvL0AI";
//        //创建OSSClient实例
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        //上传文件流
        InputStream inputStream = new FileInputStream("C:\\Users\\LEGION\\Pictures\\Saved Pictures\\下坠.jpg");

        ossClient.putObject("gulimall-linhaojia","下坠.jpg",inputStream);
        // 填写Bucket名称，例如examplebucket。
//        String bucketName = "gulimall-linhaojia";
        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
//        String objectName = "黑幕.jpg";

        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件。
//        String filePath= "C:\\Users\\LEGION\\Pictures\\Saved Pictures\\黑幕.jpg";

//        ossClient.shutdown();
        System.out.println("=======================!!!!==文件上传成功==!!!!===========================");


    }

}
