package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int [] t1 = {12, 50};
    int [] t2 = {10, 12};
    Time time1 = new Time();
    Time time2 = new Time();
    Time time3 = new Time();
    @Test
    void zeit() {
        String [] actual = time1.zeit(t1[0], t1[1]);
        String [] expected = {Integer.toString(t1[0]), ":", Integer.toString(t1[1])};
        assertEquals(actual[0], expected[0]);
        assertEquals(actual[1], expected[1]);
        assertEquals(actual[2], expected[2]);

    }

    @org.junit.jupiter.api.Test
    void zeitaddieren() {
        String [] actual = time1.zeitaddieren(time2, time3);

        int addier_std = time2.std1 + time3.std2;
        int addier_min = time2.mint1 + time3.mint2;

        while(addier_min>59){
            addier_min = addier_min -60;
            addier_std++;
        }
        String [] new_time = new String[3];
        new_time[0]=Integer.toString(addier_std);
        new_time[1]=":";
        new_time[2]=Integer.toString(addier_min);

        assertEquals(actual[0], new_time[0]);
        assertEquals(actual[1], new_time[1]);
        assertEquals(actual[2], new_time[2]);
    }
}