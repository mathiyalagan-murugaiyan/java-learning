package programming_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
	
	    public static void main(String[] args) {
	        List<Students> list = new ArrayList<>();

	        list.add(new Students(1, "mathi", 25));
	        list.add(new Students(3, "selvam", 24));
	        list.add(new Students(2, "arun", 27));
	        list.add(new Students(4, "jack", 26));

	        Collections.sort(list,(i,j)->i.name.compareTo(j.name));
	      //  Collections.sort(list,(i,j)->i.age>j.age?1:-1);
	      //  Collections.sort(list,(i,j)->i.rollno>j.rollno?1:-1);
	        for (Students s : list) {
	            System.out.println(s);
	        }
	    }
	}

