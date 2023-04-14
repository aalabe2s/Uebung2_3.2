public class Time implements TimeIF {
    @Override
    public float zeit(float t) {
     return t;
    }

    @Override
    public float zeit_addieren(Time t1, Time t2, float t1_1, float t2_2) {
       float new_time = t1.zeit(t1_1) + t2.zeit(t2_2);
        return new_time;
    }
}
