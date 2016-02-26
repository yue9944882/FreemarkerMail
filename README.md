#FreeMarker Mail#
<a href="https://travis-ci.org/yue9944882/FreemarkerMail.svg?branch=master" target="_blank"><img src="https://travis-ci.org/yue9944882/FreemarkerMail.svg?branch=master"/></a>


    dependency:
        log4j 1.2.7+
        guava 18.0+
        javax.mail 1.5.5+
        freemarker 2.3.23+
        junit 4.12+
-------------------

###FreeMarker Mail Pure Client###

##### Mail Sending Service #####
1. Singleton-pattern service & Command-pattern mail sending task
2. Support concurrent invocation
3. Asynchronous Function Call
4. Support Multi-mail Sending & Listening hooke
5. Support Freemarker Template Generation
    
<br>
    Usage:
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