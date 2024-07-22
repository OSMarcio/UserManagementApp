package com.marciosilva.exercises;

import com.marciosilva.exercises.models.User;
import com.marciosilva.exercises.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetAllUsers() {
        List<User> users = userService.getAllUsers();
        assertNotNull(users);
        System.out.println("Number of users: " + users.size());
    }

    @Test
    public void testGetMockUsers() {
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        Mockito.when(userService.getAllUsers()).thenReturn(Collections.singletonList(user));

        List<User> users = userService.getAllUsers();
        assertEquals(1, users.size());
        assertEquals("John Doe", users.get(0).getName());
    }

}
