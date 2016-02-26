import com.google.common.annotations.VisibleForTesting;
import com.google.common.util.concurrent.ListenableFuture;
import com.kimmin.mail.client.MailSendCommand;
import com.kimmin.mail.client.MailSendWorkerService;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by min.jin on 2016/2/26.
 */
public class MailClientTest {

    //@Test
    public void connectionTest(){

        Map<String,Object> dom = new HashMap<String, Object>();
        dom.put("name","kimmin");
        MailSendCommand command = new MailSendCommand(new File("d:\\template"), "tmp.ftl", dom, "****@126.com","***@ctrip.com");
        command.setConfiguration("smtp.xxx.com","username","password");
        ListenableFuture future = MailSendWorkerService.getInstance().provideCommand(command);
        //MailSendWorkerService.getInstance().triggerShutdown();
        try{
            future.get();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
