package com.drpicox.bowlingKata;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


public class BowlingGameTest {
    private Game g;

    protected void setUp() throws Exception {
        g = new Game();
    }
    @Test
    public void GutterGame() throws Exception{

        rollMany(20, 0);
        com.drpicox.bowlingKata.Game g=new com.drpicox.bowlingKata.Game();
        for(int i=0; i<20; i++){
            g.roll(0);
        }
        assertThat(g.score(), is(0));
    }

    @Test
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    @Test
    public void testAllOnes(int n, int pins) throws Exception{
        //Test roll game
        for(int i=0;i<20;i++){
            g.roll(1);
        }
        assertThat(g.score(), is(20));
    }



}
