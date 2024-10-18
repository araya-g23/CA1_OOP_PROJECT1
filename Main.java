package org.example;

import java.io. * ;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String fileName = "titanic-data-100.csv"; // file should be in the project folder (below pom.xml)

        ArrayList<Passenger> passengerList= new ArrayList<>();

        loadPassengerDataFromFile( passengerList, fileName);

        displayAllPassengers( passengerList );

        // Assignment: Implement and test the following methods

//        getPassengerNames();
        System.out.println("Q1");
        System.out.println(Arrays.toString(getPassengerNames(passengerList)));
//        getPassengersContainingNames();
        System.out.println("Q2");
        String names="Dean";
        System.out.println(getPassengersContainingNames(passengerList,names));
//        getPassengersOlderThan();
        System.out.println("Q3");
        int ages=60;
        System.out.println(getPassengersOlderThan(passengerList,ages));
//        countPassengersByGender();
        System.out.println("Q4");
        String gender="male";
        System.out.println(countPassengersByGender(passengerList,gender));
//        sumFares();
        System.out.println("Q5");
        System.out.printf("Sum=  %.2f $",sumFares(passengerList));
//        maleSurvivors();
        System.out.println("\nQ6");
        System.out.println(maleSurvivors(passengerList));
//        ticketOwner();
        System.out.println("Q7");
        String ticket="113803";
        System.out.println(ticketOwner(passengerList,ticket));
//        averageAge();
        System.out.println("Q8");
        System.out.printf("average age of all passengers is %.2f",averageAge(passengerList));
//        getPassengersByTicketClass();
        System.out.println("\nQ9");
        PassengerClass passengerClass=PassengerClass.FIRST;
        System.out.println(getPassengersByTicketClass(passengerList,passengerClass));
//        sortPassengersByPassengerId()
        System.out.println("Q10");
        System.out.println(sortPassengersByPassengerId(passengerList));
//        sortPassengersByName();
        System.out.println("Q11");
        System.out.println(sortPassengersByName(passengerList));
//        sortPassengersByAgeThenName();
        System.out.println("Q12");
        System.out.println(sortPassengersByAgeThenName(passengerList));
//        sortPassengersByGenderThenPassengerNumber()
        System.out.println("Q13");
        System.out.println(sortPassengersByGenderThenPassengerNumber(passengerList));
//        sortPassengersByFareThenSurvival();
        System.out.println("Q14");
        System.out.println(sortPassengersByFareThenSurvival(passengerList));
//        sortPassengersByTicketClass()
        System.out.println("Q15");
        System.out.println(sortPassengersByTicketClass(passengerList));
//        sortPassengersByAge();
        System.out.println("Q16");
        System.out.println(sortPassengersByAge(passengerList));
//        sortPassengersByTicketNumberLambda();
        System.out.println("Q17");
        System.out.println(sortPassengersByTicketNumberLambda(passengerList));
//        sortPassengersByTicketNumberStatic();
        System.out.println("Q18");
        System.out.println(sortPassengersByTicketNumberStatic(passengerList));
//        findPassengerByTicketNumber();
        System.out.println("Q19");
        findPassengerByTicketNumber(passengerList);
