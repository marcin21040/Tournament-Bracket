package org.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest
{
    klasa app = new klasa(3);

    @Before
    public void init()
    {
        app.generuj();
    }
    @Test
    public void test1()
    {
        int[] wyniki = {1,8,5,4,3,6,7,2};
        for (int i = 0; i < wyniki.length; i++) {
            assertEquals(wyniki[i], app.pary[2][i]);
        }
    }
    @Test
    public void test2()
    {
       for(int w=0;w<app.pary.length;w++)
       {
           for(int k=0;k<app.pary[w].length;k=k+2)
           {
               assertEquals(app.pary[w].length +1,app.pary[w][k]+app.pary[w][k+1]);
           }
       }
    }
    @Test
    public void test3()
    {
        assertArrayEquals(new int[]{1,8,5,4,3,6,7,2},app.pary[2]);
    }
}