package com.kris.spark.krisspark;

import org.apache.spark.SparkConf;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KrisSparkApplicationTests {

    @Test
    void contextLoads() {
        SparkConf sparkConf = new SparkConf().setAppName("KrisSparkRDD").setMaster("local");
    }

}
