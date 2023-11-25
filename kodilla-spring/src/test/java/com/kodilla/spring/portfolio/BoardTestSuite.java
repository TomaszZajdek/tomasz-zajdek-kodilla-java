package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //when
        board.getDoneList().addTasks("done");
        board.getToDoList().addTasks("todo");
        board.getInProgressList().addTasks("inprog");
        //then
        Assertions.assertEquals("done", board.getDoneList().getTasks().get(0));
        Assertions.assertEquals("todo", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("inprog", board.getInProgressList().getTasks().get(0));


    }
}
