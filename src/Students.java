import java.util.*;

public class Students {
    public class Classroom {
        public Set<String> studentIds;

        public Classroom() {
            studentIds = new HashSet<>();
        }

        public void addStudentId(String id) {
            if (studentIds.add(id)) {
                System.out.println("Estudiante ID " + id + " agregado.");
            } else {
                System.out.println("Estudiante ID " + id + " ya existe");
            }
        }

        public void displayStudentIds() {
            Iterator<String> iterator = studentIds.iterator();
            while (iterator.hasNext()) {
                System.out.println("Estudiante ID: " + iterator.next());
            }
        }
    }
}


