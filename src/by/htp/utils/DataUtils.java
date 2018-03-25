package by.htp.utils;

import java.util.ArrayList;
import java.util.List;

import by.htp.bean.Divination;

public class DataUtils {

	private DataUtils(){}

	public static Divination getDivination(String type) {

        List<String> answers = new ArrayList<>();

        switch (type) {

            case "Love":
                answers.add("You will found you love!");
                answers.add("Your love is so close!");

                return new Divination("Love", answers);

            case "Work":
                answers.add("You will rise your salary!");
                answers.add("You will hardworking and got the prize!");

                return new Divination("Work", answers);

            case "Success":
                answers.add("Success following you!");
                answers.add("You will get a happy moment today!");

                return new Divination("Success", answers);

            default:
                throw new RuntimeException("'" + type + "' is unsupported divination type!");
        }
    }

}