package com.brianxia.lintcode;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author xiadong
 */
public class AddOperator653 {


    static  ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");

    public void addOperators(String add,String num, int target,Set<String> ret) {

        if(num.isEmpty()){
            // write your code here

            try{
                Integer result = (Integer) jse.eval(add);
                if(result == target)
                    ret .add(add);
            }catch (Exception e){

            }

            return;
        }

        String left = num.length() == 0 ? "" : num.substring(0,1);
        String right = num.length() == 1 ? "": num.substring(1,num.length());
        addOperators(add.length()==0 ? left : add + "+" + left,right,target,ret);
        addOperators(add.length()==0 ? left : add + "-" + left,right,target,ret);
        addOperators(add.length()==0 ? left : add + "*" + left,right,target,ret);
    }


    public List<String> addOperators(String num, int target) {

        Set<String> set = new HashSet<String>();
        addOperators("",num,target,set);

        List <String> ret = new ArrayList<String>();
        ret.addAll(set);
        return ret;
    }

    public static void main(String[] args) {

        AddOperator653 test = new AddOperator653();
        List<String> ret = test.addOperators("3456237490",9191);
        System.out.println(ret);

    }

}
