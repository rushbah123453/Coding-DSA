package interviewQuestions.PegaSystems;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// You have a single node system hosting a web site
// Every time a page is visited, the onPageVisit(page) method is called
// Your task is to count the number of visits for each page
// No need to persist data

//Think about implementing in a multithreading way
//You need to use ConcurrentHashMap instead of hashMap
//Also think about how to put correct value in the map
class PageVisitCounter {
    Map<String, Long> pageVisitMap = new ConcurrentHashMap<>();

    public synchronized void onPageVisit(String page) {
        // implement
        pageVisitMap.put(page, pageVisitMap.getOrDefault(page, 0L) + 1);
    }

    public long getPageVisits(String page) {
        // implement
        return pageVisitMap.get(page);
    }
}

public class Solution {
}

/*
High level design question

    Design a service with the following functionality

        - any user can start a new chat
        - user can send messages to the chat
        - user can subscribe to the chat: user will receive all the messages sent to the chat
        - many users can send/subscribe to the same chat


        Expected questions:

        - How long messages are stored on the server
        - Is there a limit of users that can subscribed to a chat
        - What is the allowed delay to receive message from a subscribed chat

 */