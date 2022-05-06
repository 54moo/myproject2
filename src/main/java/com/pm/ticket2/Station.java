package com.pm.ticket2;

public class Station {
    /*public static void main(String[] args) {
        List<Station> stations = new ArrayList<>();
        stations.add(new Station(100,"Taipei"));
        stations.add(new Station(200,"Taichung"));
        stations.add(new Station(300,"Kaohsiung"));
    }*/

    public static final Station TAIPEI_CITY = new Station(100,"Taipei");
    public static final Station TAICHUNG_CITY = new Station(200,"Taichung");
    public static final Station KAOHSIUNG_CITY = new Station(300,"Kaohsiung");

    int id;
    String name;
     public Station(int id, String name){
         this.id = id;
         this.name = name;
     }
}
