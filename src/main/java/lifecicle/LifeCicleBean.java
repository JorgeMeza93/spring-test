package lifecicle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCicleBean implements BeanNameAware{
	
	private static final Logger logger = LoggerFactory.getLogger(LifeCicleBean.class);
	
	@Override
	public void setBeanName(String name) {
		logger.info("Bean name {}", name);
		
	}

}
