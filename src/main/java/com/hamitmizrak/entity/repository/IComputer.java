package com.hamitmizrak.entity.repository;

import com.hamitmizrak.entity.ComputerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//JpaRepository
//CrudRepository
//PagingAndSortingRepository
//Unutmaaaaa: Generics bileşenler wrapper olmalıdır primitive type olamaz
//<ComputerEntity,Long>   ComputerEntity==> @Entity  Long==>ComputerEntity -> ID türü
@Repository
public interface IComputer extends CrudRepository<ComputerEntity,Long> {

    List<ComputerEntity> findComputerEntitiesByComputerName(String computerName);

    //filtreleme
    List<ComputerEntity> findByComputerNameStartingWith(String computerName);
    List<ComputerEntity> findByComputerNameEndsWith(String computerName);
    List<ComputerEntity> findByComputerNameLike(String computerName);
}