public class RealEstateAgentProxy {
    private Apartment[] array;
    private boolean[] isRented;
    private int noApartments;

    public RealEstateAgentProxy() {
        array = new Apartment[100];
        isRented = new boolean[100];
        noApartments = 0;
    }

    public void represent(Apartment apartment) {
        array[noApartments] = apartment;
        isRented[noApartments] = false;
        noApartments++;
    }

    public Apartment rent(Student student) {
        if (student.getName().startsWith("P") == true)
            return null;
        int position = -1;
        for (int i = 0; i < noApartments; i++) {
            if (position == -1) {
                if (isRented[i] == false && student.getMoney() <= array[i].getMonthlyRentCost()) {
                    position = i;
                }
            } else if (isRented[i] == false && array[position].getMonthlyRentCost() > array[i].getMonthlyRentCost()) {
                position = i;
            }
        }
        if (position == -1)
            return null;
        else {
            isRented[position] = true;
            return array[position];
        }
    }
}
