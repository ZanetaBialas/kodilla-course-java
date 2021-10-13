package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class BoardTestSuite {

    @Test
    void testTaskMaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.getTasks().add("To do list.");
        inProgressList.getTasks().add("In progress list.");
        doneList.getTasks().add("Done list.");

        //Then
        assertEquals(toDoList.getTasks().get(0), "To do list.");
        assertEquals(inProgressList.getTasks().get(0), "In progress list.");
        assertEquals(doneList.getTasks().get(0), "Done list.");
    }
}
