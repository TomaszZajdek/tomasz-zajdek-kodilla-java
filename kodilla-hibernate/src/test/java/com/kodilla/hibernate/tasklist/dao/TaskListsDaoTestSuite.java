package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListsDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListsDaoTestSuite {
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String LISTNAME = "Test list";

    @Autowired
    private TaskListsDao taskListsDao;
    @Test
    void testTaskListDaoFindByListName() {
        //given
        TaskList taskList = new TaskList(DESCRIPTION, LISTNAME);
        taskListsDao.save(taskList);
        int id = taskList.getId();
        //when
        List<TaskList> retrivedLists = taskListsDao.findByListName(LISTNAME);
        //then
        Assertions.assertEquals(1, retrivedLists.size());
        //cleanUp
        taskListsDao.deleteById(id);
    }
}
