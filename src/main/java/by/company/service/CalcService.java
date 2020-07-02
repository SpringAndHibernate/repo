package by.company.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public double calculate(double a,double b, String operation) {
        double result = 0;

        switch (operation){
            case ("sum") :
                result = sum(a,b);
                break;
            case ("sub") :
                result = sub(a,b);
                break;
            case ("mult") :
                result = mult(a,b);
                break;
            case ("div") :
                result = div(a,b);
                break;
        }
        return result;
    }

    private static double sum(double a,double b){
        return a+b;
    }

    private static double sub(double a,double b){
        return a-b;
    }

    private static double mult(double a,double b){
        return a*b;
    }

    private static double div(double a,double b){
        return a/b;
    }
}
