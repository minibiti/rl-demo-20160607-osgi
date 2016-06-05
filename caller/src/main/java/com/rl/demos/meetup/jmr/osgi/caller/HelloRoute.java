package com.rl.demos.meetup.jmr.osgi.caller;

import com.rl.demos.meetup.jmr.osgi.callee.Hello;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by jmr on 27/05/16.
 */
public class HelloRoute extends RouteBuilder {
    Hello bean;

    @Override
    public void configure() throws Exception {
        // @formatter:off
        from("timer://runOnce?repeatCount=1&delay=2000")
            .routeId("javaRoute")
            .bean(bean, "hello")
            .log("************************************************************** The Hello Service returned: ${body}")
            .to("log:end.of.route");
        // @formatter:on

    }

    public void setBean(Hello bean) {
        this.bean = bean;
    }
}
