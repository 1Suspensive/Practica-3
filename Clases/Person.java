package Clases;

public class Person {
    private String name;
    private long id;

    public Person(String name, long id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public long getId(){
        return id;
    }

    public int calculateKey(){
        String[] temp = (String.valueOf(id)).split("");
        int key = 0;
        for(int i = 0;i<temp.length;i++){
            key = key + Integer.parseInt(temp[i]);
        }
        return key;
    }
}
