public class Main {
    public static void main(String[] args){
        Person.Builder builder=new Person.Builder("Ion")
                .setJob("IT")
                .setMaried(false)
                .setDrivingLicese(124563987)
                .setUniversity("UAIC");
        Person pers=builder.build();
        System.out.println(pers);
    }
}
