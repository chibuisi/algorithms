package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringTokenizer {
    public static void main(String[] args) {
        String str = "{\"id\":\"123\",\"address\":{\"state\":\"AZ\"}}";
        Class<?> classType = Student.class;
        Student stu = (Student) deserializeString(str,classType);
        FileLogger.info(stu.toString());
        System.out.println(stu);
    }

    public static <T> Object deserializeString(String str, Class<?> classType) {
        ObjectMapper objectMapper = new ObjectMapper();
        Object cls = null;
        if(validateString(str)){
            try {
                cls = (Object) objectMapper.readValue(str,classType);
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return cls;
    }

    private static boolean validateString(String str) {
        boolean valid = true;
        try {
            JsonParser parser = new JsonParser();
            parser.parse(str);
        }
        catch (JsonSyntaxException e){
            valid = false;
            throw new JsonSyntaxException("String not valid" + e.getMessage());
            //throw e;
        }
        return valid;
    }

    private static boolean validateParenthesis(String str){
        String inputOne = "{";
        String inputTwo = "}";
        Stack<Character> charStack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(inputOne.contains(c+"")){
                charStack.push(c);
            }
            else {
                if(inputTwo.contains(c+"")){
                    if(!charStack.empty() && charStack.peek() == inputOne.charAt(0)){
                        charStack.pop();
                    }
                    else
                        return false;
                }
            }
        }
        return charStack.empty();
    }
}
