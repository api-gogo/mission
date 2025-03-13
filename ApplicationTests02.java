package com.ohgiraffers.d_activity.mission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTests02 {

    @Test
    public void DayCheck() {
        int[] input = {1,3,5,8};
        String value = MyAnswer.DayOfWeekPrint(input);

        String result = "Monday, Wednesday, Friday, Unknown";
        Assertions.assertEquals(result, value, "결과 값은 \"Monday, Wednesday, Friday, Unknown\" 여야 합니다.");
    }
}
