package interviewQuestions.booking;
/*
ip:
{
	"checkin" : 176,
	"checkout" : 178,
	"features" : ["breakfast"]
	"rooms"    : 1

}

op:
[
	{
		"price" : 250,
		"features" : ["breakfast"],
		"availbility" : 1
	},
	{
		"price" : 260,
		"features" : ["breakfast", "refundable"],
		"availbility" : 3
	}
]

source:

{

	176 : 	[
				{
					"price" : 120,
					"features" : ["breakfast", "refundable"],
					"availbility" : 5
				}
			],
	177 : 	[
				{
					"price" : 130,
					"features" : ["breakfast"],
					"availbility" : 1
				},
				{
					"price" : 140,
					"features" : ["breakfast", "refundable", "wifi"],
					"availbility" : 3
				}
			],
	178 : 	[
				{
					"price" : 130,
					"features" : ["breakfast"],
					"availbility" : 2
				},
				{
					"price" : 140,
					"features" : ["breakfast", "refundable", "wifi"],
					"availbility" : 10
				}
			]
}
 */

import java.lang.reflect.Array;
import java.util.*;

public class HotelBooking {
    public static void main(String[] args) {
       // System.out.println(getDataSource().toString());

        Set<String> features=new HashSet<>();
        features.add("Breakfast");
        Filter filter=new Filter(176,178,features,1);
        List<Room> roomList=getRooms(getDataSource(),filter);
        System.out.println(roomList.toString());
    }

    private static List<Room> getRooms(Map<Integer, List<Room>> dataSource, Filter filter) {
        int checkin=filter.checkin;
        int checkout=filter.checkout;
        int availabilty=filter.rooms;
        Set<String> featuresFilter=filter.features;

        List<Room> startDateRoom=dataSource.get(checkin);

        List<Room> roomList=new ArrayList<>();
        for (Room room:startDateRoom)
        {
            if(suitable(featuresFilter,room.features))
            addCommonRooms(dataSource,checkin,checkout,room.availability,featuresFilter,room.features,0,roomList);
        }
        return roomList;

    }

    private static boolean suitable(Set<String> featuresFilter, Set<String> features) {
        for (String feature:featuresFilter)
        {
            if(!features.contains(feature))
                return false;
        }
        return true;
    }

    private static void addCommonRooms(Map<Integer, List<Room>> dataSource, int checkin, int checkout, int availabilty, Set<String> featuresFilter, Set<String> features, int price, List<Room> roomList) {

        if(checkin==checkout)
        {
            Room room=new Room();
            room.features=features;
            room.availability=availabilty;
            room.price=price;
           // System.out.println(room.toString());
            roomList.add(room);
            return;
        }

        List<Room> nextdayRoom=dataSource.get(checkin);

        for (Room nextDay:nextdayRoom)
        {
            if(suitable(features,nextDay.features))
            {
                price+=nextDay.price;
                int new_availabilty=Math.min(availabilty,nextDay.availability);
                Set<String> new_features=commonFeatures(featuresFilter,nextDay.features);
                addCommonRooms(dataSource,checkin+1,checkout,new_availabilty,features,new_features,price,roomList);
                price-=nextDay.price;
            }
        }



    }

    private static Set<String> commonFeatures(Set<String> featuresFilter, Set<String> features) {

       Set<String> set=new HashSet<>(featuresFilter);
        Set<String> set1=new HashSet<>(features);
        System.out.println(features.toString()+ "###"+featuresFilter.toString());
           set.retainAll(set1);
           return set;
        //System.out.println(features.toString());
        //return commonFeatures;
    }

    public static Map<Integer,List<Room>> getDataSource()
    {
        Room room1=new Room(120,5);
        room1.features.addAll(Arrays.asList("Breakfast","Refundable"));
        Room room2=new Room(130,1);
        room2.features.add("Breakfast");
        Room room3=new Room(140,3);
        room3.features.addAll(Arrays.asList("Breakfast","Refundable","Wifi"));
        Room room4=new Room(130,2);
        room4.features.add("Breakfast");
        Room room5=new Room(140,10);
        room5.features.addAll(Arrays.asList("Breakfast","Refundable","Wifi"));

        List<Room> room176=new ArrayList<>();
        room176.add(room1);

        List<Room> room177=new ArrayList<>();
        room177.add(room2);
        room177.add(room3);

        List<Room> room178=new ArrayList<>();
        room178.add(room4);
        room178.add(room5);

        Map<Integer,List<Room>> map=new HashMap<>();
        map.put(176,room176);
        map.put(177,room177);
        map.put(178,room178);
        return map;


    }

}
class Room{
    int price;
    Set<String> features;
    int availability;
    public Room(int price,int availability){
        this.price=price;
        this.availability=availability;
        this.features=new HashSet<>();
    }
    public Room(){}

    @Override
    public String toString() {
        return "\n { price : "+ price+", \n "+"availability : "+availability +", \n"+
                "features : "+features.toString()+" } ";
    }
}

class Filter{
    int checkin;
    int checkout;
    Set<String> features;
    int rooms;
    public Filter(int checkin,int checkout,Set<String> features,int rooms)
    {
        this.checkin=checkin;
        this.checkout=checkout;
        this.features=features;
        this.rooms=rooms;
    }
}