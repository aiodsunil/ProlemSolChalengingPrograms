//// Simple Schedular
//
//// Code a simple shared calendar that can answer the following queries:
//// Notes:
//// - time slots are always on hourly intervals and last one hour.
//// - this problem is about translating requirements into a functional readable OO solution.
//
//// (1) Given a group of people, who can meet for a given time period ?
//// e.g. Who is free from 10AM - 11AM on Monday morning ?
//
//// (2) For a group of people, when is the next time slot they can all meet ?
//// Time slot must start no earlier than 9AM and end no later than 6PM.
//// Time slot must start on the hour, e.g. at 9AM, 10AM, 13:00.
//// Time slot must be within the next week and be a weekday. e.g. MON - FRI.
//
//// ==> adequate solutions given verabally and explained by the candidate for the following.
//
//// (3) Same as (2), but what is the next time slot where the max number of people can meet?
//
//// (4) What are the most popular times of the week for meetings ?
//
//// (5) What are the least popular times of the week for meetings ?
//
//// (6) What people are going to the most meetings ?
//
//// (7) Performance characteristics of the solution.
//
//import java.util.*;
//
//public class InterviewQuestion {
//    public static void main(String[] args) {
//
//    }
//
//     class  SchedularCalendar{
//
//        Calendar calendar;
//        Map<String,List<Date>> meetingSchedule= new HashMap(); //"10 am to 11 am"
// /// tom ,["10 am to 11 am","11 am to 12 am"]
//
//         Boolean   findSlotInCalendar(Date cal,List<AccountPeople>  list) { //["tom","xyz"]
//            for(AccountPeople people:list){
//                 if (meetingSchedule.containsKey(people.name) ){
//                     var listofMeeting= meetingSchedule.get(people.name);
//                 }
//
//
//         }
//
//    }
//
//    class  AccountPeople{
//
//          String name;//"tom"
//          List<Date> meetingTime;
//
//       }
//    }
//}
