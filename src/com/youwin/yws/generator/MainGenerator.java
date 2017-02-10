package com.youwin.yws.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * Created by youwin on 2015/8/5.
 */
public class MainGenerator {
        public static void main(String[] args) throws Exception{
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File("D:/worktest/mybatis_generator/src/com/youwin/yws/generator/generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        }
    }

