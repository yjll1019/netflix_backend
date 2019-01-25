package me.ziok.application.dao;

import me.ziok.application.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface AccountRepository extends JpaRepository<Account, Long> {

   // Optional<Account> findByAccountId(String email);

   // Boolean existsByEmail(String email);
}
