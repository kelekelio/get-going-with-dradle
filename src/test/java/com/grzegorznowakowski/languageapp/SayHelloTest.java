package com.grzegorznowakowski.languageapp;

import java.io.IOException;
import org.junit.jupiter.api.Test;

public class SayHelloTest {

    @Test
    void testSayHello() throws IOException {
        SayHello.main(new String[]{"en"});
    }
}