//        findPassengerByPassengerId();
        System.out.println("Q20");
        findPassengerByPassengerId(passengerList);

















    }
    public static String[] getPassengerNames(ArrayList<Passenger>passengerList){
        String[] passengerNames = new String[passengerList.size()];
        for(int i=0;i<passengerList.size();i++){
            passengerNames[i] = passengerList.get(i).getName();
        }
        return passengerNames;
    }
    public static ArrayList<Passenger> getPassengersContainingNames(ArrayList<Passenger>passengerList, String name){

        ArrayList<Passenger> matches=new ArrayList<>();
        for(int i=0;i<passengerList.size();i++){

            if(passengerList.get(i).getName().contains(name)){

                //matches.get(i).getName();

                matches.add(passengerList.get(i));

            }
        }
        return matches;
    }
    public static ArrayList<Passenger> getPassengersOlderThan(ArrayList<Passenger>passengerList, int age){
        ArrayList<Passenger> ages=new ArrayList<>();
        for(int i=0;i<passengerList.size();i++){
            if(passengerList.get(i).getAge()>age){
                ages.add(passengerList.get(i));
            }
        }
        return ages;
    }
    public static ArrayList<Passenger> countPassengersByGender(ArrayList<Passenger>passengerList, String gender){
        ArrayList<Passenger> genders=new ArrayList<>();

        for(int i=0;i<passengerList.size();i++){
            if(passengerList.get(i).getGender().equalsIgnoreCase(gender)){
                genders.add(passengerList.get(i));
            }

            }
        return genders;

    }
    public static Double sumFares(ArrayList<Passenger>passengerList){
        double fares=0;
        for(int i=0;i<passengerList.size();i++){
            fares += passengerList.get(i).getFare();
        }
        return fares;
    }
    public static ArrayList<String> maleSurvivors(ArrayList<Passenger>passengersList){

      ArrayList<String> survivors=new ArrayList<>();
      for(int i=0;i<passengersList.size();i++){
          if(passengersList.get(i).getGender().equalsIgnoreCase("male")&& passengersList.get(i).getSurvived()==1){

              survivors.add(passengersList.get(i).getName());

          }


      }

      return survivors;

    }
    public static ArrayList<String> ticketOwner(ArrayList<Passenger>passengerList,String TicketNumber){
        ArrayList<String> ticketOwner=new ArrayList<>();
        for(int i=0;i<passengerList.size();i++){
            if(passengerList.get(i).getTicketNumber().equals(TicketNumber)){
                ticketOwner.add(passengerList.get(i).getName());
            }

        }
        return ticketOwner;
    }
    public static double averageAge(ArrayList<Passenger>passengersList){
        double total=0;
        double avg=0;
        for(int i=0;i<passengersList.size();i++){
            total+=passengersList.get(i).getAge();

        }
        avg=total/passengersList.size();
        return avg;
    }
    public static ArrayList<Passenger> getPassengersByTicketClass(ArrayList<Passenger>passengersList, PassengerClass passengerClass){

        ArrayList<Passenger> passengers=new ArrayList<>();
        for(int i=0;i<passengersList.size();i++){
            if(passengersList.get(i).getPassengerClass().equals(passengerClass)){
                passengers.add(passengersList.get(i));
            }
        }
        return passengers;
    }
    public static ArrayList<Passenger> sortPassengersByPassengerId(ArrayList<Passenger>passengerList){
        ArrayList<Passenger> newsort= new ArrayList<>(passengerList);
        Collections.sort(newsort);
        return newsort;
    }
    public static ArrayList<Passenger>sortPassengersByName(ArrayList<Passenger>passengerslist){
        ArrayList<Passenger> newsort= new ArrayList<>(passengerslist);
        Collections.sort(newsort, new Comparator<Passenger>() {
            public  int compare(Passenger passenger1, Passenger passenger2) {
                return passenger1.getName().compareTo(passenger2.getName());
            }
        });
        return newsort;
    }
    public static ArrayList<Passenger> sortPassengersByAgeThenName(ArrayList<Passenger>passengerList){
        ArrayList<Passenger>agethenamelist= new ArrayList<>(passengerList);
        sortPassengersByNameComparator age= new sortPassengersByNameComparator();
        Collections.sort(agethenamelist,age);
        return agethenamelist;
    }
    public static ArrayList<Passenger> sortPassengersByGenderThenPassengerNumber(ArrayList<Passenger>passengerList){
        ArrayList<Passenger>genderthenpassenger= new ArrayList<>(passengerList);
        sortPassengersByGenderThenPassengerNumberComparator gender= new sortPassengersByGenderThenPassengerNumberComparator();
        Collections.sort(genderthenpassenger,gender);
        return genderthenpassenger;
    }
    public static ArrayList<Passenger>sortPassengersByFareThenSurvival(ArrayList<Passenger>passengersList){
        ArrayList<Passenger>farethensurvival=new ArrayList<>(passengersList);
        sortPassengersByFareThenSurvivalComparator fare= new sortPassengersByFareThenSurvivalComparator();
        Collections.sort(farethensurvival,fare);
        return farethensurvival;
    }
    public static ArrayList<Passenger>sortPassengersByTicketClass(ArrayList<Passenger>passengersList){
        ArrayList<Passenger>ticketclass=new ArrayList<>(passengersList);
        sortPassengersByTicketClassComparator ticketClass= new sortPassengersByTicketClassComparator();
        Collections.sort(ticketclass,ticketClass);
        return ticketclass;
    }
    public static ArrayList<Passenger> sortPassengersByAge(ArrayList<Passenger> passengersList){

        Collections.sort(passengersList,new Comparator<Passenger>() {
            public int compare(Passenger passenger1, Passenger passenger2) {
                return Integer.compare(passenger1.getAge(), passenger2.getAge());
            }
        });
        return passengersList;
    }
    public static ArrayList<Passenger> sortPassengersByTicketNumberLambda(ArrayList<Passenger>passengersList){
        ArrayList<Passenger>ticketnumberlambda=new ArrayList<>(passengersList);
        passengersList.sort((Passenger p1, Passenger p2) -> p1.getTicketNumber().compareTo(p2.getTicketNumber()));
        return passengersList;


    }
    public static ArrayList<Passenger>sortPassengersByTicketNumberStatic(ArrayList<Passenger>passengerList){
        ArrayList<Passenger>ticketnumberstatic=new ArrayList<>(passengerList);

        ticketnumberstatic.sort(Passenger::compareByTicketNumber);
        return ticketnumberstatic;
    }
    public static void findPassengerByTicketNumber(ArrayList<Passenger>PassengersList){

        Collections.sort(PassengersList,new sortPassengersByTicketClassComparator());
        Passenger ticketbynumber=new Passenger("", 0, 0, "",
                "", 0, 0, 0,
        "17463", 0, "", "");
        int index= Collections.binarySearch(PassengersList,ticketbynumber, new sortPassengersByTicketClassComparator());

        if(index < 0){
            System.out.println("Passenger not found");

        }
        else{
            System.out.println("Found key " + PassengersList.get(index)+ " at index: " + index);
        }
    }
    public static void findPassengerByPassengerId(ArrayList<Passenger>Passengerlist){

        Collections.sort(Passengerlist);
//        Passenger PassengerId= new Passenger("3" ,0, 0, "",
//                "", 0, 0, 0,
//                "", 0, "", "");
        Passenger PassengerId= new Passenger("2","");
        int index=Collections.binarySearch(Passengerlist,PassengerId);
        if(index < 0){
            System.out.println("Passenger not found");

        }
        else{
            System.out.println("Found key " + Passengerlist.get(index)+ " at index: " + index);
        }
    }



    public static void loadPassengerDataFromFile( ArrayList<Passenger> passengerList, String fileName) {

        // Format of each row of data is:
        // Name,Age,Height(m),GPA  - these heading names are included as the first row in file
        // John Malone,20,1.78,3.55   for example

        // Use a Regular Expression to set both comma and newline as delimiters.
        //  sc.useDelimiter("[,\\r\\n]+");
        // Text files in windows have lines ending with "CR-LF" or "\r\n" sequences.
        // or may have only a newline - "\n"
        // Windows uses CRLF (\r\n, 0D 0A) line endings while Unix just uses LF (\n, 0A).
        //
        try (Scanner sc = new Scanner(new File(fileName))
                .useDelimiter("[,\\r\\n]+"))
        {

            // skip past the first line, as it has field names (not data)
            if(sc.hasNextLine())
                sc.nextLine();   // read the header line containing column titles, but don't use it

            // while there is a next token to read....
            System.out.println("Go...");

            while (sc.hasNext())
            {
                String passengerId = sc.next();    // read passenger ID
                int survived = sc.nextInt();     // 0=false, 1=true
                int passengerClass = sc.nextInt();  // passenger class, 1=1st, 2=2nd or 3rd
                String name = sc.next();
                String gender = sc.next();
                int age = sc.nextInt();
                int siblingsAndSpouses = sc.nextInt();
                int parentsAndChildren = sc.nextInt();
                String ticketNumber = sc.next();
                double fare = sc.nextDouble();
                String cabin = sc.next();
                String embarkedAt = sc.next();

                System.out.println(passengerId +", " + name);

                passengerList.add(
                        new Passenger( passengerId, survived, passengerClass,
                                name, gender, age, siblingsAndSpouses,parentsAndChildren,ticketNumber,
                                fare, cabin, embarkedAt)
                );
            }
        } catch (FileNotFoundException exception)
        {
            System.out.println("FileNotFoundException caught. The file " +fileName+ " may not exist." + exception);
        }
    }

    public static void displayAllPassengers( ArrayList<Passenger> passengerList ) {
        for( Passenger passenger : passengerList)
        {
            System.out.println(passenger);
        }
    }
}