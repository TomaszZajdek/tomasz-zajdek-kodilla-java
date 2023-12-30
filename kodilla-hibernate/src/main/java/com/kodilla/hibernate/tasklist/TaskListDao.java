package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;


import javax.transaction.Transactional;
import java.util.List;

public interface TaskListDao extends CrudRepository<TaskList, Integer> {
@Transactional
List<TaskList> findByListName(String listName);
}
