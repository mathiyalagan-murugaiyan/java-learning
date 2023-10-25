
package programming_class;


class Students implements Comparable<Student>{
    int rollno;
    String name;
    int age;

    public Students(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return rollno + " " + name + " " + age;
    }

	@Override
	public int compareTo(Student o) {
		return age> o.age?1:-1;
        
	       // return rollno>o.rollno?1:-1;
	        
	    	//return name.compareTo(o.name)
	}

}


