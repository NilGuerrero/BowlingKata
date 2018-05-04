package com.drpicox.bowlingKata;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class BowlingGameTest {
    @Test
    public void testGutterGame() throws Exception{
        com.drpicox.bowlingKata.Game g=new com.drpicox.bowlingKata.Game();
        for(int i=0; i<20; i++){
            g.roll(0);
        }
        assertThat(g.score(), is(0));
    }



}
