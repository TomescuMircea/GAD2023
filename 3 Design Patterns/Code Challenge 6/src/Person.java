public class Person {
    private String name;
    private String job;
    private String university;
    private int drivingLicese;
    private boolean isMaried;

    private Person(Builder builder) {
        this.name=builder.name;
        this.job=builder.job;
        this.university=builder.university;
        this.drivingLicese= builder.drivingLicese;;
        this.isMaried=builder.isMaried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicese=" + drivingLicese +
                ", isMaried=" + isMaried +
                '}';
    }

    public static class Builder {
        private String name;
        private String job="Computer Engineer";
        private String university="UAIC";
        int drivingLicese=871321546;
        boolean isMaried=false;

        public Builder(String name) {
            this.name=name;
        }
        public Person build(){
            return new Person(this);
        }

        public Builder setName(String name) {
            this.name=name;
            return this;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setDrivingLicese(int drivingLicese) {
            this.drivingLicese = drivingLicese;
            return this;
        }

        public Builder setMaried(boolean maried) {
            isMaried = maried;
            return this;
        }
    }
}
