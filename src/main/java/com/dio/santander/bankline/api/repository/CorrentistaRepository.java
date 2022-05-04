package com.dio.santander.bankline.api.repository;

import com.dio.santander.bankline.api.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}//interface
/*
extend uma classe do frameWork, atrvés d eum ainterface chamada JpaRepository
e necessita indicar a classe que estaremos trabalhando e seu id(chave primária)

 */
