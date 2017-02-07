package com.abinj.vertxhelloworld.application;

import com.abinj.vertxhelloworld.configuration.MainConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by abinj on 7/2/17.
 */
public class MainApplication extends Application<MainConfiguration>{

    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    @Override
    public void run(MainConfiguration mainConfiguration, Environment environment) throws Exception {

    }
}
