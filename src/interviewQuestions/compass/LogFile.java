package interviewQuestions.compass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogFile {


    public static void main(String[] args) {

        List<Log> logs=getLogList();
        getLogs(logs);

    }

    private static List<Log> getLogList() {
        List<Log> list=new ArrayList<>();
        Log log=new Log("58523", "user_1", "resource_1");
        Log log1=new Log("62314", "user_2", "resource_2");
        Log log2=new Log("54001", "user_1", "resource_3");
        Log log3=new Log("200", "user_6", "resource_5");
        Log log4=new Log("215", "user_6", "resource_4");

        Log log5=new Log("54060", "user_2", "resource_3");
        Log log6=new Log("53760", "user_3", "resource_3");
        Log log7=new Log("58522", "user_22", "resource_1");
        Log log8=new Log("53651", "user_5", "resource_3");
        Log log9=new Log("2", "user_6", "resource_1");

        Log log10=new Log("100", "user_6", "resource_6");
        Log log11=new Log("400", "user_7", "resource_2");
        Log log12=new Log("100", "user_8", "resource_6");
        Log log13=new Log("54359", "user_1", "resource_3");

        list.add(log);
        list.add(log1);
        list.add(log2);
        list.add(log3);
        list.add(log4);
        list.add(log5);
        list.add(log6);
        list.add(log7);
        list.add(log8);
        list.add(log9);
        list.add(log10);
        list.add(log11);
        list.add(log12);
        list.add(log13);

        return list;

    }


    private static void getLogs(List<Log> logList)
    {
        Map<String,Integer[]> map=new HashMap<>();
        for (Log logs:logList)
        {
            String userId=logs.userId;
            Integer time= Integer.valueOf(logs.time);
            String resourceId=logs.resourceId;
            if(!map.containsKey(userId))
            {
                Integer[] timeArray=new Integer[2];
                timeArray[0]=time;
                timeArray[1]=time;
                map.put(userId,timeArray);

            }else{
                Integer timeArray[]=map.get(userId);
                if(time<timeArray[0])
                    timeArray[0]=time;
                else if(time>timeArray[1])
                    timeArray[1]=time;
                map.put(userId,timeArray);
            }
        }

        for (Map.Entry<String,Integer[]> maps:map.entrySet())
        {
            System.out.println(maps.getKey()+" = [ "+maps.getValue()[0]+" "+maps.getValue()[1]+" ]");
        }

    }


}

class Log{
    String time,userId,resourceId;
    public Log(String time,String userId,String resourceId)
    {
        this.time=time;
        this.resourceId=resourceId;
        this.userId=userId;
    }

}


