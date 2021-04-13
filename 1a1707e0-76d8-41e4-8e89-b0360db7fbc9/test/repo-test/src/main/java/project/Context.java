package project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

    @Bean(name = "webscript.project.helloworldwebscript.get")
    public HelloWorldWebScript helloWorldWebScript() {
        return new HelloWorldWebScript();
    }
}
