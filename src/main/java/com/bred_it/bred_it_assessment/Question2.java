package com.bred_it.bred_it_assessment;

import java.util.Arrays;
import java.util.List;

public class Question2 {
    public String process(List<String> list, int col) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        for (int i = 0; i < list.size(); i += col) {
            builder.append("<tr>");
            for (int j = 0; j < col; j++) {
                if (i + j < list.size())
                    builder.append("<td>").append(list.get(i + j)).append("</td>");
                else
                    builder.append("<td></td>");
            }
            builder.append("</tr>");
        }
        builder.append("</table>");
        return builder.toString();
    }
}
