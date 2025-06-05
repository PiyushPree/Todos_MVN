package com.pree.todos.repository;

import com.pree.todos.entity.Todos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosRepository extends JpaRepository<Todos,Integer> {

}
