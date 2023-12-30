package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String LISTNAME = "Test list";

    @Autowired
    private TaskListDao taskListDao;
    @Test
    void testTaskListDaoFindByListName() {
        //given
        TaskList taskList = new TaskList(DESCRIPTION, LISTNAME);
        taskListDao.save(taskList);
        int id = taskList.getId();
        //when
        List<TaskList> retrivedLists = taskListDao.findByListName(LISTNAME);
        //then
        Assertions.assertEquals(1, retrivedLists.size());
        //cleanUp
        taskListDao.deleteById(id);
    }
}
