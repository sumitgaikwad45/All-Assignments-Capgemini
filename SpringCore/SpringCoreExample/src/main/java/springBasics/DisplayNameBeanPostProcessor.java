package springBasics;
//BeanPostProcessor is used to tell spring that some processing is needed to done After intitalizing the bean. 
//Then spring excutes this code After each and every bean
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {
		System.out.println("In After Initialization method, Bean name is  "+ beanName);
         return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) 
			throws BeansException {
		System.out.println("In Before Initialization method, Bean name is  "+ beanName);
       return bean;
	}
}
