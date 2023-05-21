import java.util.ArrayList;
import java.util.List;
public class Teacher implements ObservedSubject{
    List<Observer> students=new ArrayList<Observer>();
    @Override public void register(Observer obj)
    {
        students.add(obj);
    }
    public void teach(String newSubject){
        notifyObservers(newSubject);
    }
    @Override
    public void unregister(Observer obj){
        students.remove(obj);
    }
    @Override
    public void notifyObservers(String message){
        for(var student:students)
        {
            student.update(message);
        }
    }
}
