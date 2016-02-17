package com.kimmin.mail;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.io.File;

import org.junit.Test;

/**
 * Created by min.jin on 2016/2/16.
 */

public class FreeMarkerTest {

    private static Configuration cfg;

    public void init() throws IOException{
        cfg=new Configuration();
        cfg.setDirectoryForTemplateLoading(new File("D:\\git\\ftl"));
        //cfg.setDefaultEncoding("utf-8");
        //Class cls = this.getClass();
        //ClassTemplateLoader classTemplateLoader = new ClassTemplateLoader(this.getClass(),"templates");
        //String str = classTemplateLoader.toString();
        //cfg.setClassForTemplateLoading(this.getClass(),"templates");
    }

    public void process() throws IOException,TemplateException{
        Map map = new HashMap();
        map.put("user","jinmin");
        Template tpl=cfg.getTemplate("mail.ftl");
        tpl.process(map,new OutputStreamWriter(System.out));
    }

    public static void main(String[] args)throws IOException,TemplateException{
        FreeMarkerTest tmp=new FreeMarkerTest();
        tmp.init();
        tmp.process();
    }

}
