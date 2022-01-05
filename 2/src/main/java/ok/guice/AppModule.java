package ok.guice;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import ok.HelloService;
import ok.HelloServiceImpl;
import ok.ThrowableMapper;
import ok.HelloResource;

public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(HelloResource.class);

    bind(ThrowableMapper.class);
  }

  @Provides
  @Singleton
  public HelloService helloService() {
    return new HelloServiceImpl();
  }

}
