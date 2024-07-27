package com.probatio.expensescrud.repository;
import com.probatio.expensescrud.model.Expense;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ExpenseRepository extends CrudRepository<Expense,String>{
}
