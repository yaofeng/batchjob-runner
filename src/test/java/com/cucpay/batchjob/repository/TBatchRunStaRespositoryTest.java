package com.cucpay.batchjob.repository;

import com.cucpay.batchjob.domain.TBatchRunSta;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 *
 * @author YaoFeng
 */
@ContextConfiguration(locations={"classpath:spring/application.xml"}) 
public class TBatchRunStaRespositoryTest extends AbstractTestNGSpringContextTests {
    
    @Resource
    private EntityManagerFactory entityManagerFactory;
    
    private CrudRepository<TBatchRunSta, String> repository;
    
    @Resource
    private TBatchRunStaRespository tBatchRunStaRespository;
    
    @Test
    public void testSimpleJpaRepository() {
        final EntityManager em = entityManagerFactory.createEntityManager();
        repository = new SimpleJpaRepository<TBatchRunSta, String>(TBatchRunSta.class, em);
        for (TBatchRunSta item : repository.findAll()) {
            System.out.println(item);
        }
        System.out.printf("Total count: %d%n", repository.count());
    }
    
    @Test
    public void testCusotmJpaRepository() {
        for (TBatchRunSta item : tBatchRunStaRespository.findAll()) {
            System.out.println(item);
        }
        System.out.printf("Total count: %d%n", tBatchRunStaRespository.count());
    }
}
