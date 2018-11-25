package com.arangodb.intellij.aql.ui;

import com.arangodb.intellij.aql.model.ArangoDbServer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataWindowStateTest {

    private DataWindowState state;

    @Before
    public void setUp() {
        state = new DataWindowState();
    }

    @Test
    public void testState() {
        final String user = "testUser";
        state.loadState(new ArangoDbServer(user, "testPassword", "localhost"));
        final ArangoDbServer savedState = this.state.getState();
        assertEquals(savedState.getUser(), user);
    }
}