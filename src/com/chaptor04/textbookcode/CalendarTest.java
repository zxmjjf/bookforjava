package com.chaptor04.textbookcode;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 课本代码：书籍《java核心技术卷1》P_101
 * @version 1.0 2019-07-14
 * @since version 1.0
 * @author jjf
 * @see <a href="www.horstmann.com/corejava.html">The Core Java home page</a>
 * 功能：根据日期，打印所在月份的日历
 * 聚合对象：DayOfWeek , LocalDate;
 */
public class CalendarTest {
    public static void main(String[] args) {
        /**获取当前时间*/
        LocalDate date = LocalDate.now();
        //2date = date.plusDays(20); //当前时间再加20天所在月份的日历
        int month = date.getMonthValue(); //保存当前月份
        int today = date.getDayOfMonth(); //保留当前日期

        date = date.minusDays(today - 1); //将当前时间改为月初
        DayOfWeek week = date.getDayOfWeek(); //获得date当前时间所对应的星期对象
        int value =week.getValue(); //保存当前星期的值

        /**输出日历的日历头*/
        System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("     "); //五个空格 4 + 1
        }
        /**打印整个月份*/
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.printf("*");
            } else {
                System.out.printf(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }//如果下个月的1号是星期1，则在第36行处的代码以及实现换行，如果不是则换行，即保证这个月打印完都一定要换号

    }
}


