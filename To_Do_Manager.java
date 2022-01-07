# jnavno
//personal projects
import java.time.LocalTime; // import the LocalTime class to use

public class Task implements Comparable<Task> {
    private LocalTime dueTime;//CREATING THE localtime-type FIELD CALLED DUE TIME
    private String description;//creating the string-type field called description

    public Task (LocalTime dueTime, String description) {
        this.dueTime = dueTime;//constructor method sets the fields into memory
        this.description = description;
    }

    public LocalTime getDueTime () {
        return dueTime;//accessor method to get the dueTime value
    }

    public int compareTo (Task o) {//method to compare local time to due time
        //takes an object of type task
        return o.getDueTime().compareTo (dueTime);//   
    }
    
    public String toString () {//the most famous method of all times 
        //and I don't understand it yet!
       String result = "Task: ";
       result += "due at " + dueTime.toString();
       result += " - " + description;
       return result;
    }
    
    // -- simple test of PriorityQueue and task
    public static void main (String[] args) {
     // Simple TODO manager as a priority queue
     PriorityQueue<Task> todo = new PriorityQueue<Task> ();
     
     todo.insert( new Task(LocalTime.of(9,00), "Leave for work") );
     todo.insert( new Task(LocalTime.of(11,30), "Meeting with tutor") );
     todo.insert( new Task(LocalTime.of(10,00), "Call bank") );
     todo.insert( new Task(LocalTime.of(16,00), "Finish essay") );
     todo.insert( new Task(LocalTime.of(13,00), "Remember lunch") );
     
     // get next task
     System.out.println ("Next task is: " + todo.takeNext());
     
    }
}
