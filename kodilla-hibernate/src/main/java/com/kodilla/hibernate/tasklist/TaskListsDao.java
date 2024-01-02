package com.kodilla.hibernate.tasklist;

import org.springframework.data.repository.CrudRepository;


import javax.transaction.Transactional;
import java.util.List;

public interface TaskListsDao extends CrudRepository<TaskList, Integer> {
    @Transactional
    List<TaskList> findByListName(String listName);
}
