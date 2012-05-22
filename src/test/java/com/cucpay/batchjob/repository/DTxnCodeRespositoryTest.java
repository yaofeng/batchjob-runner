package com.cucpay.batchjob.repository;

import com.cucpay.batchjob.domain.DTxnCode;
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
public class DTxnCodeRespositoryTest extends AbstractTestNGSpringContextTests {
    
    @Resource
    private EntityManagerFactory entityManagerFactory;
    
    private CrudRepository<DTxnCode, String> repository;
    
    @Resource
    private DTxnCodeRespository dTxnCodeRespository;
    
    @Test
    public void testSimpleJpaRepository() {
        final EntityManager em = entityManagerFactory.createEntityManager();
        repository = new SimpleJpaRepository<DTxnCode, String>(DTxnCode.class, em);
        for (DTxnCode item : repository.findAll()) {
            System.out.println(item);
        }
        System.out.printf("Total count: %d%n", repository.count());
    }
    
    @Test
    public void testCusotmJpaRepository() {
        for (DTxnCode item : dTxnCodeRespository.findAll()) {
            System.out.println(item);
        }
        System.out.printf("Total count: %d%n", dTxnCodeRespository.count());
    }
}
