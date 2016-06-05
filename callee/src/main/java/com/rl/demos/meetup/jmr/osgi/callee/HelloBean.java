package com.rl.demos.meetup.jmr.osgi.callee;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A bean which we use in the route
 */
public class HelloBean implements Hello {

    private String say = "Default Hello";

    @Override
    public String hello() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return say + " at " + sdf.format(new Date());
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
}
