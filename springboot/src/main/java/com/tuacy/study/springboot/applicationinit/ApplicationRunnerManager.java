package com.tuacy.study.springboot.applicationinit;

import com.tuacy.study.springboot.hook.importBeanDefinitionRegistrar.runstart.RunStartManager;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @name: ApplicationRunnerManager
 * @author: tuacy.
 * @date: 2019/8/16.
 * @version: 1.0
 * @Description:
 */
@Component
public class ApplicationRunnerManager implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        RunStartManager.INSTANCE.autoStartInvoke();
    }
}
