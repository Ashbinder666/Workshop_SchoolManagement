package se.lexicon.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp(){
        student = new Student( "Thomas", "Test@test.com", "None at none, Stockholm");

    }

    @Test
    void testConstructor(){
        // Arrange

        // Act
        String name = student.getName();
        String email = student.getEmail();
        String address = student.getAddress();

        // Assert
        assertEquals("Thomas", name, "name incorrect");
        assertEquals("Test@test.com", email, "email incorrect");
        assertEquals("None at none, Stockholm", address,"address incorrect" );

    }

}