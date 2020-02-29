package com.fixaslab.test.repository;

import com.fixaslab.test.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer>{
}
